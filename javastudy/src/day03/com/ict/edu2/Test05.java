package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * */
		
		//given
		int input = 3781;
				
				
		//output
		//find the thousand's, hundred's, tenth's, one's place number as a single int
		/*like: 천의 자리 :
		 * 		백의 자리 :
		 * 		십의 자리 :
		 * 		일의 자리 :
		 * 
		 * */
		int ones;
		int numAfterOnes;
		int tenths;
		int numAfterTenths;
		int hundreds;
		int numAfterHundreds;
		int thousands;
		//int numAfterThousands; not needed
		
		int onesReal;	
		int tenthsReal;
		int hundredsReal;
		int thousandsReal;

		
		ones = input % 10;
		numAfterOnes = input - ones;
		tenths = numAfterOnes % 100;
		numAfterTenths = numAfterOnes - tenths;
		hundreds = numAfterTenths % 1000 ;
		numAfterHundreds = numAfterTenths - hundreds;
		thousands = numAfterHundreds % 10000;
		//numAfterThousands = numAfterTenths - thousands; not needed
		
		onesReal = ones / 1;
		tenthsReal = tenths/10;
		hundredsReal = hundreds/100;
		thousandsReal = thousands/1000;
		
		System.out.println("천의 자리 : "+thousandsReal);
		System.out.println("백의 자리 : "+hundredsReal);
		System.out.println("십의 자리 : "+tenthsReal);
		System.out.println("일의 자리 : "+onesReal);

		
	
	}
}
