package day14.com.ict.edu;

import java.util.Random;

public class Ex05_Extends extends Random {
	int su = nextInt();

	public void play() {
		System.out.println(su);
	}

//	static 메소드는 static 변수만 사용 가능
	public static void main(String[] args) {
//		static 안에서 인스턴스를 실행하려면 객체를 만들자
		Ex05_Extends ex = new Ex05_Extends();
		ex.play();
		
		
	}

}
