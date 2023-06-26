package day09.com.ict.edu;

public class Ex08_Array {
	public static void main(String[] args) {
//		다차원 배열 : 1차원 배열이 여러개 모인 것
//		다차원 배열 종류 : 	기본자료형과 참조자료형
//						고정길이배열, 가변길이배열(다차원배열에만 존재)
		
//		고정길이 배열
//		1. 선언 : 자료형[][] 이름 ; 
		int su[][] ; 
		
//		2. 생성 : 이름 = new 자료형[1차원 배열 수][2차원 배열 수]
		su = new int[2][3]; // 1차원배열이 2개이고, 각 3개의 배열이 있다.
		
//		3. 초기화 :	이름[i][j] = 데이터;		이름[1][1] = x;
//					이름[i] = 배열상태인 데이터;	이름[1]= {x, y, z};
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.printf("(%d,%d)=%d \t",i,j,su[i][j]);
			}
			System.out.printf("%n");
		}
	}
}
