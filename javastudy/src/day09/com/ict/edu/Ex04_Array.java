package day09.com.ict.edu;

public class Ex04_Array {
	public static void main(String[] args) {
//		순위구하기
//		1. 모든 사람의 순위를 1등으로 초기값을 지정한다
//		2. 모든 사람과 비교해야 한다. (자기자신은 제외)
//		3. 나(i)보다 남(j)이 크면, 내 순위를 증가시킨다.

		int[] arr = { 90, 80, 70, 95, 90, 85, 75 };
		int[] placement = { 1, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i])
					placement[i]++;
			}
		}

		for (Integer integer : placement) {
			System.out.printf("%d ", integer);
		}
	}
}
