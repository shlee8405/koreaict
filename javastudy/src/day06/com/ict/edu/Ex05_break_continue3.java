package day06.com.ict.edu;

public class Ex05_break_continue3 {
	public static void main(String[] args) {
		/*
		 * break label: 레이블이 지정한 블록 탈출 continue label: 레이블이 지정한 블록 증감식으로 이동
		 * 
		 * after a label, there must be a statement(if, for, while, etc.)
		 */

		search: for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
			for (int j = 1; j < 6; j++) {
				if (i == 2) {
					break search;
				}
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println("World");
		}
		System.out.println();
		System.out.println();
		
		search: for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
			for (int j = 1; j < 6; j++) {
				if (j == 2) {
					continue search;
				}
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println("World");
		}

	}
}
