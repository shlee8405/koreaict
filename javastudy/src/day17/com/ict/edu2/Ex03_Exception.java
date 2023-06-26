package day17.com.ict.edu2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_Exception {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int su1 = 50;
			System.out.print("정수 입력 : ");
			int su2 = sc.nextInt();
			System.out.println("정답 : " + (su1 / su2));
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요");
			return;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나누기가 안됩니다");
			return;
		} finally {
			System.out.println("반드시 수행되는 문장");
		}
	}

}
