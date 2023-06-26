package day12.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_get_set getSet = new Ex02_get_set();

////		이름 가져오기
//		String name = getSet.name;				// 객체 멤버 필드가 접근 제한이 걸리면 접근이 불가하다
//		System.out.println(name);				//
		String str = getSet.getName();
		System.out.println(str);

////		이름 변경
//		getSet.name = "일지매";
//		name = getSet.name;
//		System.out.println(name);
		getSet.setName("일지매");
		str = getSet.getName();
		System.out.println(str);
	}
//	
}
