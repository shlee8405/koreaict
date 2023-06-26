package day04.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		/*	중첩 삼항 연산자 : 
		 *	형식) 자료형 변수이름 = (condition1) ? ((condition2) ? expCond2T: expCond2F ): expCond1F ;
		 * 		자료형 변수이름 = (condition1) ? expCond1T : ((condition2) ? expCond2T: expCond2F ) ;
		 * 
		 * 	int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		 * 
		 * */
		
		int k1 = 94;
		
		String str = (k1>=90) ? "A학점" 
								: ((k1>=80) ? "B학점"
												:"F학점");
		System.out.println(str);

		char k2 = 'D';
		
		String str2 = (k2<='Z' && 'A'<=k2 /*k2>='A'*/) ? "caps" 
						: (k2 <= 'z' && k2>='a') ? "lowercase"
								: "extra";
	
		System.out.println(str2);
	
	}
}
