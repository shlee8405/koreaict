package day11.com.ict.edu;

public class Ex04_method {
	int su1 = 10;
	int su2 = 20;
	int result = 0;
	
//	메서드이름([인자],...)
//	인자 : 메서드가 실행 할 때 외부에서 필요한 정보를 받기 위한 통로 이다
//	인자의 수, 자료형에 따라서 같은 이름의 메서드를 여려개 만들 수 있다.			<< 오버로딩
	
	
//	더하기
	public void add() {
		result = su1 + su2;
	}
	public void add(int x) {
		result = x + su2;
	}
	public void add(int x, int y) {
		result = x + y ;
	}
	
	
//	빼기
	public int sub() {
		result = su1 - su2;
		return result;
	}
	public int sub(int x) {
		int res = x - su2;
		return res;
	}
	public int sub(int x , int y) {
		result = x - y;
		return result;
	}
	
	
	
	
}








