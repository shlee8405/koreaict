package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {	
		/*	while문: for 문과 같은 반복문
		 * 	형식1) 초기식; 
		 * 			while(조건식){
		 * 				조건식이 참이면 실행한 문장;
		 * 				조건식이 참이면 실행한 문장;
		 * 			}
		 * 		while 문의 끝을 만나면 조건식으로 간다.
		 * 
		 * 	형식2) 
		 * 		초기식;
		 * 		while(true) {
		 * 			if(빠저나갈 조건){
		 * 			break;
		 * 			}
		 * 			조건식이 참이면 실행할 문장;
		 * 			조건식이 참이면 실행할 문장;
		 * 			증감식;
		 * 		}
		 * 		while 문의 끝을 만나면 조건식으로 간다.
		 * */
		
		// 1 - 10 까지 출력하자
		
		int num = 1 ;
		while (num < 11) {
			System.out.print(num+"\s");
			num++;
		}
		System.out.println();
		
		do {
			num--;
			System.out.print(num+"\s");
		}
		while (num>1);
		System.out.println();
		
		
		while(true) {
			if(num >= 11) break;
			System.out.print(num+"\s");
			num++;
		}
		System.out.println();
		
		//0~10 짝수
		num = 0;
		while (num<=10) {
			if(num%2==0) {
				System.out.print(num+"\s");
			}
			num++;
		}
		System.out.println();
		
		//구구단 7단
		num = 1;
		while (num<=9) {
			System.out.println("7X"+num+"="+num*7);
			num++;
		}

		//누적합
		num = 1;
		int sum = 0;
		while(num <= 10) {
			sum+=num;
			num++;
		}
		System.out.println(sum);
		System.out.println();

		//4x4 matrix
		num = 1;
		int num2 = 1;
		while(num<=4) {
			while(num2<=4) {
				System.out.print(0+" ");
				num2++;
			}
			num++;
			num2=1;
			System.out.println();		
		}
		
		System.out.println();
		
		//chessboard
		num=1;
		num2=1;
		while(num<=10) {
			while(num2<=10) {

				if((num+num2)%2==0){
					System.out.print(0+"\s");
					num2++;
				}else {
					System.out.print(1+"\s");
					num2++;
				}
			}
			num++;
			num2=1;
			System.out.println();
		}
		
		
	}
}
