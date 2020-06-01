package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		
		String sql = "update userTBL set address = '제주도 제주시' where no = 1";
		
		try(Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			if(con != null) {
				// insert, delete, update 쿼리문 실행
				int result = pstmt.executeUpdate();
				if(result > 0) {
					System.out.println("업데이트 성공");
				}else {
					System.out.println("업데이트 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
