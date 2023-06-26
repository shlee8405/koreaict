package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		/*	단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if문 무시
		 * 	if (condition) {
		 * 		expression;
		 * } else if (condition){
		 * 		expression;
		 * } else {
		 * 		expression;
		 * }
		 * 
		 * 
		 * 
		 * 	if the expression is only one line, can omit bracket
		 * 	example) 
		 * 		if(condition) expression;
		 * 	example2)
		 * 		if(condition) 
		 * 			expression;
		 * 
		 * */
		
		int k1 = 50;
		
		String res = "초기값";
		
		if (k1 > 60) {
			res = "합격";
		}
		
		if (k1<=60) {
			res = "불합격";
		}
		
		
		
		int k2 = 234;
		if(k2%2==0) {
			res ="짝수";
			String res2 = "짝수";
			//System.out.println("inside IF"+res2);
		} else {
			res ="홀수";
		}
		
		System.out.println(res);
		
		
		
		
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




























