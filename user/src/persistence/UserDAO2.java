package persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO2;

//~~DAO(Data Access Object): 데이터베이스와 관련한 작업을 하는 클래스
//~~VO, ~~DTO : 값들을 객체로 처리하는 클래스(바구니)
public class UserDAO2 {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user="javadb";
		String password="12345";
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return con;
	}//getConnection close
	
	public int insertUser(String username,String birthYear,String addr, String mobile) {
		int result=0;
		
		String sql="insert into userTBL(username,birthyear,addr) values(?,?,?)";

		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, username); 
			pstmt.setString(2, birthYear);
			pstmt.setString(3, addr);			
			pstmt.setString(4, mobile);
			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}//insertUser 종료
	
	public UserVO2 getUser(int no) {
		
		String sql="select * from userTBL where no=?";
		UserVO2 vo=null;
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			
			//select
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new UserVO2();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthyear(rs.getInt("birthyear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}//getUser 종료
	
	public List<UserVO2> getList(){
		List<UserVO2> list=new ArrayList<UserVO2>();
		
		String sql="select * from userTBL";
		
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				UserVO2 vo=new UserVO2();
				vo.setNo(rs.getInt("no"));
				vo.setUsername(rs.getString("username"));
				vo.setBirthyear(rs.getInt("birthyear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
				list.add(vo);
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}//getList 종료
	
	public int updateUser(UserVO2 vo) {
		int result=0;
		String sql="update userTBL set address=? where no=?";
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1, vo.getAddr());
			pstmt.setInt(2, vo.getNo());
			
			result=pstmt.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}//updateUser 종료
	
	public int deleteUser(int no) {
		int result=0;
		
		String sql = "delete from userTBL where no=?";
		try(Connection con=getConnection();
			PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);			
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}//deleteUser 종료
}
