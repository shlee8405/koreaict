package day19.com.ict.edu;

public class Ex02_ThreadClass_Main {
	public static void main(String[] args) {
		System.out.println("main thread : " + Thread.currentThread().getName());
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
//		멀티 스레드	: 여러개의 스레드를 만들어서 병열 처리
//		스레드만드는 방벙	: start()를 호출해서 run()로 가면 스레드 생성 (일꾼 생성)
		dog.start();
		cat.start();
		System.out.println("main thread : " + Thread.currentThread().getName());
		
	}

}
