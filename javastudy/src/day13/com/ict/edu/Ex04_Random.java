package day13.com.ict.edu;

import java.util.Random;

public class Ex04_Random {
	public static void main(String[] args) {
//		난수 (정해지지 않은 수) 를 발생하는 방법
//		Math.random() , Random 클래스

//		1. Random 클래스
		Random ran = new Random();

//		각종 기본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 : " +ran.nextBoolean());
		System.out.println("int형 : " +ran.nextInt());
		System.out.println("long형 : " +ran.nextLong());
		System.out.println("gaussian형 : " +(ran.nextGaussian()*5+60));

//		double은 0.0이상~1.0미만 에서 난수 발생
		System.out.println("double형 : "  +ran.nextDouble());
	
//		특정 범위를 지정하는 방법
//		1. nextInt(범위) : 0~범위 전까지 난수 발생(정수)
		System.out.println("int(범위) : " + ran.nextInt(5));
		
//		2. (int)(nextDouble() * 범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		System.out.println("double(범위) : " + (int)(ran.nextDouble() * 5));
	
//		Math 클래스 : 전체메서드가 static, 객체 생성없이 호출 가능
//		1. random()
		System.out.println("Math.random() : " + Math.random());
//		2. 특정범위 지정
		System.out.println("Math.random() : " + (int)(Math.random()*5));
//		올림, 버림, 반올림
		System.out.println("올림 : " + Math.ceil(3.45));
		System.out.println("올림 : " + Math.ceil(3.55));
		
		System.out.println("반올림 : " + Math.round(3.45));
		System.out.println("반올림 : " + Math.round(3.55));

		System.out.println("버림 : " + Math.floor(3.45));
		System.out.println("버림 : " + Math.floor(3.55));
		System.out.println();
		
	}

}
