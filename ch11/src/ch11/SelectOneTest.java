package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOneTest {
	// 하나만 가져오기
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		
		String sql = "select * from userTBL where no=1";
		try(Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			if(con != null) {
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getDate(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
