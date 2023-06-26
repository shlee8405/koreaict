package network.com.ict.edu2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) {
		Socket s = null;
		OutputStream out = null;
		InputStream in = null;
		
		try {
			s = new Socket("192.168.0.30",7777);
			System.out.println("클라이언트 연결 성공");
			
			// 입출력 스트림
			out = s.getOutputStream();
			in = s.getInputStream();
			
			// 메세지 전송
			String msg = "(192.168.0.16) \r\n서버에 수신된 데이터 :(102.168.0.44) \r\n서버에 수신된 데이터 :(192.185.0.101)\r\n서버에 수신된 데이터 : \r\n ";
			out.write(msg.getBytes());
			out.flush();
			
			//서버에서 전송된 데이터 수신
			byte[] buff = new byte[100];
			in.read(buff);
			String receive_msg = new String(buff).trim();
			
			System.out.println("에코메시지 : " +receive_msg);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				s.close();
				in.close();
				out.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
