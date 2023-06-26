package day15.com.ict.edu4;


//		추상 클래스를 상속했을 때 처리 방법
//		1. 추상 부모클래스의 추상 메소드를 오버라이딩 하면서 내용을 구체화 시킨다. => 자식클래스는 일반 클래스가 된다
//		2. 자식 클래스도 추상 클래스로 만들면 오버라이딩 하면서 내용을 구체화 하지 않아도 된다.

public /*abstract*/ class Ex02_Extends extends Ex01_Abstract {

	@Override
	public void hobby() {
		System.out.println("게임하기");
	}	
	
}
