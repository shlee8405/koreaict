package day15.com.ict.edu;

public class Cat extends Animal{
	String color = "삼색이";
	public void play() {
		System.out.println("창밖을 바라본다");
		
	}
	
	@Override
	public void sound() {
		System.out.println("냐옹~");
	}
//	부모클래스에 해당 메서드 final이 있으면 오버라이딩 불가
//	@Override
//	public void sleep() {
//		System.out.println("12이상 잠을 잔다.");
//	}
}
