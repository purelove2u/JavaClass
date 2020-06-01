package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		
		String sql = "insert into userTBL(name, birthday, address) values('송중기', '2014-02-04', '서울시 강남구')";
		
		try(Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			if(con != null) {
				int result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("insert 성공");
				}else {
					System.out.println("insert 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
