package day08.com.ict.edu;

public class Ex99 {
	public static void main(String[] args) {
		
		//1번문제
		String str1 = "홍길d동";
		String str1_star = "";
		String str1_1 = "";
		String str1_2 = "";
		for(int i = 0 ; i < str1.length(); i++) {
			if(i>0 && i<str1.length()-1) {
				str1_star+="*";
				str1_1+=str1.charAt(i);
			}
			
		}
		str1_2 = str1.replace(str1_1, str1_star);
		System.out.println(str1_2);
		
		//2번문제
		
		String str2 = "010-1234-5678";
		String str2_1 = "";
		String str2_2 = "";
		String str2_star = "";
		for(int i = 0 ; i < str2.length(); i++) {
			if (i>=4 && i<=7) {
				str2_1 += str2.charAt(i);
				str2_star += "*";
			}
		}
		str2_2 = str2.replace(str2_1, str2_star);
		System.out.println(str2_2);
		
		//substring으로 1번 2번 문제
		
		
		

	}
}
