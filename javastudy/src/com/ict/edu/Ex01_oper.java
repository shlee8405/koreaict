package com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		// 산술연산자: + - * / %
		int su1 = 9 ; 
		int su2 = 4 ; 
		int result = 0 ;
		
		result = su1 + su2 ;		
		System.out.println("sum is " + result);
		
		result = su1 - su2 ;
		System.out.println("difference is " + result);
		
		result = su1 * su2 ;
		System.out.println("multiplication is " + result);
		
		System.out.println(); //new line

		result = su1 / su2 ; //typical int to float math error
		System.out.println("errorenous div is "+ result);
				
		double res = (double)su1 / su2;
		System.out.println("correct div is " + res);

		res = su1 * 100 / su2  ; //fixing int to float error way #2
		System.out.println("correct div is "+ res/100);
		
		System.out.println(); //new line
		
		result = su1 % su2 ;
		System.out.println("remainder is " + result);
		System.out.println();
		System.out.println();
		System.out.println();
		
	
		
		
		
	}

}
