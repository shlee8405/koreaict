package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		/*	3989초는 몇시간, 몇분, 몇초 인가
		 * */
		
		//given
		int sec = 3989;
		
		int newSec ;
		int min ;
		int hr ;
		int remainderSec ;
		int remainderMin ;
		int newMin ;
		int remainderHr ;
		
		
		
		remainderSec = sec%60;		//remainder of seconds
		newSec = sec - remainderSec;	//getting rid of remainder
		min = newSec / 60;				//number of minutes After getting rid of remainder
		remainderMin = min%60;		//remainder of minutes
		newMin = min - remainderMin; //getting rid of remainderMin
		hr = newMin/60 ;			//number of hours after getting rid of remainderMin
		remainderHr = hr%24 ;		//
		
		
		//output
		System.out.println("3989seconds is " + remainderHr +" hours, "+ remainderMin
				+ " minutes, "+remainderSec+" seconds.");
		
	}
}
