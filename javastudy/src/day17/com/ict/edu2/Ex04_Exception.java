package day17.com.ict.edu2;

import java.util.Scanner;

//	throws : 	예외전가, 예외양
//				예외가 발생하면 예외처리를 해야 하지만, 현재 메소드에서는 할 수 없어서 자신을 호출한 곳으
//				예외객체를 전달, 나중에라도 예외처리(try~catch~)를 하는 것이 좋다

public class Ex04_Exception {

	public void setData(String str) {
//		str 길이가 0보다 크면
		if (str.length() >= 1) {
//			str의 첫글자를 추출하자
			String res = str.substring(0, 1);
//			try {
				prnData(res);
				
//			} catch (Exception e) {
//				System.out.println("첫글자는 숫자만 입력하세요");
//			}
		}
	}

	public void prnData(String str) throws NumberFormatException {

//		try {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

//		} catch (NumberFormatException e) {
//			System.out.println("첫글자는 숫자만 입력하세요");
//			sc.next();
//		}
	}

	public static void main(String[] args) {
		Ex04_Exception test = new Ex04_Exception();
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		String msg = sc.next();
//		try {
			test.setData(msg);
//		} catch (NumberFormatException e) {
//			System.out.println("첫글자는 숫자만 입력하세요");
//		}

	}
}
