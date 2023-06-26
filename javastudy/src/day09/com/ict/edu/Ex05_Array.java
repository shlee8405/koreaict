package day09.com.ict.edu;

public class Ex05_Array {
	public static void main(String[] args) {
		//given
		String[] name = {"홍", "김", "이", "박", "고"};
		int[] kor = {80,90,80,70,100};
		int[] eng = {85,95,75,85,95};
		int[] math = {100,95,90,100,100};

		//new var
		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		String[] hak = new String[name.length];
		int[] rank = {1,1,1,1,1};
		
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
			for (int j = 0; j < rank.length; j++) {
					if(avg[j]>avg[i]) rank[i]++;

				
			}
		}
		System.out.printf("이름 \t총점 \t평균 \t학점 \t순위%n");
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%-8s",name[i]);
			System.out.printf("%-7d",sum[i]);
			System.out.printf("%-8.1f",avg[i]);
			System.out.printf("학점:%-4s",hak[i]);
			System.out.printf("등수:%-8s%n",rank[i]);
		}
	}
}
