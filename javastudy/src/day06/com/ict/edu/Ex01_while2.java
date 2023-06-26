package day06.com.ict.edu;

public class Ex01_while2 {
	public static void main(String[] args) {
		int i = 2; 
		int j = 1;
		
		while (i<=9) {
			j=1;
			while (j<=9) {
				System.out.print(j+" X "+i+" = "+ i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
