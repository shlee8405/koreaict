package day11.com.ict.edu;

public class Ex02_method {
		String name = "홍길동";
		int kor = 90; 
		int eng = 80; 
		int math = 80;
		int sum = 0;
		double avg = 0.0;
		char grade = 'z';
		
//			모두 void
//			총점 구하는 메서드
		public void getSum() {
			sum = kor + eng + math;
		}
		
		public int getSum2() {
			int sum1 = kor+eng+math;
			return sum1;
		}
		
		
//			평균 구하는 메서드
		public void getAvg() {
			getSum();
			avg = ((int)(sum/3.0*10))/10.0;
		}
		
		
		
//			학점 구하는 메서드
		public void getGrade() {
			getSum();
			getAvg();
			grade = (avg>=90)  ? 'A' :
				(avg>=80) ? 'B' :
					(avg>=70) ? 'C' : 'F';
		}
		
		public void getName() {
			System.out.println(name);
		}
	
}
