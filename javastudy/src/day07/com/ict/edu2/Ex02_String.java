package day07.com.ict.edu2;

import java.util.*;
import java.util.Scanner;

public class Ex02_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String 클래스는 문자열을 처리하는 클래스
		//기본자료형은 아니지만 기본자료형 처럼 사용
		
		
		//String에서 자주 사용되는 메서드들
		//메서드(인자): 실행 결과의 자료형
		//인자 = 메서드가 실행하기 위해서 받은 재료(source)
		
		//1. charAt(int index): char
		//	위치정보 = index를 받아서 해당 위치의 존재하는 글자를 char형으로 변환
		//	위치 정보를 받아서 해당 위치의 존재하는 글자를 char형으로 반환
		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(8);
		System.out.println(k1);
		
		str = "Hello World";
		
		// 모두 대문자로 만들자
		// str.length() => str의 문자열의 길이를 구해 준다.
		for ( int i = 0 ; i < str.length() ; i++) {
			char k2 = str.charAt(i);
			if (str.charAt(i)<='z' && str.charAt(i)>='a') {
				System.out.print((char)(k2-32)); 
			} else {
				System.out.print(k2);
			}
		}
		System.out.println(str);
		
		// 2. concat(String str) : String
		//	입력된 문자열을 현재 문자열과 합친다. ("string1"+ "string2")
		
		String s1= "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		// 3. contains(CharSequence s) : boolean
		//	CharSequence : char 값을 읽을수 있는 시퀀스, 인터페이스
		//	CharSequence을 지금은 String이라고 생각하자
		// 현재 가지고 있는 문자열 중에 인자로 들어온 문자나 문자열을 가지고 있으면 true, 없으면 false
		// case sensitive
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("rea"));
		System.out.println(s4.contains("RE"));
		
		// 4. equals() : boolean
		// checks if String2 has the same characters compared to String1
		// 5. equalsIgnoreCase() : boolean
		// checks if string2 has the same characters with string1. case insensitive
		
		String s5 = "Korea"; 
		String s6 = "KOREA";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		// 6. format(String format, Object... args) : static String
		//	형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재 개발원";
		//	문자열 => %s
		String s8 = String.format("%s", s7);
		System.out.println(s8);
		// %30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		// 자리수가 모자라도, input string은 다 출력된다
		s8 = String.format("%30s", s7);
		System.out.println(s8);
		// positive number = 오른쪽 정렬
		// negative number = 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
		//	자리가 모자르면 짤린다.
		//	인덱스 수만큼 출력된다
		s8 = String.format("%.8s", s7);
		System.out.println(s8);
		
		
		//	%d 정수 형식 지정
		int s9 = 2314;
		s8 = String.format("%4d", s9);
		System.out.println(s8);
		//오른쪽정렬
		s8 = String.format("%50d", s9);
		System.out.println(s8);
		System.out.println(s8.length());
		//왼쪽정렬
		s8 = String.format("%-50d", s9);
		System.out.println(s8);
		//오른쪽정렬 빈공간 0으로 체운다
		s8 = String.format("%05d", s9);
		System.out.println(s8);
		// 1,000,000 commas between 3 numbers
		s8 = String.format("%,d", s9);
		System.out.println(s8);
		// %f 실수 형식 지정
		double s10 = 1245.44567;
		System.out.println(String.format("%f", s10));
		//오른쪽 정렬
		System.out.println(String.format("%20f", s10));
		//소수점3 rounded
		System.out.println(String.format("%.3f", s10));
		//소수점1 rounded
		System.out.println(String.format("%.1f", s10));
		// comma + 소수점
		System.out.println(String.format("%,.1f", s10));
		
		// .getBytes() ; byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할때 사용한다. (대/소문자, 숫자, 일부특수문자만 가능 (ASCII 코드)*영어를 제외한 나머지 글자 안됨*)
		String a1 = "java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]);
		
		for(int i = 0 ; i < b1.length; i++) {
			System.out.print((char)b1[i]);
		}
		System.out.println();
		
		// hashCode: int
		// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String 에서 hashCode는 문자열에서 한 글자씩 가지고 와서 정수값으로 변경
		String a2 = "홍길동";
		System.out.println(a2.hashCode());
		
		String a3 = "홍길동";
		System.out.println(a3.hashCode());
		
		// in String comparisons, == 는 주소가 같냐?
		System.out.println(a2 == a3);
		// in String comparisons, .equals() 는 내용이 같냐?
		System.out.println(a2.equals(a3));
		
		
		// indexOf(int ch), indexOf(String str) : int 
		// self explanatory. returns the index of a char or string
		// 찾는 문자나 문자열이 없으면 -1 반환
		String a4 = "BufferedReader";
		// 'R'를 찾아라
		System.out.println(a4.indexOf('R'));
		// 'r'를 찾아라
		System.out.println(a4.indexOf('r'));
		// "er"를 찾아라
		System.out.println(a4.indexOf("er"));
		
		// lastIndexOf(int ch), lastIndexOf(String str) : int
		// 입력된 char, 또는 String을 해당 문자열에 char나 String의 마지막 위치값을 알려준다.
		// 'R'를 찾아라
		System.out.println(a4.lastIndexOf('R'));
		// 'r'를 찾아라	
		System.out.println(a4.lastIndexOf('r'));
		// "er"를 찾아라	
		System.out.println(a4.lastIndexOf("er"));

		// indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 2번째, 3번째 문자나 문자열 찾기 위함
		// fromIndex => 시작 위치값
		System.out.println(a4.indexOf('e',0));

		// 첫번째 'e'의 위치가 4임으로, 다음 e를 구하려면 a4.indexOf('e',5)임
		System.out.println(a4.indexOf('e', 5));
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0)+1));
		
		// 첫번째 'e'가 6나왔으니, 7부터 시작
		System.out.println(a4.indexOf('e',7));
		System.out.println(a4.indexOf('e',a4.indexOf('e',a4.indexOf('e',0)+1)+1));
		
		// .length() : int => 문자열의 길이(갯수) => 1부터 시작
		//				   => 문자열의 위치(index) => 0 부터 시작
		System.out.println(a4.length());
		
		// .replace(char oldChar, char newChar) : String
		// .replace(String oldStr, String newString) : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기) 한다.
		
		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("한", "한 ❤");
		System.out.println(a6);
		System.out.println(a7);
		
		
		// .isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String t5= "HelloWorld";
		System.out.println(t5.isEmpty());
		t5= "";
		System.out.println(t5.isEmpty());
		
		// .split(String regex) : String[]
		// .split(String regex, int limit) : String[]
		// 		regex => 구분자(나눌 기준), 
		//		limit => 배열의 크기 (방의 갯수)
		// 		t5.split("," , 3) 
		//						^"사과" "딸기" "망고, 오렌지, 두리안, 용과"
		
		t5 = "사과, 딸기, 망고, 오렌지, 두리안, 용과";
		String[] arr = t5.split(",");
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);  < bad practice. Use for statements
		//System.out.println(arr[2]);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] arr2 = t5.split(",",3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// substring(int beginIndex) : String
		// 입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-9732-9110";
		String t7 = t6.substring(4);
		System.out.println(t7);
		t7 = t6.substring(9);
		System.out.println(t7);
		t7 = t6.substring(t6.lastIndexOf("-")+1);
		System.out.println(t7);
		
		// substring(int beginIndex, int endIndex) : String
		// 입력된 시작위치부터 endIndex까지 문자열 추출
		t6 = "010-9732-9110";
		t7 = t6.substring(4, 8);
		System.out.println(t7);
		
		t7 = t6.substring(0,1);
		System.out.println(t7);
		
		// 010-9732-9110 => 010-****-9110, 010-9732-****
		String t8 = "010-9732-9732";
		String t9 = "****";
		String t10 = t8.substring(0,4) + t9 + t8.substring(8);
		System.out.println(t10);
		System.out.println();
		t10 = t8.replaceFirst(t8.substring(t8.indexOf("-")+1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);
		
		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		// toLowerCase(); String => 해당 문자열을 모두 소문자로 변경
		// toUpperCase(); String => 해당 문자열을 모두 대문자로 변경
	
		String str11 = "javaLand03Exam";
		String str22 = "";
		for (int i = 0; i < str11.length(); i++) {
			char kk = str11.charAt(i);
			//소문자 => 대문자로 변경
			if(kk>= 'a' && kk<= 'z') {
				str22 = str22 + (char)(kk-32);
			} else {
				str22 += kk;
			}			
		}
		System.out.println(str22);
		System.out.println(str11.toUpperCase());
		System.out.println(str11.toLowerCase());
		
		//	toString() : String
		//	객체(클래스)에서 toString : 모든 클래스(객체)에서 사용가능
		//							클래스(객체)가 가지고 있는 정보나 값(데이터)들을
		//							문자열로 만들어서 반환하는 메서드
		//	String 에서의 toString : 문자열 자체 반환

		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		
		System.out.println(u1 == u2);
		
		// trim() : String
		// 해당 문자열의 앞, 뒤 공백 제거, 중간 공백은 제거 못함
		String u3 = "   java     자바    JAVA   ";
		System.out.println("길이 : " + u3.length());
		String u4 = u3.trim();
		System.out.println("길이 : "+ u4.length());
		
		// .startsWith(String prefix) : boolean
		// 주어진 문자열로 시작하는지 검색
		
		// .startsWith(String prefix, int toffset) : boolean
		// 주어진 문자와 주어진 index에서 시작하는지
		
		// .endWith(String suffix) : boolean
		// 주어진 문자로 끝났는지 검사
		String u5 = "java     자바     JAVA";
		System.out.println(u5.startsWith("JAVA"));
		System.out.println(u5.startsWith("java"));
		System.out.println(u5.startsWith("자바"));
		System.out.println();
		System.out.println(u5.endsWith("JAVA"));
		System.out.println(u5.endsWith("java"));
		System.out.println(u5.endsWith("자바"));
		System.out.println();
		System.out.println(u5.startsWith("JAVA",9));
		System.out.println(u5.startsWith("java",9));
		System.out.println(u5.startsWith("자바",9));
		
		// .valueOf(기본 자료형) : 들어온 기본 자료형을 String을 변경 시킴
		boolean bo1 = true; 
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37L;
		double num3 = 345.127D;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println();
		// System.out.println(bo1);
		System.out.println(ch1+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println();
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		
		//	Wrapper Class
		// 	기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
		//	BOOLEAN "true" 또는 "false" => true 또는 false : Boolean.parseBoolean()
		
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg); // "true"
		System.out.println(msg2); // true
		if(msg2) System.out.println("변경1");	
		else System.out.println("변경2");
		
		// INT "142", "25" => 142, 25 => Integer.parseInt();
		msg = "142";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg+10);
		System.out.println(msg3+10);
		
		// LONG "123123", "23132" => 123123, 23132 => Long.parseLong();
		// 		"숫자" =?> OK, "숫자L"=?> err
		msg = "12312312123123123";
		long msg4 = Long.parseLong(msg);
		System.out.println(msg+7);
		System.out.println(msg4+7);
		
		// DOUBLE "3.1415" => 3.1415 Double.parseDouble();
		msg = "3.1415";
		double msg5 = Double.parseDouble(msg);
		System.out.println(msg5);
		System.out.println(msg+1);
		System.out.println(msg5+0.001);
		
		msg = "3.1415f";
		System.out.println(msg5);
		System.out.println(msg+1);
		System.out.println(msg5+0.001);
		
		// Character.parseCharacter() 는 존재하지 않는다.
		// String.charAt() 이용하면 char를 가져올수 있다.
		
		msg = "p";
		char msg6 = msg.charAt(0);
		System.out.println(msg6);
		
		////////////////////////
		msg = "java 자바 JAVA 대한민국 2023 %*";
		// String.getBytes() => byte[] ( 영문자 대/소문자, 숫자 및 일부 특수문자만 가능)
		byte[] result = msg.getBytes();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]+ " : " + (char)result[i]);
		}
		
		// String.toCharArray() => char[] 모든문자 처리 가능
		char[] result2 = msg.toCharArray();
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]+ " : " +  result2[i]);
			
		}
		
	}
}






















