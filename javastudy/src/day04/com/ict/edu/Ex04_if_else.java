package day04.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
		/*	if - else 문
		 * 	조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		 * 	형식) if(조건식){
		 * 			조건식이 참일때 실행할 문장;
		 * 			조건식이 참일때 실행할 문장;
		 * 		} else {
		 * 			조건식이 거짓일 때 실행할 문장;
		 * 			조건식이 거짓일 때 실행할 문장;
		 * 		}
		 * */
		
	
		int k1 = 66;
		String str1 = "null";
		if (k1 >= 60) {
			str1 = "합격";
		} else {
			str1 = "불합격";
		}
		
		System.out.println(str1);
	
		
		//int k2가 홀수인지 짝수인지
		int k2 = 2321;
		String str2 = "null";
		
		if(k2%2 == 0) {
			str2 = "짝수";
		} else {
			str2 = "홀수";
		}
		
		System.out.println(str2);
		
		//char k3가 대문자인디, 대문자가 아닌지 판별하자
		char k3 = 'S';
		String str3 = "null";
		if(k3<='Z' && k3>='A') {
			str3 = "대문자";
		} else if(k3<='z' && k3>='a') {
			str3 = "not 대문자. 소문자";
		} else {
			str3 = "몰루";
		}
		
		System.out.println(str3);
		
		
		/*	근무시간이 8시간까지는 시간당 9620 이고 
			8시간을 초과한 시간 만큼은 1.5배 지급한다 
			현재 근무한 시간이 10이다
			얼마를 받아야 하는가?
		 */
		
		int workHour = 10;
		int wage = 9620;
		double wageMultiplier = 1.5;
		int baseHour = 8;
		
		if (workHour > baseHour) System.out.println((baseHour*wage)+(int)((workHour-baseHour)*wage*wageMultiplier));else System.out.println(workHour*wage);

		
	}
}



























