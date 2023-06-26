package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		/*	java version 8.0 이상만 가능
		 * 	LocalDate : 날짜 정보만 필요할 때
		 * 	LocalTime : 시간 정보만 필요할 때
		 * 	LocalDateTime : 날짜, 시간 모두 필요할 때
		 * */
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		
		System.out.println("날짜");
		System.out.println("getYear() \t: " + cDate.getYear());
		System.out.println("getMonth() \t: " + cDate.getMonth());
		System.out.println("getMonthValue()\t: " + cDate.getMonthValue());
		System.out.println("getDayOfYear() \t: " + cDate.getDayOfYear());
		System.out.println("getDayOfMonth()\t: " + cDate.getDayOfMonth());
		System.out.println("getDayOfWeek() \t: " + cDate.getDayOfWeek());
		System.out.println("isLeapYear() \t: " + cDate.isLeapYear());
		System.out.println();
		
		System.out.println("-- 시간 --");
		System.out.println("getHour()\t: "+ cTime.getHour());
		System.out.println("getMinute()\t: "+ cTime.getMinute());
		System.out.println("getSecond()\t: "+ cTime.getSecond());
		System.out.println("getNano()\t: "+ cTime.getNano());
		System.out.println();
		
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS")));
		System.out.println();
		
		System.out.println("-- 날짜비교 --");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023, 05, 20);
		Period period = Period.between(sDate, eDate);
		

		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate));
		System.out.println();
		
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		System.out.println(sDate.plusDays(17));
		
		
		
		
		
		
	}
}











