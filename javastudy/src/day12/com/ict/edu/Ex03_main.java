package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();
		Ex03_get_set ion = new Ex03_get_set();
		Ex03_get_set cola = new Ex03_get_set();
		Ex03_get_set juice = new Ex03_get_set();
		
		coffee.setName("coffee");
		coffee.setPrice(1000);
		ion.setName("ion");
		ion.setPrice(1500);
		cola.setName("cola");
		cola.setPrice(1200);
		juice.setName("juice");
		juice.setPrice(1800);
		
		Ex03_get_set[] arr = {coffee, ion, cola, juice};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >> ");
		int input = sc.nextInt();
		
		//find the minimum price
		int min = arr[0].getPrice();
		for (int i = 0; i < arr.length; i++) {
			if(min >= arr[i].getPrice()) {
				min = arr[i].getPrice();
			}
		}
		
		if(input<min) {
			System.out.println("Out Of Money.");
		} else {
			System.out.println("coffee\tion\tcola\tjuice");
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice()<=input) {
				System.out.print("O\t");
			} else {System.out.print("X\t");}
		}
		System.out.println();
		System.out.println();
		
	
	}
//	
}
