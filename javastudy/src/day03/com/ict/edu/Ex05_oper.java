package day03.com.ict.edu;

public class Ex05_oper {
	public static void main(String[] args) {
		/* OR = || = 논리합 = 합집합
		 * 주어진 조건들이 하나라도 true이면 결과는 true
		 * 주어진 조건들 중 true를 만나면 결과는 true
		 * true를 만나면 이후 연산은 하지 않음
		 * */
		int su1 = 10 ;
		int su2 = 7 ;
		boolean result ; 
		
		result = (su1 >= 7) || (su2 >= 5); // since first argument is true, second argument isn't even considered.
		System.out.println("result is "+ result);

		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("result is "+ result);

		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("result is "+ result);

		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("result is "+ result);
		
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
	
		result = ((su1 = su2 + 2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("result is "+ result);
		System.out.println("su1 is "+ su1);
		System.out.println("su2 is "+ su2);
		
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
		System.out.println();//BREAKBREAKBREAKBREAKBREAKBREAK
	
		/* NOT = ! = 논리부정
		 * 주어진 논리값을 반대로 출력
		 * true => false, false => true
		 */
		
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
		
		
		
		
	}

}
