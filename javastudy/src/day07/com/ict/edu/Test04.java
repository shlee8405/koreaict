package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름: ");
		String name = sc.next();
		System.out.println("국어: ");
		double kor = sc.nextDouble();
		System.out.println("영어: ");
		double eng = sc.nextDouble();
		System.out.println("수학: ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		double average = total/3.0;
		double average2 = (int)(average*10)/10.0;
		String grade = "";
		
		if(average2>=90) {
			grade = "A";
		} else if (average2 >=80) {
			grade = "B";
		} else if (average2 >=70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println("이름은:"+name + " 총점은:"+total+" 평균은:"+average2+" 학점은:"+grade);
		System.out.println();
		System.out.println();
	
	}
}
