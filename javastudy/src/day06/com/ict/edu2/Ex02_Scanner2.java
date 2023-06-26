package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex02_Scanner2 {
	public static void main(String[] args) {
		/*
		 * 키보드 입력정보를 받아서 일 처리하자 키보드에서 받은 숫자가 홀수, 짝수 인지 판별하자
		 */

		// 키보드에서 받은 숫자가 홀수, 짝수 인지 판별
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number! ");

		double inputNum = sc.nextDouble();
		System.out.println("Your number is " + (int) inputNum);

		if ((int) inputNum % 2 == 0)
			System.out.println("And your number is Even.");
		else
			System.out.println("And your number is Odd.");

		
		//총점을 받고, 60이상이면 합격, 이하면 불합격
		
		System.out.println("총점입력: ");
		int inputGrade = sc.nextInt();
		
		if(inputGrade>=60) System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
		
	}
}
