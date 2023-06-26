package mybatis.com.ict.edu;

import java.util.Scanner;

/*	마이바티스 셋팅하기
 * 1. config.xml 만들기 	- DB 접속
 * 2. mapper.xml 만들기 	- 실제 SQL 작성하는파일 (실제 DB에 갖다와서 결과를 내보내는 파일)
 * 3. VO.java 			- DB에 들어갈 파라미터 및 결과를 저장을 담당하는 파일
 * 4. DAO.java			- mapper 와 연결되ㅐ어 자바에서 DB 실행시키는 파일
 * */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.println("     >>>>>>>>>>>>>     ");

		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("제대로 입력하세요");
			break;
		}
	}

}
