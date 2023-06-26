package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//	1. 자바와 오라클을 연결하기 위해서 ojdbc8.jar(드라이버) 를 다운받고 util에 넣었다
//	2. 프로젝트에 ojdbc8.jar 등록하자
//		프로젝트에 마우스 오른쪽 - build path - config
public class Ex01_Statement_Select {
	public static void main(String[] args) {
//		1. java를 오라클에 접속할 수 있도록 도와 주는 클래스
		Connection conn = null;
//		2. SQL 구문을 작성을 도와주는 클래스
		Statement stmt = null;
//		3-1. select 문의 결과를 받는 클래스
		ResultSet rs = null; 
//		3-2. select 문을 제외한 (delete, update, insert) 결과를 받는 변수 
		int result = 0;
		
		try {
//		4. jdbc 드라이버 로딩 : 오라클, MySQL 등 각 각 내용이 다르다
			Class.forName("oracle.jdbc.driver.OracleDriver");
//		5. 접속하기 위한 정보 저장
//			오라클, MySql 각 각 내용이 다르다.
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
//		6. 접속하기 :
			conn = DriverManager.getConnection(url,user,password);
//		7. SQL 작성하기
			String sql = "SELECT * FROM 고객테이블";
//		8. SQL를 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
//		9. SQL를 담아서 보내고 결과 받기
//			9-1. SELECT
			rs = stmt.executeQuery(sql);
//			9-2. SELECT 제외
//			result = stmt.executeUpdate(sql);
			
			while (rs.next()) {
//				System.out.print(rs.getString(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getString(3)+"\t");
//				System.out.print(rs.getString(4)+"\t");
//				System.out.print(rs.getString(5)+"\t");
//				System.out.print(rs.getString(6)+"\n");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	
	}
}
