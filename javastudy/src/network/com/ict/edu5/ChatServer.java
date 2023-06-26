package network.com.ict.edu5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer  {
	ServerSocket ss = null;
	ArrayList<CopyClient> list = null;
	
	public ChatServer() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작");
			exe();
		} catch (Exception e) {
		}
	}
	public void exe() {
		while (true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s,this);
				cc.start();
				list.add(cc);
				sendMsg(" ** " + cc.ip + "님 입장 **");
						
			} catch (Exception e) {
			}
		}
	}

	public void sendMsg(String msg) {
		for (CopyClient k : list) {
			k.out.println(msg);
		}
	}
	
	public void removeClient(CopyClient k) {
		list.remove(k);
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
