package day11.com.ict.edu;

public class Ex06_method {

//	총점을 구하는 메서드
	
	public String[][] total(String[][] x) {
		for (int i = 0; i < x.length; i++) {
			String str = String.valueOf(
						(Integer.parseInt(x[i][1])+
						Integer.parseInt(x[i][2])+
						Integer.parseInt(x[i][3]))	
					);
			x[i][4] = str ;
		}
		return x;
	}
	
//	평균을 구하는 메서드
	public String[][] avg(String[][] x) {
		for (int i = 0; i < x.length; i++) {
			String str = String.valueOf(
					((int)(Integer.parseInt(x[i][4])/3.0*10)/10.0)
					);
			x[i][5] = str;
		}
		return x;
	}
	
//	학점을 구하는 메서드
	public String[][] grade(String[][] x) {
		for (int i = 0; i < x.length; i++) {
			if((Double.parseDouble(x[i][5]))>=90) {
				x[i][6] = "A";
			} else if ((Double.parseDouble(x[i][5]))>=80) {
				x[i][6] = "B";
			} else if ((Double.parseDouble(x[i][5]))>=70) {
				x[i][6] = "C";
			} else x[i][6] = "F";
		}
		return x;
	}
	
}
