package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_method math = new Ex02_method();
//		math.getSum();
		math.getAvg();
		math.getGrade();
		
		
		math.getName();
		System.out.printf("The sum is : %d%n",math.sum);
		System.out.printf("The average is : %.1f%n",math.avg);
		System.out.printf("The grade is : %s%n",math.grade);
		System.out.println(math.getSum2());	
	}
}
