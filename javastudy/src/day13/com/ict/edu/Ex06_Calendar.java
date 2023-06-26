package day13.com.ict.edu;

import java.util.Calendar;

public class Ex06_Calendar {
	public static void main(String[] args) {
//		Calendar 클래스 : new 예약어를 사용하지 않고 getInstance()를 사용하고
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getTimeZone());
	}
}
