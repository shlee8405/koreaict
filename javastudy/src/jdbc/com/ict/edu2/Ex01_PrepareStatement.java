package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_PrepareStatement {
	public static void main(String[] args) {
//		오라클에 접속해서 처리하는 클래스 3개
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
//			드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			오라클에 접속할 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
//			오라클에 접속
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from 고객테이블";
			pstm = conn.prepareStatement(sql);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
