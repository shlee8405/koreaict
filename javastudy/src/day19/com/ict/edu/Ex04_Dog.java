package day19.com.ict.edu;

public class Ex04_Dog implements Runnable{
	@Override
	public void run() {
		while (true) {
//			3초간 대기 후 실행
			System.out.println("멍머어어" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println("멍머어어" + Thread.currentThread().getName());
		}

	}
}
