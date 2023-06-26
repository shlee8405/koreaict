package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		/*	for문: 정해진 규칙에 따라 실행문을 반복 처리한다
		 * 	형식) 
		 * 		for (statement1 ; statement2 ; statement3) {
		 * 			block of code;
		 * 		}
		 * 
		 *	statement 1 = 초기식. runs first
		 *	statement 2 = 조건식. runs code if statement1 == statement2
		 *	statement 3 = 증감식. runs while statement 2 is true. else not. 
		 *
		 * */
		
		// 안녕하세요를 10번 출력
		
		int n1 = 10;
		String str1 = ""; 
		for (int i=0; i<n1; i++) {
			str1 = "안녕하세요";
			System.out.println(str1+i);
		}
		// 0~10 까지 짝수만 출력
		for (int i=0; i<=n1; i++) {
			if(i%2==0) {
				System.out.print(i+"\s");
			}
		}
		
		System.out.println();
		// 0~10 까지 홀수
		for (int i=1 ; i<=9; i+=2) {
			System.out.print(i+"\s");
		}
		System.out.println();
		//구구단 8단 출력
		for (int i=1; i<10; i++) {
			System.out.print(8*i + "\s");
		}
		
		System.out.println();
		//누적합: 이전저장변수 = 이전저장변수 + 현재값; 
		int sum = 0;
		for (int i = 1 ; i < 11 ; i ++) {
			sum = sum + i;
		}
		System.out.println("누적합"+sum);
		
		//0부터 10까지 짝수의 누적합
		sum = 0;
		for(int i =1; i<11;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("짝수누적합"+sum);
		
		//factorial
		int num2 = 7;
		int res = 1;
		for(int i=1;i<=num2;i++){
			res *= i;
		}
		System.out.println("7 factorial is "+ res);
		
		
		
		

	}
}
