package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
//		static ; 객체 생성 없이, 클래스이름.변수이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		
//		instance는 객체 생성 후 접근
//		객체 생성)
//		클래스이름	 참조변수	= new 생성자([인자]);
//		** 해당 클래스의 생성자가 없으면 기본생성자 사용
//		** 기본 생성자란 인자가 없는 생성자, 클래스이름() = 기본생성자()
		Ex02_class str	= new Ex02_class();
//		접근법 ; 참조변수.멤버필드
		System.out.println(str);
		System.out.println(str.GENDER);
		System.out.println(str.name);
		System.out.println(str.AVG);
		System.out.println(str.sum);
		str.name = "bobmarley";
//		str.GENDER = "여성";			CONSTANT cannot be changed
		System.out.println(str.name);
//		Ex02_class.AVG = 31415; 	CONSTANT cannot be changed
		Ex02_class.sum = 23;
		System.out.println(Ex02_class.sum);
	}
}
