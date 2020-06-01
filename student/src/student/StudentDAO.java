package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
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
	
	public int insertStudent(StudentVO vo) {
		int result = 0;
		
		String sql = "insert into student(no, name, grade, birth) values(?, ?, ?, ?)";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, vo.getNo());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getGrade());
			pstmt.setString(4, vo.getBirth());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<StudentVO> getList(){
		List<StudentVO> list = new ArrayList<StudentVO>();
		String sql = "select * from student";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentVO vo = new StudentVO(rs.getInt("no"), rs.getString("name"), rs.getInt("grade"), rs.getString("birth"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public StudentVO getStudentInfo(int no) {
		String sql = "select * from student where no = ?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				return new StudentVO(rs.getInt("no"), rs.getString("name"), rs.getInt("grade"), rs.getString("birth"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
