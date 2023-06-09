package day10.com.ict.edu;

public class Ex01_class {
//		클래스
//		자바에서의 클래스는 객체(Object)를 정의하는 틀 또는 설계도면 과 같은 의미로 사용 됨
//		객체란 클래스를 바탕으로 만들어진 
	
//		클래스가 가지고 있는 것 :	데이터 멤버필드 ( 변수와 상수 )
//							기능 = 동작 = 멤버 메서드
//							생성자 = 클래스가 객체로 만들어질때 한번 호출 되서 데이터를 초기화 할 수 있는 기능을 가졌다
//							** 클래스 이름 = 저장이름 = 파일이름 = 생성자이름
	
//		클래스 구조 : 헤더, 멤버필드, 생성자, 멤버메서드
//		1. 헤더 : [접근제한자] [클래스종류에 대한 예약어] class 클래스 이름 {	}
//				1) 접근제한자 : 	클래스, 멤버필드, 멤버메서드, 생성자 모두 멘 처음에 사용할 수 있음
//								외부에서 접근할 수 있는 권한의 단계를 말함
//								*)	public:	누구나 다 접근 가능
//								*)	protected:	같은 패키지와 상속관계에서는 접근 가능
//								*)	생략(default): 같은 패키지에서만 접근 가능
//								*)	private: 외부접근 불가, 내부멤버 (멤버필드, 멤버메서드)만 접은 가능	
//				2) 클래스 종류에 대한 예약어 : 일반적인 클래스에는 생략한다.
//								특정클래스에 해당되는 예약어가 존재한다. (final, abstract ...)
//				3) class : 클래스임을 나타내는 예약어
//				4) 클래스이름 :	 클래스이름 = 저장이름 = 파일이름 = 생성자이름
//								첫글자 대문자 나머지는 소문자
//								두 단어 이상일때는 단어의 첫 글자들은 대문자
//								숫자는 중간이나 뒤에 붙인다
//		2. 멤버필드 : 데이터, 상태값, 속성 
//				1) 변수 : 언제든지 변할 수 있는 데이터를 저장하는 공간
//								첫글자 소문자, 두 단어 이상일때는 단어 첫 글자들은 대문자
//								숫자는 중간이나 뒤에 사용, 공백은 사용 불가
//				2) 상수 : 한번 데이터가 저장되면 변경할 수 없는 데이터를 저장하는 공간
//								모든 글자가 다 대문자, 단어와 단어 사이에 _(언더바) 를 사용할 수 있다
//		3. 멤버메서드 : 동작, 기는, 실행
//				*) 해당 메서드를 호출(실행) 하면 해당 메서드안에 존재한 내용이 실행됨
//				*) 호출해서 내용이 실행 된 후에는 호출한 곳으로 되돌아 간다	
//				*) 메서드는 다른 메서드를 호출할 수 있음
//				1) 구성 : [접근제한자] [메서드종류] 반환형 메서드이름([인자=매개변수]){ 실행할 내용 }
//					access-modifier 
//					ㄱ) 접근제한자 : public, protected, default, private ;
//					ㄴ) 메서드종류 : 일반메서드 이부분을 생략한다
//								특정 메서드에 해당하는 예약어를 사용 (static)
//					ㄷ) **반환형 :	해당 메서드가 실행이 끝나면 호출한 곳으로 되돌아 갈 때 
//								함깨 가지고 가능 결과의 자료형
//								만약에 결과를 가지고 가지 않으면 void라는 예약어를 사용 한다 
//				2) ** 메서드이름 : 변수와 같음, 첫글자 소문자, 두 단어 이상일때 단처 첫글자들은 대문자
//								숫자는 중간이나 뒤에 사용, 공백은 사용 불가
//				3) ** 인자 = 매개변수 : 보통은 실행할때 필요한 정보를 외부에서 받기 위한 통로
//								생략 가능하고 여러개 사용 가능
//				4) ** 오버로딩(중복정의) : 메서드 이름이 같으나 인자 수나 인자 자료형이 다르면 다른 메서드로 판단한다
//								즉, 인자의 수 나 자료형이 다르면 같은 이름의 메서드가 여러개 존재할 수 있다
//				5) ** getter() : 호출하는 입장에서 메서드를 이용해서 정보를 가져오는 메서드 
//				   ** setter() : 호출하는 입장에서 메서드를 이용해서 정보를 변경하는 메서드
//								변수가 private 이면 직접 접근을 할 수 없다 => getter()/setter()를 이용해서 접근한다
//	
//		4. 생성자 : 클래스가 객체로 만들어질 때 한번 호출 된다.
//				1) 목적 :	멤버필드 (변수, 상수)의 초기값을 시정하는 것이 목적이다
//				2) 형식 :	클래스 이름과 생성자 이름은 같다 
//						반환형이 없는 메서드의 형태이다
//						[접근제한자] 생성자(클래스이름)([인자]){ 실행내용 }
//						인자가 없는 생성자를 기본 생성자 라고 한다
//				생성자 오버로딩 가능, 
//				하나의 클래스의 여러개의 생성자가 존재할 수 있다 => 생성자 오버로딩 가능
//				** 모든 클래스는 반드시 생성자를 가지고 있음
//					해당 클래스의 생성자가 없으면 기본 생성자가 생략되어 있음
//					해당 클래스의 생성자가 없으면 객체를 생성할 때 기본 생성자를 호출 한다
//				3) 클래슬를 이용해서 객체 만들때 생성자 호출
//					Scanner		scan	=	new		Scanner(System.in);
//					클래스		참조변수	=	new예약어		생성자(클래스)
//					
//				new 예약어를 사용하면 무조건 heap 메모리에 사용영역을 만든다
//		5. 클래스를 객체로 만든 후 멤버필드와 멤버메서드에게 접근하는 방법
//				참조변수.멤버필드, 참조변수.멤버메서드(), (단, 접근제한자를 확인)
//		6. static 과 instance : 멤버필드, 멤버메서드에 공통으로 해당하는 사항
//				1) instance(인스턴스) 필드, 메서드 : 객체가 생성될 때 같이 생성되는 필드와 메서드
//										일반적인 클래스의 멤버필드나 멤버메서드는 모두 인스턴스다
//					호출방법 :	참조변수.멤버필드, 참조변수.멤버메서드;
//							*객체 생성한 다음에 호출* 
//							heap 메모리에 만들어진다
//								Scanner sc = new Scanner(System.in);
//								sc.nextInt();
//				2) static : 객체 생성과 상관없이 미리 만들어진 멤버필드와 멤버 메서드
//							반드시 static 이라는 예약어를 사용
//							*객체 생성과 상관없이* 인제는 호출 가능
//					호출방법 :	클래스.멤버필드, 클래스이름.멤버메서드
//							static 메모리에 만들어진다(공용)
//								Math.abs();


}

















