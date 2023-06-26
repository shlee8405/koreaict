package day11.com.ict.edu;

import java.util.Scanner;

public class Ex05_Animal {
	Scanner sc = new Scanner(System.in);
	
	
	
//	생존여부
	boolean live ; 
//	나이
	int age ;
//	이름
	String name ;
	
	
	public void setLive(boolean k1) {live = k1;} 
	public boolean getLive() {return live;}
	public void setAge(int k1) {age = k1;} 
	public int getAge() {return age;}
	public void setName(String k1) {name = k1;}
	public String getName() {return name;}
	
	public void setAll(boolean a1, int a2, String a3) {
		live = a1;
		age = a2;
		name = a3;
	}
	public void getAll() {
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %d%n", age);
		if (live)	System.out.printf("생사여부 : %b%n", live);
		else System.out.printf("생사여부 : %b%n", live);
	}
	
	/*
//	생존여부를 변경하는 메서드

	public void isAlive() {
		System.out.println("Is the animal alive? (y/yes)(n/no)");
		String str = sc.next();
		if (str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("y"))live=true;
		else live = false;
	}
//	생존여부를 반환하는 메서드
	public void printIsAlive() {
		if (live == true) System.out.printf("The animal is alive%n");
		else System.out.printf("The animal is dead%n");
	}
	
//	나이를 변경하는 메서드
	public void isAge() {
		System.out.println("How old is the animal? ");
		int num = sc.nextInt();
		age = num;
	}
//	나이를 반환하는 메서드
	public void printIsAge() {
		System.out.printf("The animal is %d years old%n",age);
	}
//	이름을 변경하는 메서드
	public void isName() {
		System.out.println("What is the name of the animal? ");
		String str = sc.next();
		name = str;
	}
//	이름을 반환하는 메서드
	public void printIsName() {
		System.out.printf("The animal's name is %s%n",name);
	}
	
//	모두 출력
	public void printAll() {
		System.out.println();
		String str = "";
		if(live ==true) System.out.printf("The animal's name is %s, it's alive, and it %d years old%n%n",name, age);
		else System.out.printf("The animal's name is %s, it's dead, and it was %d years old%n%n",name, age);
	
	}
	
//	ask again
	public void askAgain() {
		System.out.println("Any changes? ");
		String str = sc.next();
		if (str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("y"))live=true;
		else live = false;
		if(live==true) iteration();
		else ;
	}
	
	
//	one iteration
	public void iteration() {
		isAlive();
		printIsAlive();
		isAge();
		printIsAge();
		isName();
		printIsName();
		printAll();
		askAgain();
	}
	
	*/
}
