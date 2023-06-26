package day28.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//	OutputStreamWriter : 바이트 스트림을 문자스트림으로 변경
//	OutputStream => OutputStreamWriter => BufferedWriter(문자스트림)

//	InputStreamReader : 바이트 스트림을 문자스트림으로 변경
//	InputStream => InputStreamReader => BufferedReader

public class Ex02_OutputStreamWriter {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush();
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			bw.write("받은 문자 : " + msg);
			bw.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
	}
	
	
}
