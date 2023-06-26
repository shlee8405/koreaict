package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		/*		do~ while문 : while 문과 같은 반복문
		 * 					단, 먼저 실행후 조건식이 붙는다.
		 * 		형식) 
		 * 			초기식:
		 * 			do{
		 * 				실행문;
		 * 				증감식;
		 * 			}while(조건식);
		 * 
		 * */
		
		
		//0-10까지 출력
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		
		System.out.println();
		//0-10 홀수
		i = 1 ;
		do {
			if(i%2!=0) System.out.println(i);
			i++;
		} while(i<=10);
		System.out.println();
		
		//7단 출력
		i = 1;
		int j = 7;
		do {
			System.out.println(j + " x " + i + " = " +i*j);
			i++;
		}while(i<10);
		System.out.println();
		
		//0~10 홀수의 누적합
		
		i = 0;
		int sum = 0;
		do {
			if(i%2!=0) sum+=i;
			i++;
		} while (i<=10);
		System.out.println(sum);
	
	}
}
