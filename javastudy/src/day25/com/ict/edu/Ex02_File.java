package day25.com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args) {
		String pathname = "D:/shl/exam01.txt";
		File file = new File(pathname);
		try{
			boolean res= file.createNewFile();
			if(res) {
				System.out.println("파일 생성 성공");
				
			} else {
				System.out.println("파일 생성 실패 (기존에 같은 이름에 파일이 존재)");
			}
			System.out.println();
			System.out.println("절대경로: "+file.getAbsolutePath());
			System.out.println("상대경로: "+file.getPath());
			System.out.println("파일이름: "+file.getName());
			System.out.println();
			
			
			File file2 = new File("D:/shl/EXAM");
//			중간에 하나라도 없으면 만들어지지 않는다 .mkdir
//			boolean res2 = file2.mkdir();
			
//			중간에 디렉토리가 없어도 만들어진다 .mkdirs
			boolean res2 = file2.mkdirs();
			if(res2) {
				System.out.println("디렉토리 생성 성공");
			} else {
				System.out.println("디렉토리 생성 실패 (기존에 같은이름의 디렉토리 존재)");
			}
			
			
		} catch (IOException e) {
			System.out.println("위치가 틀렸습니다");
		}
	}
}
