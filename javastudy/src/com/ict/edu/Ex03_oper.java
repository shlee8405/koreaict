package com.ict.edu;

public class Ex03_oper {
	public static void main(String[] args) {
		/* 비교연산자 : >, <, >=(greater or equal to), 
					==(is equal to), !=(not equal to)
		 	비교연산자를 사용하는 자료형은 문자, 정수, 실수
		 	연산 결과는 무조건 boolean으로 나오므로 boolean으로 저장하자 */
		
		int su1 = 90 ;
		int su2 = 80 ;
		boolean bool1 = su1 >= su2 ;		
		
		System.out.println(bool1);
		
		double su3 = 89.999;
		double su4 = 80.0;
		
		bool1 = su1 >= su3 ;
		System.out.println(bool1);    	//int and double comparisons
		
		bool1 = su2 == su4 ;
		System.out.println(bool1);
		
		
		System.out.println();    		//spaces
		System.out.println();
		
		char ch1 = 'z';
		char ch2 = 'b';
		
		boolean bool2 = ch1 >= ch2 ;  	//char comparisons
		System.out.println(bool2);
		bool2 = su1 >= ch2 ;  			//char/int comparisons
		System.out.println(bool2);
	}
}
