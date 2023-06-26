package day11.com.ict.edu;

public class Ex03_method {
		String name = "홍길동";
		int kor = 90; 
		int eng = 80; 
		int math = 80;
		int sum = 0;
		double avg = 0.0;
		char grade = 'z';
		static String name1 = "이수";
		
		public int getSum() {
//			System.out.println("HELLO");
			sum = kor+eng+math;
			return sum;
		}
		public double getAvg() {
			getSum();
			avg = ((int)(sum/3.0*10))/10.0;
			return avg;
		}
		public char getGrade() {
			getSum();
			getAvg();
			grade = (avg>=90)  ? 'A' :
				(avg>=80) ? 'B' :
					(avg>=70) ? 'C' : 'F';
			return grade;
		}
		public static String getName() {
			name1 += "환";
			return name1;

		}
		
		
}
