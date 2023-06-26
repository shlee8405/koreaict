package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		/*	카페모카 6500이다.
		 * 	친구와 둘이서 15000을 내고 주문했다
		 * 	잔돈은 얼마 인가? (단, 부가세 10%포함)
		 * */
		
		//given 
		int initPrice = 6500;
		int initTax = 10;
		double taxModifier = (initTax/100.0)+1;
		int numberOfCustomer = 2;
		int initCash = 15000;
		
		//desired output
		//leftover cash
		
		double totalExpenses = initPrice*taxModifier*numberOfCustomer;
		int receivedCash = initCash - (int)totalExpenses;
		
		System.out.println("Given a CaffeMocha is "+initPrice+", tax is "+initTax+"%, number of customer(s) is "
		+numberOfCustomer+", and the total initial cash is "+initCash);
		System.out.println("Total leftovers "+receivedCash);
		
		
	}
}
