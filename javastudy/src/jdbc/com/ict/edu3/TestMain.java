package jdbc.com.ict.edu3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1.테이블 전체 데이터 보기 ");
		System.out.println("2.테이블 전체 데이터 보기 ");
		System.out.println("3.테이블 데이터 삽입 ");
		System.out.println("4.테이블 데이터 삭제 ");
		System.out.println("5.테이블 데이터 수정 ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		int choice = sc.nextInt();
		switch (choice) {
		case 1: 
			DAO.getInstance().getSelectAll();
			break;
		case 2:
			System.out.println("고객 아이디 입력하세요: ");
			String str = sc.next();
			DAO.getInstance().getSelectChoice(str);
			break;
		case 3:
			System.out.println("삽입 정보를 입력하세요");
			System.out.println("고객아이디 : ");
			String id = sc.next();
			System.out.println("고객이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			String age = sc.next();
			System.out.println("등급 : ");
			String rank = sc.next();
			System.out.println("직업 : ");
			String job = sc.next();
			System.out.println("적립금 : ");
			String saving = sc.next();
			DAO.getInstance().insertNewCustomer(id,name,age,rank,job,saving);
			break;
		case 4:
			System.out.println("삭제할 아이디 입력하세요 : ");
			String key = sc.next();
			DAO.getInstance().deleteRow(key);
			break;
		case 5:
			DAO.getInstance().getSelectAll();
			System.out.println("삽입 정보를 입력하세요");
			System.out.println("고객아이디 : ");
			String id2 = sc.next();
			System.out.println("고객이름 : ");
			String name2 = sc.next();
			System.out.println("나이 : ");
			String age2 = sc.next();
			System.out.println("등급 : ");
			String rank2 = sc.next();
			System.out.println("직업 : ");
			String job2 = sc.next();
			System.out.println("적립금 : ");
			String saving2 = sc.next();
			DAO.getInstance().updateTable(id2,name2,age2,rank2,job2,saving2);
			
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		
		
	}
}
