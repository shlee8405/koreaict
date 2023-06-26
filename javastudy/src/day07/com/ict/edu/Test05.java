package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
			System.out.println(number3_1 + " / " + number3_2 + " = " +(((int)((number3_1/number3_2)*10))/10.0));
			break;
		default:
			System.out.println("Wrong operator");
		}
		
	}
}
