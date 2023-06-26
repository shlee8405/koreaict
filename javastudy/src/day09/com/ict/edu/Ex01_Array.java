package day09.com.ict.edu;

import java.util.Iterator;

public class Ex01_Array {
	public static void main(String[] args) {
//		배열 : 	같은 자료형의 데이터들을 한 곳에 모아 둔 묶음
//				반드시 같은 자료형이어야 한다. (단, 프로모션, 디모션 가능)
//				생성할때 반드시 크기를(array string) 지정해야 한다.
//				한번 지정된 크기는 변경되지 않는다. refer to array copying
//				배열 데이터를 추출할때는 일반적으로 for문을 사용한다
//		배열의 종류:	차원 배열과 다차원 배열
//					기본 자료형 배열과 참조 자료형 배열(객체배열) 
//		배열 생성 순서: 선언 => 생성 => 초기화(데이터지정)
//					선언 :	자료형[] 이름; or 
//							자료형 이름[];  
		int[] su = {41, 41, 41, 41};
//					생성 :	이름 = new 자료형[배열의크기];
//							creates a new instance
		su = new int[4];
//					초기화 :	이름[i] = 데이터;
//							같은 자료형만 저장 가능 (프로모션 디모션 가능)

		su[0] = 42;
		su[1] = '*';
		su[2] = (int) 42.0;
		su[3] = Integer.parseInt("42");
		
		
//		배열의 출력은 일반적으로 for문 사용함
		
		for (int i = 0; i < su.length; i++) {
			System.out.printf("%d index=%d%n", su[i], i);
		}
		System.out.printf("%n%n");
		
//		개선된 for문 : 	배열이나 컬랙션에 주로 사용
//						배열 전체에 대해서 정보 출력 및 가공 가능
//						그러나 특정 몇개나 특정 하나를 별도로 출력하거나 가공 할 수 없다.(단점)
		int count = 0;
		for (int k : su) {
			System.out.printf("%d", k);
			if (count%2==0) {
				System.out.printf(" and count is even%n");
			} else {System.out.printf(" and count is odd%n");}
			count++;
		}
		
	}
}
















