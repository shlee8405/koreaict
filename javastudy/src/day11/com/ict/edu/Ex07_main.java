package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_method calc = new Ex07_method();
		Scanner sc = new Scanner(System.in);
//			5명의 이름, 국어, 영어, 수학을 입력 받아서
//				0	1	  2 	3		
//			이름, 총점, 평균, 학점, 순위를 구하고
//				 4	  5    6    7  
//			순위를 기준으로 오름차순 정렬해서 출력 하자
		System.out.println("How many Students? ");
		int count = sc.nextInt();
		
		String[] name = new String[count];
		int[] kor = new int[count];
		int[] eng = new int[count];
		int[] math = new int[count];
		int[] total = new int[count];
		double[] avg = new double[count];
		String[] grade = new String[count];
		
		
		
		
		for (int i = 0; i < count; i++) {
			System.out.println("Name of student "+ (i+1));
			name[i] = sc.next();
			System.out.println("국어: ");
			kor[i] = sc.nextInt(); 
			System.out.println("영어: ");					
			eng[i] = sc.nextInt();
			System.out.println("수학: ");
			math[i] = sc.nextInt();
			
			calc.getSum(kor[i], eng[i], math[i]);
			total[i] = calc.sum;
			
			calc.getAvg();
			avg[i] = calc.avg;
			
			calc.getGrade();
			grade[i] = calc.grade;
			
		}
		
		for (int i = 0; i < grade.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(grade[i]+"\t\n");
		}
	}
}
