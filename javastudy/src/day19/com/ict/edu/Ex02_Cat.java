package day19.com.ict.edu;

public class Ex02_Cat extends Thread {
	@Override
	public void run() {
		int i = 0;
		
		while (i<5) {
			System.out.println(i+"야옹~야옹~" + Thread.currentThread().getName());
			i++;
		}
	}
	
//	@Override
//	public synchronized void start() {
//		int i = 0;
//		
//		while (i<7) {
//			System.out.println(i+"야옹~야옹~" + Thread.currentThread().getName());
//			i++;
//		}
//	}

}
