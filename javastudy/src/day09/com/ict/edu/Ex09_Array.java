package day09.com.ict.edu;

import java.util.Iterator;

public class Ex09_Array {
	public static void main(String[] args) {
//		1. 선언과 생성을 하나로
//		자료형[][] 이름 = new 자료형[x][y] ;
		
		char[][] ch = new char[4][2];
		
//		고정길이 일때만 가능 
		ch[0][0] = 'A';
		ch[0][1] = 'a';
		ch[1][0] = 'B';
		ch[1][1] = 'b';
		ch[2][0] = 'C';
		ch[2][1] = 'c';
		ch[3][0] = 'D';
		ch[3][1] = 'd';

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.printf("%c",ch[i][j]);
			}
		}
		System.out.println();
		
		
		int[][] su = new int[3][2];
		
		int[] k1 = {10,20};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000};
		
		su[0] = k1;
		su[1] = k2;
		su[2] = k3;
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.printf("(%d,%d) %d\t",i,j,su[i][j]);
			}System.out.printf("\n");
		}
		System.out.println();
		
//		선언, 생성, 초기값 저장을 한번에
		
		String[][] str = { {"java","JAVA"} , {"가나","초코렛"}, {"12","89"}, {"kkk","#$%$^"}};
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.printf("(%d,%d) %4s\t",i,j,str[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
}



