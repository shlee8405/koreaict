package day19.com.ict.edu;

public class Ex04_Cat implements Runnable {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1234);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("야옹ㅇ" + Thread.currentThread().getName());
		}

	}
}
