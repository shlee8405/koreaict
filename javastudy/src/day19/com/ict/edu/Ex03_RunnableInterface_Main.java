package day19.com.ict.edu;

public class Ex03_RunnableInterface_Main {

	public static void main(String[] args) {
		System.out.println("main thread : " + Thread.currentThread().getName());
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cat cat = new Ex03_Cat();
//		멀티 스레드	: 여러개의 스레드를 만들어서 병열 처리
//		스레드만드는 방벙	: start()를 호출해서 run()로 가면 스레드 생성 (일꾼 생성)
		Thread thread = new Thread(dog);
		thread.start();
//		Thread thread2 = new Thread(cat);
//		thread2.start();
		
//		익명
//		new Thread(cat).start(); 
		
//		익명2
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					
					System.out.println("DSDS"+Thread.currentThread().getName());				
				}
			}
		}).start();
		
		System.out.println("main thread : " + Thread.currentThread().getName());
		
	}

}
