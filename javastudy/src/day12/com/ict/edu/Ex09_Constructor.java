package day12.com.ict.edu;

public class Ex09_Constructor {
	// 멤버 필드//
	// instance 멤버 변수
	private String name = ""; // 이름
	private int kor = 0; // 국어점수
	private int eng = 0; // 영어점수
	private int math = 0; // 수학점수
	private int sum = 0; // 총점
	private double avg = 0.0; // 평균
	private String grade = ""; // 학점
	private int rank = 1; // 순위

	// 생성자// 생략 -> 기본 생성자
	public Ex09_Constructor(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Ex09_Constructor() {
		// TODO Auto-generated constructor stub
	}

	public void gSum() {
		sum = kor + eng + math;
	}
	
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	public void gHak() {
		if(avg>=90)grade="A";
		else if (avg>=80)grade="B";
		else if (avg>=70)grade="C";
		else grade="F";
		
	}
	public void gRank() {
		rank = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	
	public void setRank(int rank) {
		this.rank = this.rank + rank;
	}
	
	
	
	
	
}
