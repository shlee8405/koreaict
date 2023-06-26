package jdbc.com.ict.edu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbc.com.ict.edu4.VO;

// DB에 접속해서 각종 SQL를 처리하는 클래스
public class Ex02_DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	private static Ex02_DAO dao = new Ex02_DAO();

	public static Ex02_DAO getInstance() {
		return dao;
	}

	// DB 접속 메소드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##shlee";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
			System.out.println(e+"11");
		}
		return null;
	}

	// 각종 DB 처리 메서드
	// 전체보기
	public ArrayList<Ex02_VO> getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from customer order by custid";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ArrayList<Ex02_VO> list = new ArrayList<>();
			while (rs.next()) {
				Ex02_VO vo = new Ex02_VO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}

	// 삽입
	public int getInsert(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into customer(custid, name, address, phone) values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustId());
			pstm.setString(2, vo.getName());
			pstm.setString(3, vo.getAddress());
			pstm.setString(4, vo.getPhone());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return 0;
	}

	// 삭제
	public int getDelete(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustId());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0 ;
	}

	// 불러오기
	public Ex02_VO getSelectOne(Ex02_VO vo) {
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustId());
			rs = pstm.executeQuery();
			Ex02_VO vo2 = new Ex02_VO();
			while(rs.next()) {
				vo2.setCustId(rs.getString(1));
				vo2.setName(rs.getString(2));
				vo2.setAddress(rs.getString(3));
				vo2.setPhone(rs.getString(4));
			}
			return vo2;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}

	// 고치기
	public int getUpdate(Ex02_VO vo) {
		return 0;
	}

	public boolean getIdCheck(String custid) {
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "select custid from customer where custid =?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, custid);
			
			rs = pstm.executeQuery();
			
			int cnt = 0 ;
			if (rs.next()) {
				cnt++;
			} 
			if (cnt == 0) {
				idchk = true;
			}
			return idchk;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
				
			} catch (Exception e2) {
			}
		}

		// 중복이면 false, 중복아니면 true;
		return idchk;

	}
}
