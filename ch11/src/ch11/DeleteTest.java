package ch11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class DeleteTest {
	public static void main(String[] args) {
		// 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/javadb?" + "useSSL=false&serverTimezone=UTC";
		
		String user = "javadb";
		String password = "12345";
		
		String sql = "delete from userTBL where no = 10";

		// 연결 생성
		try(Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			if(con != null) {
				// sql 실행
				int result = pstmt.executeUpdate(); //몇 개의 행이 실행되었는지 int로 return 해줌
				if(result > 0) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
