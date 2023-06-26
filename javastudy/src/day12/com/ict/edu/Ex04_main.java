package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		
	
//	총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
//	이름, 국어, 영어, 수학를 받아서 
//	총점, 평균, 학점, 순위를 구하고 
//	순위 기준으로 오름차순으로 정렬하여 
//	출력하는 main 메서드를 가지는 클래스를 만들어라 
//	단, 처리는 2차원배열을 이용해라

	// 키보드 입력을 위한 스캐너 객체 생성
	Scanner scan = new Scanner(System.in);

	// 키보드로 입력된 값을 저장할 임시변수
	int inputNum = 0;
	String inputStr = "";

	// 학생들을 저장할 HW0510LHJ_method 배열 선언;
	Ex04_get_set[] stuArr;

	int numOfStu = 0; // 학생수

	// 학생수 입력받기
	System.out.println("=== 성적 계산 프로그램 ===");
	System.out.print("학생수 : ");
	numOfStu = scan.nextInt();

	// 학생수만큼 HW0510LHJ_method 객체 생성
	stuArr = new Ex04_get_set[numOfStu];

	// 이름, 국어, 영어, 수학 입력받기
	for (int i = 0; i < numOfStu; i++) {
		Ex04_get_set stu = new Ex04_get_set();

		System.out.print("\n이름: ");
		inputStr = scan.next();
		stu.setName(inputStr);

		System.out.print("국어: ");
		inputNum = scan.nextInt();
		stu.setKor(inputNum);

		System.out.print("영어: ");
		inputNum = scan.nextInt();
		stu.setEng(inputNum);

		System.out.print("수학: ");
		inputNum = scan.nextInt();
		stu.setMath(inputNum);

		stu.setSum(); // 총점 구하기
		stu.setAvg(); // 평균 구하기
		stu.setGrade(); // 학점 구하기

		stuArr[i] = stu;
	}

	// 순위 구하기
	for (int i = 0; i < numOfStu; i++) {
		for (int j = 0; j < numOfStu; j++) {
			if (i == j)
				continue;
			if (stuArr[i].getSum() < stuArr[j].getSum()) {
				stuArr[i].rankUp();
			}
		}
	}

	// 순위 기준 오름차순 정렬하기
	// 정렬할 때 사용할 임시 변수 선언 및 생성
	Ex04_get_set tmp = new Ex04_get_set();

	for (int i = 0; i < numOfStu - 1; i++) {
		for (int j = i + 1; j < numOfStu; j++) {
			if (stuArr[i].getRank() > stuArr[j].getRank()) {
				tmp = stuArr[i];
				stuArr[i] = stuArr[j];
				stuArr[j] = tmp;
			}
		}
	}

	// 출력하기
	System.out.println("\n이름\t국어\t영어\t수학\t총점\t평균\t학점\t순위");
	for (int i = 0; i < numOfStu; i++) {
		System.out.println(stuArr[i].toString());
	}
}}
