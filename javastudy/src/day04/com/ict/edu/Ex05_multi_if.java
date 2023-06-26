package day04.com.ict.edu;

public class Ex05_multi_if {


	public static void main(String[] args) {
		/*	다중 IF문
		 * 	형식 ) if (조건식1) {
		 * 			조건식1이 참일때 문장;
		 * 			조건식1이 참일때 문장; 
		 * 		} else if (2) {
		 * 			조건식 1x && 조건식2이 참일때 문장; 		
		 * 			조건식 1x && 조건식2이 참일때 문장; 		
		 * 		} else if (3) {
		 * 			조건식1x2x && 조건식2이 참일때 문장; 		
		 * 			조건식1x2x && 조건식2이 참일때 문장; 		
		 * 		} else {
		 * 			나머지;
		 * 		}		  
		 * */
		
		//int k1의 점수가 90이상이면A >80B >70C else F
		
		
		int k1 = 82;
		String str1 = "null";
		if (k1>=90) {
			str1 = "A";
		} else if (k1>=80) {
			str1 = "B";
		} else if (k1>=70) {
			str1 = "C";
		} else {
			str1 = "FFFFFFFFFFFFFFF";
		}
		
		System.out.println(str1);
		System.out.println();//break
		System.out.println();//break
		System.out.println();//break
		
		
		
		
		
		//char k2 is upper lower number or other
		
		char k2 = 'F';
		String str2 = "null";
		if (k2<='Z'&&k2>='A') {
			str2 = "UPPER";
		} else if ('a'<=k2 && k2 <= 'z') {
			str2 = "lower";
		} else if ('0'<= k2 && k2 <= '9') {
			str2 = "number";
		} else {
			str2 = "random";
		}
		System.out.println(str2);
		System.out.println();//break
		System.out.println();//break
		System.out.println();//break
		
		
		
		
		// char k3 if a or A africa, bB, brazil, cC canada, else korea
		
		char k3 = 'A';
		String str3 = "null";
		
		if (k3=='a'||k3=='A') {
			str3 = "Africa";
		} else if (k3 == 'b' || k3 == 'B') {
			str3 = "Brazil";
		} else if (k3 == 'c' || k3 == 'C') {
			str3 = "Canada";
		} else {
			str3 = "South Korea";
		}
		System.out.println(str3);
		System.out.println();//break
		System.out.println();//break
		System.out.println();//break
		
		
		
		//if menu 1, mocha. menu2 latte. menu3 americano. menu4 fruitpunch.
		// 2 people pay 10000 to drink. how much is change. (tax 10%)
		/*
		String menuName1 = "Mocha" ;
		String menuName2 = "Latte" ;
		String menuName3 = "Americano" ;
		String menuName4 = "FruitPunch" ;
		*/
		int menuPrice1 = 3500;
		int menuPrice2 = 4000;
		int menuPrice3 = 3000;	
		int menuPrice4 = 3500;
		int startCash = 10000;
		double cashModifier = 1.1;
		
		int menu = 1 ;
		
		String str4 = "null" ; 
		
		if (menu == 1) {
			System.out.println(startCash-(int)(menuPrice1*2*cashModifier)); 
		} else if (menu == 2) {
			System.out.println(startCash-(int)(menuPrice2*2*cashModifier)); 
		} else if (menu == 3) {
			System.out.println(startCash-(int)(menuPrice3*2*cashModifier)); 
		} else if (menu == 4) {
			System.out.println(startCash-(int)(menuPrice4*2*cashModifier)); 
		} else {
			str4 = "Wrong menu";
			System.out.println(str4);
		}
		System.out.println();//break
		System.out.println();//break
		System.out.println();//break
		
	}
	
}
