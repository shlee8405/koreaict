package day09.com.ict.edu;

public class Ex10_Array {
	public static void main(String[] args) {
//		가변 길이
		int[][] su = new int[3][2];
		
//		int[][] su2 = new int[][];		<ERROR
//		int[][] su3 = new int[][4];		<ERROR
		
//		su[0][0] = 10;
//		su[0][1] = 20;
//		su[1][0] = 100;
//		su[1][1] = 200;
//		su[2][0] = 1000;
//		su[2][1] = 2000;
		
//		가변길이는 무조건 1차원배열을 만들어서 넣어야 한다.
		int[] k1 = {10,20,30};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000,3000,4000};
		
//		위에서 만들배열을 다차원배열에 넣어라
		
		su[0]= k1;
		su[1]= k2;
		su[2]= k3;
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.printf("(%d,%d) %d\t",i,j,su[i][j]);
			}System.out.printf("\n");
		}
		System.out.println();
//		선언 생성, 저장 한번에
		String[][] str = {{"java","자바","JAVA"}, {"JSP"}, {"HTML","CSS"}};
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.printf("(%s,%d) %s\t",i,j,str[i][j]);
			}System.out.printf("\n");
		}
		
	}
}
