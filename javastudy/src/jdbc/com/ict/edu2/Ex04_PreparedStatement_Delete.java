package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04_PreparedStatement_Delete {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("custid: ");
		int custid = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
//			보통은 primary key를 이용해서 삭제한다.
			String sql = "delete from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);
			result = pstm.executeUpdate();
			if(result>0) {
				sql = "select * from customer";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1)+ "\t");
					System.out.print(rs.getString(2)+ "\t");
					System.out.print(rs.getString(3)+ "\t");
					System.out.print(rs.getString(4)+ "\n");
				}
			} else {
				System.out.println("삭제 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
				
			} catch (Exception e2) {
			System.out.println(e2);
			}
		}
	}
}
