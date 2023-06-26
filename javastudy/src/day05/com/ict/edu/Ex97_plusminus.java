package day05.com.ict.edu;

public class Ex97_plusminus {
	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		int num = 199;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if(i%2==0) {
				sum-=i;
			} else {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
