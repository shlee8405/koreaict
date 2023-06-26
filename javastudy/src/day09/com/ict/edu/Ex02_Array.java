package day09.com.ict.edu;

public class Ex02_Array {
	public static void main(String[] args) {
//		선언과 생성을 한번에 처리하자
//		char[] k1;				선언
//		k1 = new char[4];		생성
		char[] k1 = new char[4];
		
//		데이터 저장
		k1[0] = 'J';
		k1[1] = 'A';
		k1[2] = 'V';
		k1[3] = 65; 
		
		for (int i = 0; i < k1.length; i++) {
			System.out.printf("%s%n", k1[i]);
		}
		System.out.printf("%n%n");
		for (char c : k1) {
			System.out.printf("%s%n", c);
		}
		
//		선언, 생성, 데이터 저장 한번에
		char[] k2 = {'j','a','v','a','0','1'};
		int[] k3 = {100,200,300,400};
		double[] k4 = {3.14, 7.25, 4, 6.12};
		String str[] = {"홍길동","이길동","ABCDEFU"};
		for (int i = 0; i < k4.length; i++) {
			System.out.printf("%.1f%n",k4[i]);
		}
		for (String string : str) {
			System.out.printf("%s%n",string);
		}
		
	}
}
