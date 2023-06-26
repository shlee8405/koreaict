package day12.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
		
//		총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
//		이름, 국어, 영어, 수학를 받아서 
//		총점, 평균, 학점, 순위를 구하고 
//		순위 기준으로 오름차순으로 정렬하여 
//		출력하는 main 메서드를 가지는 클래스를 만들어라 
//		단, 처리는 2차원배열을 이용해라

		// 키보드 입력을 위한 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("count ? ");
		int count = sc.nextInt();
		Ex09_Constructor[] arr = new Ex09_Constructor[count] ;

	
		for (int i = 0; i < count; i++) {
			System.out.println("Name of student? ");
			String a = sc.next();
			System.out.println("Kor ? ");
			int x = sc.nextInt();
			System.out.println("Eng ? ");
			int y = sc.nextInt();
			System.out.println("Math ? ");
			int z = sc.nextInt();
			
			
			arr[i] = new Ex09_Constructor(a,x,y,z);
			arr[i].gSum();
			arr[i].gAvg();
			arr[i].gHak();
		}
		
		
		

		//순위
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].getAvg()>arr[j].getAvg()) {
					arr[j].setRank(1);
				}
			}
		}
		//정렬
		Ex09_Constructor tmp = new Ex09_Constructor();		
		
		for (int i = 0; i <= count-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
//		
		for(int i = 0 ; i<count; i++) {
			
			System.out.print("Name : "+ arr[i].getName()+"\t");
			System.out.print("Sum : "+arr[i].getSum()+"\t");
			System.out.print("Avg : "+arr[i].getAvg()+"\t");
			System.out.print("Hak is : "+arr[i].getGrade()+"\t");
			System.out.println("Rank is : " +arr[i].getRank());
				
		}
	}
}
