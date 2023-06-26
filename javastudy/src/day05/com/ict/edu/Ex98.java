package day05.com.ict.edu;

public class Ex98 {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a[i].length-1; j++) {
				a[i][j] = i+j;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(a);
	}
	
}


