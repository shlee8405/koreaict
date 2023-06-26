package day11.com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_method ex4 = new Ex04_method();
		
//		더하기
		ex4.add();
		System.out.println(ex4.result);
		ex4.add(5);
		System.out.println(ex4.result);
		ex4.add(5,6);
		System.out.println(ex4.result);	
		
//		빼기1.0
		System.out.println(ex4.sub());
		System.out.println(ex4.sub(5));
		System.out.println(ex4.sub(15,35));
		
//		빼기2.0
		ex4.sub();
		System.out.println(ex4.result);
		ex4.sub(5);
		System.out.println(ex4.result);
		ex4.sub(15,35);
		System.out.println(ex4.result);
		

	}
}
