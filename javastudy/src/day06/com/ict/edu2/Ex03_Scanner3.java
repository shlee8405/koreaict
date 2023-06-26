package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	

		// 나라를 입력하면 수도가 출력되게 하자 //한국-서울, 중국-베이징, 일본-도쿄, 미국-워싱턴, 이외에는 데이터 없음
		System.out.println("나라 입력: ");
		String input = sc.next();
		String output = "";
		switch (input) {
		case "한국":
			output = "서울";
			break;
		case "중국":
			output = "베이징";
			break;
		case "일본":
			output = "도쿄";
			break;
		case "미국":
			output = "워싱턴";
			break;
		default:
			output = "데이터 없음";
		}
		System.out.println(output);
		System.out.println();
		System.out.println();

		// 근무시간이 8시간까지는 시간당 9620이고 // 8시간을 초과한 시간 만큼은 1.5배 지급한다. // 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가? 
		int wage = 9620;

		System.out.println("근무시간 입력");
		int workHour = sc.nextInt();
		output = "";

		if (workHour <= 8)
			System.out.println("받을 금액은 : " + workHour * wage);
		else
			System.out.println("받을 금액은 : " + ((8 * wage) + (int) ((workHour - 8) * (wage * 1.5))));
		System.out.println();
		System.out.println();

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.)
		System.out.println("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		// input = sc.next();
		String input2 = sc.next();
		int mocha = 3500;
		int latte = 4000;
		int americano = 3000;
		int fruit = 3500;
		int initMoney = 10000;

		String output2 = (input2.equals("카페모카")||input2.equals("1")) 
				? "잔돈" + (initMoney - (int) (mocha * 2 * 1.1))
				: (input2.equals("카페라떼")||input2.equals("2")) 
						? "잔돈" + (initMoney - (int) (latte * 2 * 1.1))
						: (input2.equals("아메리카노")||input2.equals("3")) 
								? "잔돈" + (initMoney - (int) (americano * 2 * 1.1))
								: (input2.equals( "과일쥬스")||input2.equals("4")) 
										? "잔돈" + (initMoney - (int) (fruit * 2 * 1.1)) : "Wrong order";
		System.out.println(output2);
	

		
	}
}
