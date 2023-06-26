package day15.com.ict.edu4;

public abstract class Ex01_Abstract {
//		추상 클래스와 추상 메소드
//		추상 메소드	:	메소드에서 body(몸동=블로={} = 실제 실행 내용을 기록하는 부분들)를 가지고 있지 않은 메소드
//					구체적인 실행 내용이 없음
//					반드시 abstract 예약어를 붙여야 한다
//		추상 클래스 : 	일반 클래스가 가지는 멤버필드, 멤버메소드, 생성자르르 가질 수 있다
//					하나 이상의 추상 메소드를 가지고 있는 클래스를 말한다. 
	
	String name = "홍길동";
	
	
//		일반 메소드 
	public void play() {
		System.out.println("야놀자");
	} 
	public String sound() {
		return "6시간 이상 잠자기";
	}
	
	
//		추상 메소드
	public abstract void hobby() ;

}

