package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_Array {
	public static void main(String[] args) {
//		번호 국어 영어 수학 총점 평균 학점 순위
//		0	1	2	3	4	5	6	7
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How much iterations?");
//		int count = sc.nextInt();
		
		int[][] p = new int[5][];
//					번호	총점	평균	학점	순위
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 280, 950, 'A', 1};

		p[0] = p1 ;
		p[1] = p2 ;
		p[2] = p3 ;
		p[3] = p4 ;
		p[4] = p5 ;
//		순위를 구하자
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				if(p[i][1]<p[j][1]) p[i][4]++;
			}
		}
		int[][] pNew = new int[5][5];
		for (int i = 0; i < pNew.length; i++) {
			pNew[p[i][4] - 1] = p[i];
		}
////		순위로 오름
//		for (int i = 0; i < p.length; i++) {
//			for (int j = 0; j < p.length; j++) {
//				if (p[j][5] > p[i][5])
//					placement[i]++;
//			}
//		}
//		출력
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < pNew.length; j++) {
				System.out.print(pNew[i][j]+" ");
			}
			System.out.println();
		}

		
	}
}
