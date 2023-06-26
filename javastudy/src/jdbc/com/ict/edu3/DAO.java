package jdbc.com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//	DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
//								비즈니스로직을 분리하기 위해서 사용

//	DB에 접속해서 각종 SQL를 처리하는 클래스

//	싱글턴 패턴	:	소프트웨어 디자인 패턴에서 사용되는 패턴 중 하나이다
//				생성자가 여러차레 호출 되더라도 실제 생성되는 객체는 하나이고,
//				최초 생성 이후에는 호출된 생성자는 최초 생성자가 생성한 객체를 리턴한다.
//				가장 대표적인 것이 SPRING 이 기본적으로 싱글턴 패턴을 사용한다

	
public class DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao;
	}
	
	// DB 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
		}
		return null;
	}
	
	// 원하는 메서드를 만들어서 사용
	
	// 전체보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "SELECT * FROM 고객테이블";
			pstm = conn.prepareStatement(sql);
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\n");
			}
		} catch (Exception e) {
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
	
	public void getSelectChoice(String str) {
		
		try {
			conn = getConnection();
			String sql = "SELECT * FROM 고객테이블 WHERE 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, str);
			
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
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
	
	public void insertNewCustomer(String str1, String str2, String str3, String str4, String str5, String str6) {
		try {
			conn = getConnection();
			String sql = "INSERT INTO 고객테이블 VALUES (?, ?,? ,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,str1);
			pstm.setString(2,str2);
			pstm.setString(3,str3);
			pstm.setString(4,str4);
			pstm.setString(5,str5);
			pstm.setString(6,str6);
			
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	
	}
	
	public void deleteRow(String key) {
		try {
			conn = getConnection();
			String sql = "DELETE FROM 고객테이블 WHERE 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, key);
			result = pstm.executeUpdate();
			if(result > 0) {
				getSelectAll();
			} else {
				System.out.println("없는 아이디 입니다.");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}
	}
	
	public void updateTable(String str1, String str2, String str3, String str4, String str5, String str6) {
		try {
			conn = getConnection();
			String sql = "UPDATE 고객테이블 SET 고객이름 = ?, 나이 =?,등급=?,직업=?,적립금=? WHERE 고객아이디=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,str2);
			pstm.setString(2,str3);
			pstm.setString(3,str4);
			pstm.setString(4,str5);
			pstm.setString(5,str6);
			pstm.setString(6,str1);
			
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			} else {
				System.out.println("잘못되었습니다");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}






















