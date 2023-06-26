package network.com.ict.edu;

import java.net.InetAddress;

//	 InetAddress : 	자바에서 IP 주소를 표현하는 클래스(스태틱)
//					생성자는 존재하지만, 사용하지 않는다.
//					6개의 static 메소드를 이용한다.
//					** localHost란 현재 내가 사용하고 있는 컴퓨터를 말한다.
//					
public class Ex01_InetAddress {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.printf("이름 : %s%n",addr.getHostName());
			System.out.printf("주소 : %s%n",addr.getHostAddress());
			System.out.printf("toString : %s%n%n",addr.toString());
			
			addr = InetAddress.getByName("www.naver.com");
			System.out.printf("이름 : %s%n",addr.getHostName());
			System.out.printf("주소 : %s%n",addr.getHostAddress());
			System.out.printf("toString : %s%n%n",addr.toString());
			
			addr = InetAddress.getByName("m.naver.com");
			System.out.printf("이름 : %s%n",addr.getHostName());
			System.out.printf("주소 : %s%n",addr.getHostAddress());
			System.out.printf("toString : %s%n%n",addr.toString());
			
			byte[] b = {(byte)223, (byte)130, (byte)195, (byte)200};
			addr = InetAddress.getByAddress(b);
			System.out.printf("이름 : %s%n",addr.getHostName());
			System.out.printf("주소 : %s%n",addr.getHostAddress());
			System.out.printf("toString : %s%n%n",addr.toString());
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				addr = InetAddress.getByAddress(b);
				System.out.printf("이름 : %s%n",k.getHostName());
				System.out.printf("주소 : %s%n",k.getHostAddress());
				System.out.printf("toString : %s%n%n",k.toString());
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
