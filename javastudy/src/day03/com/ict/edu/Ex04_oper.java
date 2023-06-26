package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		/* 
		 * 논리연산자 : &&(AND논리곱) , ||(OR논리합), !(NOT논리부정)
		 * 논리연산자의 연산 대상은 boolean statements
		 * 결과도 boolean. 조건식에 사용
		 * 
		 * AND
		 * 주어진 조건들이 모두 True 일때만 결과는 True
		 * AND조건을 이용하면 범위를 지정할 수 있다.
		 * ex.) a>=00 && a<=20 => a는 10부터 20까지
		 *
		 */
		
		int su1 = 10 ; 
		int su2 = 7 ; 
		boolean result ;
		result = (su1 >= 7) && (su2 >= 5) ;		
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 >= 5) ;		
		System.out.println(result);
		
		result = (su1 >= 7) && (su2 <= 5) ;		
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 <= 5) ;		
		System.out.println(result);
		
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		
		
		
		result = ((su1 += 2) > su2) && (su1 == (su2 += 5)) ; //PEMDAS
		System.out.println("결과 : "+ result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		
		
		
		su1 = 10 ;  //change back to o.g. values
		su2 = 7 ; 
		
		result = ((su1 += 2) < su2) && (su1 == (su2 += 5)) ; 
		System.out.println("결과 : "+ result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		/* JAVA OMITS THE PROCESSES WRITTEN AFTER AN ERROR IS OCURRED
		 * In case shown above, su1+=2 occurs; however, su2+=5 does not.
		 * */


		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		
		
		int su3 = 34 ;
		result = su3>=20 && su3<=40 ;
		System.out.println(result) ;
		
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		System.out.println();// BREAK BREAK BREAK BREAK BREAK BREAK BREAK 
		

		// is char c1 lowercase???
		char c1 = 'g' ;
		result = c1 <= 'z' && c1 >= 'a';
		System.out.println(result);
		
		
	}
}



























