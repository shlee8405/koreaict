package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/*	URL(Uniform Resource Locator) : 인터넷 에서 접근 가능한 자원의 주소
 * 	URL 클래스는 원격 서버의 자원의 결과만을 가져온다.
 * 	final 클래스이므로 상속 안됨
 * */

public class Ex02_URL {
	public static void main(String[] args) {
		// 해당 사이트 가서 정보 읽기
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//내 컴퓨터에 저장
		String pathname = "D:"+File.separator+"shl"+File.separator+"shl01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://movie.daum.net/main");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("경로 : " + url.getPath());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("안내 : " + url.getUserInfo());
			
			// url에서 불러오기
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			// 파일로 저장하기 inputstream -> stringbuffer
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				//	System.out.println(msg+"\n");
				sb.append(msg+'\n');
			}
			// Stringbuffer -> bufferedWriter
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
	
}
