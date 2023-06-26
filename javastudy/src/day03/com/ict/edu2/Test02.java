package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		/*	2 시간 40분 30초는 몇 초 일까요?
		 * */
		
		//given
		int sec = 30;
		int min = 40; 
		int hr = 2 ; 
		 
		
		//desired output
		//hrs and mins in secs
		int minToSec = min * 60 ;
		int hrToSec = hr * 3600 ;
		
		int newSec = sec + minToSec + hrToSec;
		System.out.println("Given " +hr+" hours, " +min+" minutes, "+sec+" seconds,");
		System.out.println("The total amount of Seconds is "+ newSec);
		
	}
}
