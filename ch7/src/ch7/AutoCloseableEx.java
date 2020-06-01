package ch7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AutoCloseableEx {
	public static void main(String[] args) {
		// jdk 7 버전에서 추가됨
		// 자동 자원 반환(try-with-resources 문)
		// 조건 : java.lang.AutoCloseable를 구현하고 있어야 됨
		
		// try() 안에 들어오는 모든 자원에 대해서 자동으로
		// 닫기를 해주는 방식 => finally 사용하지 않아도 됨
		try (Connection con = DriverManager.getConnection("","","");
				PreparedStatement pstmt = con.prepareStatement("")){
			
		} catch (SQLException e) {

		}
	}
}
