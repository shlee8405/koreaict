package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {
//		정렬하기
		int[] su = {3,4,9,8,2,1,7,10,5,6};
		
//		자리변경을 위한 임시변수 필요
		int tmp = 0;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (j>i) if(su[j]<su[i]) {
					int num1 = su[j];
					int num2 = su[i];
					su[j] = num2;
					su[i] = num1;
				} 
			}
		}
		for (int i : su) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		int[] su2 = {3,4,9,8,2,1,7,10,5,6};
		
//		Arrays 클래스는 배열 복사, 정렬, List 로 전환 등
//		배열에 관련된 기능을 제공하는 클래스
//		오름차순 정렬은 sort() 로 가능
//		내림차순은 없음
		Arrays.sort(su2);
		for (int i : su2) {
			System.out.printf(" %d",i);
		}
		System.out.println();
		
		Integer[] su3 = {3,4,9,8,2,1,7,10,5,6};
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.print(su3[i]+" ");
		}
		
		/*Arrays.sort(su3);
		int[] su4 = new int[su3.length];
		for (int i = 0; i < su3.length; i++) {
			su4[i]= su3[su3.length-1-i];
		}
		for (int i : su4) {
			System.out.printf(" %d",i);
		}*/
		
	}
}