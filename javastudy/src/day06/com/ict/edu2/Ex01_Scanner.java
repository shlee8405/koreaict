package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		/*  Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		 * 	System.out => 표준 출력장치 (모니터)
		 * 	System.in => 표준 입력장치 (키보드)
		 * 
		 * 	회사에서 제공하는 클래스를 사용하기 위해서 import 를 해야 한다
		 * 
		 * 
		 * */
		
		//java.lang package 안에 존재하는 클래스는 아무런 제약없이 사용가능(import 안함)
		//java.lang package 외에 존재하는 클래스는 무조건 import를 해야 된다. 
		//import 방법은 ctrl+spacebar
		// or ctrl+shift+O
		Scanner scan = new Scanner(System.in);

		System.out.print("이름: ");
		// .next() ; 입력한 내용을 String 으로 처리하는 메서드
		String name = scan.next();
		System.out.println("name is "+name );
		
		System.out.print("나이: ");
		String age = scan.next(); // .next() is input as string
		System.out.println("age is "+(age+1));
				
		System.out.println("나이: ");
		int age2 = scan.nextInt(); // .nextInt() for numbers
		System.out.println("real age is : "+age2);
	
		System.out.println("키 : ");
		double height = scan.nextDouble();
		System.out.println("height is : " + height);
		
				
	}
}














