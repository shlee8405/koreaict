package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex06_method cal = new Ex06_method();
		
//		5명의 이름, 국어, 영어, 수학을 입력 받아서
//			0	1	  2 	3		
//		이름, 총점, 평균, 학점, 순위를 구하고
//			 4	  5    6    7  
//		순위를 기준으로 오름차순 정렬해서 출력 하자
		
		String[][] arr = new String[5][8];
		for (int i = 0; i < arr.length; i++) {
			System.err.println("이름: ?");
			arr[i][0] = sc.next();
			System.err.println("국어 : ?");
			arr[i][1] = sc.next();
			System.err.println("영어 : ?");
			arr[i][2] = sc.next();
			System.err.println("수학 : ?");
			arr[i][3] = sc.next();
		}

//		총점 구하기
		/*for (int i = 0; i < arr.length; i++) {
			arr[i][4] = cal.total(arr, i);
		}*/
		cal.total(arr);
		
//		평균 구하기
		cal.avg(arr);
		
//		학점 구하기
		cal.grade(arr);
		
//		순위 구하기
		for (int i = 0; i < arr.length; i++) {
			arr[i][7] = "1";
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4])<Integer.parseInt(arr[j][4])) {
					arr[i][7] = String.valueOf((Integer.parseInt(arr[i][7]) + 1));
				}
			}
		}
		
//		순위 기준으로 오름차순 
		String[][] newArr = new String[5][8];
		for (int i = 0; i < newArr.length; i++) {
			newArr[Integer.parseInt(arr[i][7])-1] = arr[i];
		}
		
//		출력하기
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(newArr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
