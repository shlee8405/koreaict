package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_date {
	public static void main(String[] args) {
		/*	날짜 관련 클래스
		 * 	1. Date 클래스, 2. Calendar 클래스, 3. LocalDate 클래스 
		 *	 
		 *	1. Date 클래스 : 기본생성자로 생성하면 컴퓨터의 시간으로 설정된다
		 * */
		Date date = new Date();
		System.out.println(date);
		
		//	기본 형태로 변환하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDate());
	}
		
}
