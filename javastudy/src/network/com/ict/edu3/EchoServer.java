package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable {
	Socket s = null ;
	ServerSocket ss = null;
	
	InputStream in = null;
	BufferedInputStream bis = null;
	
	OutputStream out = null;
	BufferedOutputStream bos = null;
	
	
	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 . . . . . . . . . . ");
			new Thread(this).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		while (true) {
			try {
				//요청이 오면 쓰레드로 실행되는 코드
				s = ss.accept();
				
				// 입출력 스트림
				in = s.getInputStream();
				bis = new BufferedInputStream(in);
				
				out = s.getOutputStream();
				bos = new BufferedOutputStream(out);
				
				byte[] b = new byte[1024];
				bis.read(b);
				
				String msg = new String(b).trim();
				String client_ip = s.getInetAddress().getHostAddress();
				
				bos.write(msg.getBytes());
				bos.flush();
				
				
				
				
			} catch (Exception e) {
			} finally {
				try {
					bos.close();
					out.close();
					bis.close();
					in.close();
				} catch (Exception e2) {
				}
			}
			
		}
	
	}
	
	
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
