package day11.com.ict.edu;

public class Ex05_AnimalTest {

	public static void main(String[] args) {
		Ex05_Animal animal = new Ex05_Animal();
		
		//이름 큰뿔소
		animal.setName("큰뿔소");
		//나이 3
		animal.setAge(3);
		//생존여부
		animal.setLive(true);
		
		//결과 출력
		String m1 = animal.getName();
		System.out.printf("이름 : %s%n", m1);
		int m2 = animal.getAge();
		System.out.printf("나이 : %d%n", m2);
		boolean m3 = animal.getLive();
		if (m3)	System.out.printf("생사여부 : %b%n", m3);
		else System.out.printf("생사여부 : %b%n", m3);
		
		//이름 pinguino
		animal.setName("Pinguino");
		//나이 1
		animal.setAge(1);
		//생존여부
		animal.setLive(true);
		
		System.out.printf("%n");
		
		String n1 = animal.getName();
		System.out.printf("이름 : %s%n", n1);
		int n2 = animal.getAge();
		System.out.printf("나이 : %d%n", n2);
		boolean n3 = animal.getLive();
		if (m3)	System.out.printf("생사여부 : %b%n", n3);
		else System.out.printf("생사여부 : %b%n", n3);
		
		System.out.printf("%n");
		
		animal.setAll(true, 2, "Jeff");
		animal.getAll();
		/*
		animal.iteration();
		*/
	}
	
}
