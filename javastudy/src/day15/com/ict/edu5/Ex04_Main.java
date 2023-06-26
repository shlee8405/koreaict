package day15.com.ict.edu5;

import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("선택하세요 >> 1.고양이, 2.강아지");
			int su = sc.nextInt();

			//다형성의 정적바인딩: Based on compiling runtime
//			switch (su) {
//			case 1:
//				Ex04_Cat cat = new Ex04_Cat();
//				cat.sound();
//				cat.play();
//				break;
//			case 2:
//				Ex04_Dog dog = new Ex04_Dog();
//				dog.sound();
//				dog.play();
//				break;
//			default:
//				break;
//			}
			
			//다형석의 동적바인딩 
			Ex04_Abstract animal = null;
			switch(su) {
			case 1: animal = new Ex04_Cat(); break;
			case 2: animal = new Ex04_Dog(); break;
			}
			animal.sound();
			animal.play();
			
			//부모클래스를 선언했으므로 자식클래스만 가진 메소드는 사용 못함

		}
	}
}
