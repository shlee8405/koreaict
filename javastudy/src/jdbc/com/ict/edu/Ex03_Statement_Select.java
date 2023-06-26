package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03_Statement_Select {
	public static void main(String[] args) {

		// 1. 자바를 오라클에 접속할 수 있도록 도와 주는 클래스
		Connection conn = null;

		// 2. SQL 구문을 작성을 도와주는 클래스
		Statement stmt = null;

		// 3-1 Select 문의 결과를 받는 클래스
		ResultSet rs = null;

		// 3-2 Select 문을 제외한 (delete, update, insert) 결과를 받는 변수
		int result = 0;

		try {
			// 4.jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 5. 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
			// 6. 접속하기
			conn = DriverManager.getConnection(url, user, password);
			// 7. SQL 작성하기
			String sql = "SELECT * FROM 고객테이블 WHERE 고객이름 like '김%'";
			// 8 SQL 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
			// 9 sql 담아서 보내고 결과 받기
			// 9-1 SELECT
			rs = stmt.executeQuery(sql);
			// 9-2 SELECT제외
//				result = stmt.executeUpdate(sql);

			while (rs.next()) {

				System.out.printf("%-10s%-15s\t%-10s\t%-10s%n", rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4));

//					System.out.print(rs.getString(1)+"\t");
//					System.out.print(rs.getString(2)+"\t\t\t");
//					System.out.print(rs.getString(3)+"\t");
//					System.out.println(rs.getString(4)+"\t");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
				// TODO: handle exception
			}
		}
	}
}
