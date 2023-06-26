package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Ex01_Scanner 클래스는 계속할까요? 질문했을때 2이면 탈출하지만
//		2를 제외한 나머지는 무조건 다시 실행 하게 되는 단점이 있다

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
				int su = sc.nextInt();
				String str = "";
				if (su % 2 == 0)
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
				System.out.println("계속할까요?(1.yes, 2.no) >>");
				int s1 = sc.nextInt();
				if (s1 == 2) {
					flag = 3;
					break;
				} else if (s1 != 2 && s1 != 1) {
					flag = 1;
					break;
				}

			}
			while (flag == 1) {
				// 다시물어보기
				System.out.println("잘못입력했습니다.");
				System.out.println("계속할까요?(1.yes, 2.no) >>");
				int s1 = sc.nextInt();
				if (s1 == 2) {
					flag = 3;
					break;
				} else if (s1 == 1) {
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
