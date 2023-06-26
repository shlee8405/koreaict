package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_method math = new Ex03_method();
		
		System.out.println(math.sum);
		System.out.println(math.avg);
		System.out.println(math.grade);

		System.out.println(math.getSum());
		System.out.println(math.getAvg());
		System.out.println(math.getGrade());
		System.out.println(Ex03_method.getName());
		System.out.println(math.getName());

	}
}
