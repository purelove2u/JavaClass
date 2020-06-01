package ui;

import java.sql.Connection;
import java.util.List;

import domain.UserVO2;
import persistence.UserDAO2;

public class UserOracle {

	public static void main(String[] args) {
		UserDAO2 dao = new UserDAO2();
		
		// 전체내용 가져오기
		List<UserVO2> list = dao.getList();
		for(UserVO2 vo : list) {
			System.out.println(vo);
		}
	}
}
