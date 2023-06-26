package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		/*	삼향 연산자 conditional ternary operator
		 * 		조건식 => 조건이 참 일때와 거짓 일때 를 그분해서 실행한다
		 * 
		 *		condition ? expressionIfTrue : expressionIfFalse
		 *
		 *		조건식에는 boolean, 비교연산자, 논리연산자
		 * */
		
		
		boolean chem = false;
		
		String isChem = (chem == true) ? "There is chemistry" : "There is no chemistry" ;
		
		System.out.println(isChem);
		
		System.out.println();
		System.out.println(); //break
		System.out.println();
		
		//int avg = 59 ; 
		double avgDouble = 60.4;
		String str = (avgDouble > 60) ? "햅-격 " : "불합격" ;
		System.out.print(str);
		
		System.out.println();
		System.out.println(); //break
		System.out.println();

		
		char c1 = 'A';
		str = (c1>='a' && c1<='z') ? "소문자" : "소문자 아님" ;
		
		System.out.println(str);
		
		System.out.println();
		System.out.println(); //break
		System.out.println();
		
		int gender = 1 ;
		//str = ( gender == 1 || gender == 3 ) ? "남자" : "여자" ;
		str = ( gender%2 != 0 ) ? "남자" : "여자" ;
		
		System.out.println(str);

		System.out.println();
		System.out.println(); //break
		System.out.println();
		
		int su1 = 157;
		
		str = (su1 % 3 == 0) ? "3의배수" : "not3의배수" ;
		System.out.println(str);
		int k3 = 5 ;
		str = (k3 == 1 || k3 == 3) 
				? (k3 == 1) 
						? "1900년대 남자"
						: "2000년대 남자"
						: (k3 == 2 || k3 == 4) 
							? (k3 == 2) 
								? "1900년대 여자"
								: "2000년대 여자"
								: "foreigner";
		
		
		System.out.println(str);
		
	}

}



