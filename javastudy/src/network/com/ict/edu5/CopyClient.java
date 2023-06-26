package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s; 
	ChatServer server;
	
	BufferedReader in;
	PrintWriter out;
	String ip;
	public CopyClient(Socket s , ChatServer asdf) {
		this.s = s;
		this.server = asdf;
		try {
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(),true);
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if (msg.equals("exit")) {
					//원격에 있는 실제 클라이언트에게 종료 메시지 보냄
					out.println("~~~bye");
					break;
				}
				server.sendMsg(ip + " : " + msg);
			} catch (Exception e) {
			}
		}
		try {
			out.close();
			in.close();
			s.close();
			server.removeClient(this);
			server.sendMsg(ip + "님 퇴장");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
