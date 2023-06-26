package day04.com.ict.edu2;

public class Test01 {
	/*	근무시간이 8시간까지는 시간당 9620 이고 
		8시간을 초과한 시간 만큼은 1.5배 지급한다 
		현재 근무한 시간이 10이다
		얼마를 받아야 하는가?
	*/
	
	public static void main(String[] args) {
		
		//given
		int workHr = 10 ;
		int wage = 9620 ;
		double wageMultiplier = 1.5 ;
		int extraWage = (int) (wage * wageMultiplier) ; //14430
		
		
		//new variables
		boolean lessThanEight = true;
		int extraHr = 0 ;
		int lessThanEightWage = 0 ;
		int wageEightHr = 0 ;
		int extraWageHr = 0 ;
		int moreThanEightWage = 0 ;
		
		//desired output
		int totalWage = 0 ; 
		
		//check if worked extra hours or not
		lessThanEight = (workHr <= 8) ? true : false ;
		
		//if worked less than 8, 
		//multiply wage with workHr
		lessThanEightWage = workHr * wage ;
		//if worked more than 8,
		// multiply wage with 8, 
		wageEightHr = 8*wage ;
		// and extraHr with extraWage
		extraHr = workHr - 8 ;
		extraWageHr = extraWage * extraHr ;
		// and add them together
		moreThanEightWage = extraWageHr + wageEightHr ;
		
		
	
		
		totalWage = (lessThanEight) ? lessThanEightWage : moreThanEightWage ; 
		
		System.out.println(totalWage) ;
		System.out.println();
		System.out.println();//break
		
		
		int num1 = 30;
		int num2 = 30;
		
		int giveLargerNum = (num1 > num2) ? num1 : num2 ;
		
		System.out.println(giveLargerNum);
		System.out.println();
		System.out.println();//break		

		System.out.println(Math.max(num1, num2));
		System.out.println();
		System.out.println();//break
		
		
		
		
		
		
	}

}
