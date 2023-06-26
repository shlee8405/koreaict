package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable{
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서 버 대 기 중 . . . . . .");
			
			
			new Thread(this).start();
		} catch (Exception e) {
		
		}
	}
	@Override
	public void run() {
		while (true) {
			try {
				s = ss.accept();
				//input
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				String msg = br.readLine();
				//output
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				// BufferedWriter 사용시 System.lineSeparator() 사용해야 된다.
				// Use System.lineSeparator b/c Different OS's has different regex for new line '\n'
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
				System.out.println(msg);
			} catch (Exception e) {
			} finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
				} catch (Exception e2) {
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new EchoServer();
	}
}
