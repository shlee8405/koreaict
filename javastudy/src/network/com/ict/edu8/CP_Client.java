package network.com.ict.edu8;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CP_Client extends Thread{
	Socket s;
	CM_Server server;
	// 입출력
	ObjectInputStream in;
	ObjectOutputStream out;
	String ip;
	
	public CP_Client(Socket s, CM_Server server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					VO vo = (VO)obj;
					switch (vo.getCmd()) {
					case 0:  //나가기
						out.writeObject(vo);
						out.flush();
						break esc;
					case 1:  //채팅
						vo.setMsg(ip+":"+ vo.getMsg());
						break;
					case 2:  //그림그리기
						server.picture(vo);
						break;
					}
				}
			} catch (Exception e) {
			}
		}// 무한반복 끝
		//현재 객체를 삭제
		server.removeClient(this);
		try {
			out.close();
			in.close();
			s.close();
		} catch (Exception e) {
		}
	}
}