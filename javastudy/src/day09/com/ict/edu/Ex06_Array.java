package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much iterations?");
		int count = sc.nextInt();
		String[] name = new String[count];
		int[] kor = new int[count];
		int[] eng = new int[count];
		int[] math = new int[count];
		int[] sum = new int[count];
		double[] avg = new double[count];
		String[] hak = new String[count];
		int[] rank = new int[count];
		
		
		for (int i = 0; i < count; i++) {

			
			System.out.println(i+1 +") Name? ");
			name[i] = sc.next();
			System.out.println(i+1 +") Korean score? ");
			kor[i] = sc.nextInt();
			System.out.println(i+1 +") English score? ");
			eng[i] = sc.nextInt();
			System.out.println(i+1 +") Math Score? ");
			math[i] = sc.nextInt();

		}

		//sum
		for (int i = 0; i < name.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
		}
		
		//avg
		for (int i = 0; i < name.length; i++) {
			avg[i] = (((int)((kor[i]+eng[i]+math[i])/3.0*10)/10.0));
		}
		
		//hakjeom
		for (int i = 0; i < name.length; i++) {
			hak[i] = (avg[i]>=90) ? "A" : 
				(avg[i]>=80) ? "B":
					(avg[i]>=70) ? "C" : 
						"F";
		}
		
		//rank 
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < rank.length; j++) {
					if(avg[j]>avg[i]) rank[i]++;

				
			}
		}
		System.out.printf("이름 \t총점 \t평균 \t학점 \t순위%n");
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%s\t",name[i]);
			System.out.printf("%d\t",sum[i]);
			System.out.printf("%.1f\t",avg[i]);
			System.out.printf("학점:%s\t",hak[i]);
			System.out.printf("등수:%s\t%n",rank[i]);
		}
	}
}
