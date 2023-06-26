package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
		/*	이름이 홍길동
		 * 	국어 90
		 * 	영어 80
		 * 	수학 80
		 * 	output 이름, 총점, 평균
		 * 	이름, 총점 int
		 * 	평균 double (first decimal)
		 * */
		
		
		//given
		String name = "Hong Gil-Dong" ;
		int korScore = 90 ;
		int engScore = 80 ;
		int mathScore = 80 ;
		
		// desired output
		// name 			[x]
		// total points		[x]
		// average points	[x]
		
		
		int totalScore = korScore + engScore + mathScore ;
		double avgScore = totalScore / 3.0 ;
		
		double avgScoreFirstDecimal = ((int)(avgScore * 10))/10.0;
		
		System.out.println("이름은 : "+ name);
		System.out.println("총점은 : "+ totalScore);
		System.out.println("평균은 : "+ avgScoreFirstDecimal);

	}
}
