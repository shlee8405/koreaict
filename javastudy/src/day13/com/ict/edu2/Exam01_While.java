package day13.com.ict.edu2;

import java.util.Iterator;

public class Exam01_While {
	public static void main(String[] args) {
//		int[][] arr = new int[5][5];
//		int[] p1 = { 1, 270, 90, 'A', 1 };
//		int[] p2 = { 2, 210, 70, 'C', 1 };
//		int[] p3 = { 3, 180, 60, 'F', 1 };
//		int[] p4 = { 4, 300, 100, 'A', 1 };
//		int[] p5 = { 5, 285, 95, 'A', 1 };
//
//		arr[0] = p1;
//		arr[1] = p2;
//		arr[2] = p3;
//		arr[3] = p4;
//		arr[4] = p5;
//		
//		
//		for (int i = 0; i < p5.length; i++) {
//			for (int j = 0; j < p5.length; j++) {
//				if (i==j) {
//					continue;
//				}
//				if(arr[i][1] < arr[j][1]) {
//					arr[i][4]++;
//				}
//			}
//		}
//		
//		int[] temp = new int [5];
//		
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp.length; j++) {
//				if(arr[i][4]>arr[j][4]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		
//		for (int i = 0; i < p5.length; i++) {
//			for (int j = 0; j < temp.length; j++) {
//				System.out.print(arr[i][j]+"\t") ;
//			}
//			System.out.println();
//		}

		int[] su = {4,2,3,5,1};
		int[] newSu = new int[su.length];
		for (int i = 0; i < su.length; i++) {
			newSu[su[i]-1] = su[i];
		}
		for (int i = 0; i < newSu.length; i++) {
			System.out.println(newSu[i]);
		}
	}
}
