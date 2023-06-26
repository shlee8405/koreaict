package day12.com.ict.edu;

public class Ex06_Constructor {
	private String name = "홍길동";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String hak = "";

	
	
//	Constructor
	public Ex06_Constructor() {
		//생성자에서 다른 메서드 호출 가능
	}

//	총점 구하기
	public void gSum(int kor , int eng, int math) {
		sum = kor + eng + math;
	}
	
//	평균 구하기
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
//	학점 구하기
	public void gHak() {
		if(avg>=90) {
			hak = "A";
		} else if (avg>=80) {
			hak = "B";
		} else if (avg>=70) {
			hak = "C";
		} else {
			hak = "F";
		}
	}
	
//	출력 메서드
	public void prn() {
		System.out.printf("이름: %s%n총점: %d%n평균: %.1f%n학점: %s%n",name,sum,avg,hak);
	}
	
	
//	Settergetter
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

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

}
