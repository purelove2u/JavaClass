package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class UserDAO {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/javadb?useSSL=false&serverTimezone=UTC";
		String user = "javadb";
		String password = "12345";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public int insertUser(String name, String birthday, String address) {
		int result = 0;
		String sql = "insert into userTBL(name, birthday, address) values(?, ?, ?)";
		try (Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){	//  DB서버로 미리 보내서 1.SQL파싱
			pstmt.setString(1, name);								//  2.실행계획을 세워서 작업할 준비함
			pstmt.setString(2, birthday);
			pstmt.setString(3, address);		
			result = pstmt.executeUpdate();							
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public UserVO getUser(int no) {
		String sql = "select * from userTBL where no = ?";
		UserVO vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, no);
			// select구문이기 때문에 반드시 아래 구문 실행
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getDate("birthday"));
				vo.setAddress(rs.getString("address"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public List<UserVO> getlList(){
		List<UserVO> list = new ArrayList<UserVO>();
		String sql ="select * from userTBL";
		UserVO vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setBirthday(rs.getDate("birthday"));
				vo.setAddress(rs.getString("address"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int updateUser(UserVO vo) {
		int result = 0;
		String sql = "update userTBL set address = ? where no = ?";
		try (Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, vo.getAddress());
			pstmt.setInt(2, vo.getNo());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int deleteUser(int no) {
		int result = 0;
		String sql = "delete from userTBL where no = ?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
