package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
//		학생 수 받기
//		키보드로 번호, 국어, 영어, 수학
//		총점, 평균, 학점, 순위(초기값지정)
//		순위
//		순위로 오름차순 정령
//		출력
		
//		번호 국어 영어 수학 총점 평균 학점 순위
//		0	1	2	3	4	5	6	7
		Scanner sc = new Scanner(System.in); 
		
		System.out.printf("학생 수? %n");
		
		
		int count = sc.nextInt();
		double[][] arr = new double[count][8];
		for (int i = 0; i < count; i++) {
			arr[i][0] = i+1;
//			inputs
			System.out.printf("%.0f번 학생, %n", arr[i][0]);
			System.out.printf("국어 점수는? %n");
			arr[i][1] = sc.nextInt();
			System.out.printf("영어 점수는? %n");
			arr[i][2] = sc.nextInt();
			System.out.printf("수학 점수는? %n");
			arr[i][3] = sc.nextInt();
			
//			total
			arr[i][4] = (arr[i][1]+arr[i][2]+arr[i][3]);
			
//			avg
			arr[i][5] = ((int)((arr[i][4]/3.0)*10))/10.0;
			
//			학점
			if(arr[i][5] >= 90) arr[i][6]='A';
			else if (arr[i][5] >= 80) arr[i][6] = 'B';
			else if (arr[i][5] >= 70) arr[i][6] = 'C';
			else arr[i][6] = 'F';
	
//			순위 초기값
			arr[i][7] = 1;
		}
		
//			순위 maker
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][4]<arr[j][4]) arr[i][7]++;
			}
		}
		
//			순위 shifter
		double[][] arrNew = new double[count][8];
		
		for (int i = 0; i < arr.length; i++) {
			arrNew[(int) (arr[i][7]-1)] = arr[i];
		}
		

//		PRINT
		System.out.printf("%n%n");
		System.out.printf("   학생번호\t   총점\t\t   평균\t\t   학점\t\t   순위%n");
		for (int i = 0; i < arrNew.length; i++) {
			for (int j = 0; j < arrNew[i].length; j++) {
				//학점print
				if(j==6) {
					if(arrNew[i][6]==65.0)
					System.out.printf("(%d,%d)A \t\t",i,j);
					else if(arrNew[i][6]==66.0) System.out.printf("(%d,%d)B \t\t",i,j);
					else if(arrNew[i][6]==67.0) System.out.printf("(%d,%d)C \t\t",i,j);
					else System.out.printf("(%d,%d)F \t\t",i,j);
				}
				else if(j==0) System.out.printf("(학생번호)%.0f \t",arrNew[i][j]);
				else if(j==4) System.out.printf("(총점)%.0f \t",arrNew[i][j]);
				else if(j==5) System.out.printf("(평균)%.1f \t",arrNew[i][j]);
				else if(j==7) System.out.printf("(순위)%.0f \t",arrNew[i][j]);
				else{
				}
			}System.out.printf("%n");
		}
	}
}
