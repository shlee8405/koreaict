package day12.com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05_Constructor p1 = new Ex05_Constructor();
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddr());
		System.out.println();
		
		Ex05_Constructor p2 = new Ex05_Constructor("Hello");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println();

		Ex05_Constructor p3 = new Ex05_Constructor("이수환", 25, "과테말라");
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p3.getAddr());
		System.out.println();

		Ex05_Constructor p4 = new Ex05_Constructor("둘리", 1918919289);
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4.getAddr());
		System.out.println();
	}
}
