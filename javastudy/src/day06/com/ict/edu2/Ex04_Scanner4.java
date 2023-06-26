package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		/*System.out.println("원하는 반복 횟수: ");
		int count = sc.nextInt();
		
		System.out.println("원하는 단어 : ");
		String str = sc.next();
		*/
		/*for(int i = 0; i < count; i++) {
			System.out.println(str);
			
		}*/
		
		/*int i = 0;
		while ( i < count) {
			System.out.println(str);
			i++;
		}*/
		
		/*원하는 회수를 입력 받고 
		숫자를 입력 받아서 
		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩*/
		
		System.out.println("How many times? ");
		int count1 = sc.nextInt();
		
		while(count1>0) {
			System.out.println("Ok. Now give me a number: ");
			int num1 = sc.nextInt();
			if(num1%2==0) System.out.println(num1+" is Even");
			else System.out.println(num1+" is Odd");
			count1--;
		}
		
		System.out.println();
		System.out.println();
		/*이름, 국어, 영어, 수학를 입력 받아서 
		총점, 평균, 학점을 구하고 
		이름, 총점, 평균, 학점을 출력하는 코딩 
		(평균은 소숫점 첫째자리까지 구하자)*/

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
		
		if(average>=90) {
			grade = "A";
		} else if (average >=80) {
			grade = "B";
		} else if (average >=70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println("이름은:"+name + " 총점은:"+total+" 평균은:"+average2+" 학점은:"+grade);
		System.out.println();
		System.out.println();
		
		
		/*첫번째 숫자 받기
		두번째 숫자 받기
		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		 * */
		System.out.println("Calculator");
		System.out.println("Number 1: ");
		double number3_1 = sc.nextDouble();
		System.out.println("Number 2: ");
		double number3_2 = sc.nextDouble();
		System.out.println("Operator: ");
		String operator3_1 = sc.next();
				
		switch (operator3_1) {
		case "+":
			System.out.println(number3_1 + " + " + number3_2 + " = " +(number3_1+number3_2));
			break;
		case "-":
			System.out.println(number3_1 + " - " + number3_2 + " = " +(number3_1-number3_2));
			break;
		case "*":
			System.out.println(number3_1 + " * " + number3_2 + " = " +(number3_1*number3_2));
			break;
		case "/":
			System.out.println(number3_1 + " / " + number3_2 + " = " +(number3_1/number3_2));
			break;
		default:
			System.out.println("Wrong operator");
		}
		
		
		
	}
}
