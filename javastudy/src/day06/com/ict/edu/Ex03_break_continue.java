package day06.com.ict.edu;

import java.util.Iterator;

public class Ex03_break_continue {
	public static void main(String[] args) {
		
		/** break 와 continue
		 *  break : 현재위치에 블록을 탈출하는 예약어(명령어)
		 *  continue : continue문을 만나면 아래 수행문을 포기하고 다음 회차를 하기 위해 증감식으로 이동
		 *  보통 if문과 함께 사용한다.
		 */
		
		for (int i = 0; i < 10 ; i++) {
			if (i==4) {
				break;
			}
			System.out.print(i);
		} System.out.println();
		for (int i = 0; i < 10 ; i++) {
			System.out.print(i);
			if (i==4) {
				break;
			}
			
		}
		
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (i==4) {
				continue;
			}
			System.out.print(i);
		}	
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			if (i==4) {
				continue;
			}
		}
		
		
		System.out.println();
		System.out.println();
		
		boolean flag = true;
		if(flag) {
			// 0 - 10 홀수만 출력하자 (continue)
			
			for(int i = 0 ; i < 11; i++) {
				if(i%2==0) continue;
				System.out.print(i);
			}
			System.out.println();
			
			
		} else {
			System.out.println("S");
		}
	}
}
