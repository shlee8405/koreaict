package day05.com.ict.edu;

public class Ex96_homework {
	public static void main(String[] args) {
		// 농구공 5개씩 한박스
		// 40, 8박스, 26개면 6개
		int k1 = 127;
		int k2 = 127 % 5;
		if (k2 == 0) {
			System.out.println(k1 / 5 + "박스");
		} else {
			System.out.println((k1 / 5) + 1 + "박스");
		}
		System.out.println();

		// for문으로 풀기
		k1 = 0;
		k2 = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/*for (int i = 1 ; i < 17 ; i++) {
			System.out.print("0 ");
			if(i % 4 == 0 ) {
				System.out.println();
			}
		}*/

		System.out.println();
		// for문
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		System.out.println();

		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		// 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum = 0;
		int count = 0;

		while (true) {
			for (int i = 1; i <= count; i++) {
				if (i % 2 == 0) {
					sum -= i;
				} else {
					sum += i;
				}
			}
			if (sum >= 100)
				break;
			count++;
		}
		System.out.println(count);
		System.out.println();
		
		
		int sum2 = 0;
		int count2 = 0;
		boolean flag = true;
		
		for(int i = 0; flag; i++) {
			if (i%2==0) {
				sum2-=i;
			} else {
				sum2+=i;
				if(sum2>=100) {
					System.out.println(count2);
					flag = false;
				}
			}
			count2++;
		}
		
		
		int sum3 = 0; 
		int x = 0;
		for (x =0 ; sum3<100; x++) {
			if(x%2==0) {
				sum3-=x;
			} else sum3+=x;
		}
		System.out.println(x);

		
		
		/*
		 * 별찍기
		 */

		int starCount = 4;
		int spaceCount = 0;
		String star = "*";
		String space = " ";

		for(int i = 1 ; i <= starCount; i++) {
			spaceCount = starCount -i;

			for(int j = 1 ; j <= i; j++) {
				System.out.print(star);				
			}
			for(int k = 1 ; k <= spaceCount; k++) {
				System.out.print(space);
			}
			System.out.println();
		}
		System.out.println();
		
		/*for(int i = 1 ; i <= starCount; i++) {
			for(int j = 1 ; j <= starCount; j++) {
				if(i+j>=5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		*/
		for(int i = 1 ; i <= starCount; i++) {
			for(int j = 1 ; j <= starCount; j++) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		for(int i = starCount ; i >= 1; i--) {
			for(int j = 1 ; j <= starCount; j++) {
				if(j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		
		
		System.out.println();
		
		for (int i = 1; i <= starCount; i++) {
			spaceCount = starCount - i;
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(space);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i < 5; i++) {
			for(int j = -1; j > -5; j--) {
				if(i+j>=0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		
		

	}
}
