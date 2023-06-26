package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
//		문자열을 추가할 때 사용 (메모지 주소가 변경되지 않는다)
//		추가할 때 append() 사용
//		toString() => String 변환

		StringBuffer sb = new StringBuffer("ictedu");
		sb.append("HelloWorld");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println();
		System.out.println();
//		StringTokenizer : 	구분자 문자열 분리, (split) 과 차이점은 배열의 크기를 지정 못함
//							구분자가 없으면 (뜨어쓰기, 탭, 줄바꾸기)로 알아서 구분한다

		String str = "사과, 바나나, 망고, 오렌지, 수박";
		StringTokenizer st = new StringTokenizer(str, ", ");
//		System.out.println(st.nextToken());
		while(st.hasMoreElements()) {
			String res = st.nextToken();
			System.out.println(res);
		}
		
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		
		
		
		
	}
}
