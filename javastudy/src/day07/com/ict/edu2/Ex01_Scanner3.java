package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
//		계속할까요 (1. yes, 2.no)이 때 Ex01_Scanner2는 숫자로 받았는데
//		문자가 들어오면 오류 발생 된다.
//		문자로 받아서 처리하자
		Scanner sc = new Scanner(System.in);

		int countEven = 0;
		int countOdd = 0;
		int flag = 0;
		int count = 0;
		
		esc: 
		while (true) {
			while (flag == 0) {
				count++;
				// 숫자입력, 홀수 or 짝수 output
				System.out.println("숫자입력: ");
				String su = sc.next();
				String str = "";
				if (Integer.parseInt(su) % 2 == 0)
					str = "짝수";
				else
					str = "홀수";
				System.out.println(su + "는 " + str + "입니다.");

				// counter (even or odd)
				if (str == "짝수")
					countEven += 1;
				else
					countOdd += 1;

				// 계속하기 first prompt
				System.out.println("계속할까요?(Y/y, N/n) >>");
				String s1 = sc.next();
				if (s1.equalsIgnoreCase("n")) { 
					flag = 3;
					break;
				} else if (!s1.equalsIgnoreCase("y") && !s1.equalsIgnoreCase("n")) {
					flag = 1;
					break;
				}

			}
			while (flag == 1) {
				// 다시물어보기
				System.out.println("잘못입력했습니다.");
				System.out.println("계속할까요?(1.yes, 2.no) >>");
				String s1 = sc.next();
				if (s1.equalsIgnoreCase("n")) {
					flag = 3;
					break;
				} else if (s1.equalsIgnoreCase("y")) {
					flag = 0;
					break;
				}
			}

			while (flag == 3) {
				// printer
				double per = (countEven / (count * 1.0) * 100);
				System.out.println("전체 횟수: " + count);
				System.out.println("짝수 개수: " + countEven);
				System.out.println("퍼센트 : " + (int) (per * 10) / 10.0 + "%");
				break esc;
			}
		}
	}
}
