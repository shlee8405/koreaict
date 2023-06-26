package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		/*
		 * 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고 원하는 나라가 key값이 되야, 
		 * 화면에서 나라를 물어보면 수도가
		 * 출력되는 프로그램 작성
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
//				key		value
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Scanner sc = new Scanner(System.in);
		System.out.print("나라입력:>>");
		String str = sc.next();
		if (map.containsKey(str))
			System.out.println(map.get(str));
		else
			System.out.println("잘못입력하셨습니다");

	}

}
