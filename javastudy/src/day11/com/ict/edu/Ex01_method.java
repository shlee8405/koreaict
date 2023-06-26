package day11.com.ict.edu;

public class Ex01_method {
//		클래스 : 멤버필드, 멤버메서드, 생성자
//			멤버필드 : 인스턴스변수, 인스턴스상수, static 변수, static 상수

	String name = "홍길동";
	int kor = 80; // 인스턴스(instance) 변수
	int eng = 95; // 인스턴스(instance) 변수
	int math = 85; // 인스턴스(instance) 변수
	int total = 0; // 인스턴스(instance) 변수
	double avg = 0.0; // 인스턴스(instance) 변수		<<인스턴스는 static변수 사용 가능
	
	static double ki = 178.5; //static 변수

//		멤버 메서드() : 동작, 기능, 실행하는 것																<< methods NEED to be called to be run

//		** 메서드는 호출해야만 실행 할 수 있고, 실행 후 반드시 호출한 곳으로 되돌아 간다 

//		형식) 	[접근제한자] [메서드종류] 반환형 메서드이름([인자),...) { }										<< methods usually use public access modifiers
//					** 반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행 결과를 가지고 갈때 실행결과의 자료형 			<< any type of data. 기본자료형or참조자료형
// 							실행결과를 가지고 가지 않으면 void 라는 예약어를 사용한다

//		instance 메서드
	public void getTotal() {
		total = kor + eng + math;
		return;
	}

	public int getTotal2() {
		int sum = kor + eng + math;
		return sum;
	}

	public int getTotal3() {
		return kor + eng + math;
	}

	public static void getAvg() {
//		static일 경우는 instance 변수 사용 불가
//		avg = total / 3.0;
		
//		ki 가 static 임으로 사용 가능
		int j = 123;
		ki += 5;
	}

	public static double getAvg2() {
		
		return ki = ki + 0.7;
	}

//	
}
