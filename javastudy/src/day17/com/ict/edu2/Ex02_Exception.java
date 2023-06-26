package day17.com.ict.edu2;

import java.util.InputMismatchException;
import java.util.Scanner;

//	다중Catch	: 예외가 하나가 아니라 여러가지가 발생할 경우 사용
//	주의사항	: Exception을 사용할 경우 반드시 가장 아래 catch 문에 사용

public class Ex02_Exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {

			try {
				int su1 = 50;
				System.out.println("정수 입력 : ");
				int su2 = sc.nextInt();
				System.out.println("정답 : " + (su1 / su2));
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요");
//				sc.next();
				System.out.println();
				// sc = new Scanner(System.in);
//				Scanner sc = sc;
//				sc.close();

			} catch (ArithmeticException e) {
				System.out.println("0으로는 나누기가 안됩니다");
			}
		}

//		System.out.println("수고하셨습니다");
	}
}
