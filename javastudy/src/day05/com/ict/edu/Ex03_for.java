package day05.com.ict.edu;

public class Ex03_for {
	public static void main(String[] args) {
		//중첩 for 문: for 문 안에 또 다른 for 문이 존재하는
		
		/*for (int i=1; i<4; i++) {
			System.out.println("실행문 1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " +i +" j = "+ j +"\n");
			}
		}*/
		
		
		/*
		System.out.println("구구단");
		for (int i=1; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
		
		*/
		
		/*
		 * System.out.println("구구단");
		for (int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.print(i+"x"+j+"="+i*j+"\s");
			}
			System.out.println();
		}
		*/
		System.out.println("구구단");
		for (int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\s");
			}
			System.out.println();
		}
			
	}
}
