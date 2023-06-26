package day05.com.ict.edu;

public class Ex01_switch {
	public static void main(String[] args) {
		/**	switch ~ case : 다중 if~else 문과 같은 조건문
		 * 	if 문의 조건식은 boolean, 비교연산, 즉 true, false 일때 사용
		 * 	switch 문의 조건식은 int, char, String 일때 사용 (not for long, float, double data types)
		 * 	switch's expressions/인자값 = int, char, String	
		 * 
		 * 
		 * 	형식) switch (expression) {
		 * 		case x : 
		 * 			code block;
		 * 			break;
		 * 		case y : 
		 * 			code block;
		 * 			break;
		 * 		case z : 
		 * 			code block;
		 * 			break;
		 * 		default : 
		 * 			code block;
		 * 			break;
		 * 		}
		 */
		
		// int k1이 1이면 카페모카. 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스 를 출력하자
		
		int k1 = 3;
		String s1 = "null";
		
		switch (k1) {
			case 1 :
				s1 = "카페모카" ; 
				System.out.println(s1);
				break;
			case 2 : 
				s1 = "카페라떼" ; 
				System.out.println(s1);
				break;
			case 3 : 
				s1 = "아메리카노" ; 
				System.out.println(s1);
				break;
			case 4 : 
				s1 = "과일쥬스" ; 
				System.out.println(s1);
				break;
			default:
				System.out.println(s1);
				break;
		}
		// char k3이 A, a이면 아프리카 B,b 이면 브라질 C,c이면 캐나다. 나머지 한국
				
		char k3 = 'a';
		String s3 = "null";
		
		switch (k3) {
			case 'A' :
				s3 = "아프리카";
				break;
			case 'a' :
				s3 = "아프리카";
				break;
			case 'B' :
				s3 = "브라질";
				break;
			case 'b' :
				s3 = "브라질";
				break;
			case 'C' :
				s3 = "캐나다";
				break;
			case 'c' :
				s3 = "캐나다";
				break;
			default :
				s3 = "한국";
		};
		System.out.println(s3);
		
		
		char k4 = 'a';
		String s4 = "null";
		
		switch (k4) {
			case 'A' -> s4 = "아프리카";
			case 'a' -> {
				s4 = "아마존";
				System.out.println("river");
				}
			case 'B' -> s4 = "브라질";
			case 'b' -> s4 = "브라질";
			case 'C' -> s4 = "캐나다";
			case 'c' -> s4 = "캐나다";
			default -> s4 = "한국";
		};
		System.out.println(s4);
			
		// String k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄 를 출력하라
		
		String k5 = "중국";
		String s5 = "";
		
		switch (k5) {
			case "한국":
				s5 = "서울";
				break;
			case "중국" :
				s5 = "베이징";
				break;
			case "일본" :
				s5 = "도쿄";
				break;
		}
		System.out.println(s5);
		
		
		//int k6가 3~5 : 봄 , 6~8 : 여름, 9~11 : 가을, 12, 1, 2: 겨울
		
		int k6 = 5;
		String s6 = "n/a";
		
		switch (k6) {
			case 3:
			case 4:
			case 5:
				s6 = "봄";
				break;
			case 6:
			case 7:
			case 8:
				s6 = "여름";
				break;
			case 9:
			case 10:
			case 11:
				s6 = "가을";
				break;
			case 12:
			case 1:
			case 2:
				s6 = "겨울";
				break;		
			default:
				s6 = "wrong month";
				break;
		}
		System.out.println(s6);
		
		//Switch에서 범위가 넓어지면 사용하지 말자
		// int k7의 점수가 90이상이면 A, 80B, 70C,
		
		int k7 = 100;
		int k06 = k7/10;
		String s7 = "na";
		
		switch (k06) {
			case 10:
			case 9:
				s7 = "A학점";
				break;
			case 8:
				s7 = "B학점";
				break;
			case 7:
				s7 = "C학점";
				break;
			default:
				s7 = "F학점";
				break;
		}
		System.out.println(s7);
		
	}
}
