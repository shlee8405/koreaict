package day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ex01_method coffee = new Ex01_method();
		coffee.name = "레쓰비";
		coffee.price = 1000;

		Ex01_method ion = new Ex01_method();
		ion.name = "포카리";
		ion.price = 1500;

		Ex01_method coke = new Ex01_method();
		coke.name = "코카콜라";
		coke.price = 1200;

		Ex01_method juice = new Ex01_method();
		juice.name = "델몬트";
		juice.price = 1800;
		
		Ex01_method cashOut = new Ex01_method();
		cashOut.name = "그만";
		cashOut.price = 0;

		/*
		 * Ex01_method[] arr = new Ex01_method[4]; arr[0] = coffee; arr[1] = ion; arr[2]
		 * = coke; arr[3] = juice;
		 */

		Ex01_method[] arr = { coffee, ion, coke, juice, cashOut};

		System.out.println("금액을 투입하세요 >>> ");
		int input = sc.nextInt();

		// 최소값
		int 최소값 = 0;
		for (int i = 0; i < arr.length; i++) {
			최소값 = 1000;
			
		}

		if (input < 최소값) {
			System.out.println("부족합니다.");
			System.out.println("안녕히가세요");
		} else {
			// 최소값 보다 적으면 에러 출력

			// 입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].name + "\t");
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].price <= input) {
					System.out.print("O" + "\t");
				} else {
					System.out.print("X" + "\t");
				}
			}
			System.out.println();
			System.out.println("선택하세요 >> ");


			int output = input;
			esc:
			while (output >= 최소값) {
				String drink = sc.next();
				switch (drink) {
				case "레쓰비":
					output = output - arr[0].price;
					break;
				case "포카리":
					output = output- arr[1].price;
					break;
				case "코카콜라":
					output = output- arr[2].price;
					break;
				case "델몬트":
					output = output - arr[3].price;
					break;
				case "그만":
					output = output;
					System.out.println("잔돈은 : "+output);
					break esc;
				default:
					System.out.println("잘못선택하셨네요");
					output = output;
				}
				if(drink == "아니요") {
					break;
				}

				System.out.println("잔돈: " + output);
				if(output >=최소값) {
				System.out.println("더 구매하시겠습니까?");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i].name + "\t");
				}
				System.out.println();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].price <= output) {
						System.out.print("O" + "\t");
					} else {
						System.out.print("X" + "\t");
					}
				}
				System.out.println();
				System.out.println("선택하세요 >> ");
				}
			}
			System.out.println("감사합니다. 또 오세요");
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].name);
//			System.out.println(arr[i].price);
//		}
////		System.out.println(coffee.name + " " + coffee.price);
	}
}
