package day14.com.ict.edu;

// 자식클래스  ->extends-> 부모클래스
// 상속관계 	: 자식 클래스가 부모 클래스의 멤버필드와 멤버메소드를 
//			마음대로 사용할 수 있는 클래스간의 관계
//		형식	: class 자식클래스 extends 부모클래스
//		특징	: 모든 클래스는 하나의 부모클래스를 갖는다.
//			  부모클래스가 없으면 Object가 부모클래스다.
//			  다중 상속을 지원하지 않는다. (즉, 부모클래스는 하나만 존재한다)
//			  다이얼그램에서는 	자식클래스	->	부모클래스
public class Ex03_Sub extends Ex03_Super {
	
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";
	
	static String computer = "Windows";
	
	public Ex03_Sub() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void play() {
		String name = "홍두께";
		// 변수 우선 순위
		// 지역변수 > 전역변수 > 부모클래스변수
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		// 지역변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		// private 인 경우		<<		상속이라도 private은 상속이 안된다
		System.out.println(cat);
		//System.out.println(dog);
		//System.out.println(super.dog);
		
		// static인 경우
		System.out.println(playStation);
		
	}
}
