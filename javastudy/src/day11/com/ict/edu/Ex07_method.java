package day11.com.ict.edu;

public class Ex07_method {
	int sum = 0;
	double avg = 0;
	String grade = "";

//	총점을 구하는 메서드
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}

//	평균을 구하는 메서드
	public void getAvg() {
		avg = ((int) ((sum / 3.0) * 10)) / 10.0;
	}

//	학점을 구하는 메서드
	public void getGrade() {
		grade = avg>=90? "A" : 
			avg>=80? "B" :
				avg>=70? "C" : "F";
	}

}
