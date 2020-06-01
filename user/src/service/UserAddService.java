package service;

import persistence.UserDAO;

public class UserAddService {
	public boolean insert(String name, String birthday, String address) {
		// 사용자가 입력한 정보를 가지고 DB작업하기
		UserDAO dao = new UserDAO();
		int result = dao.insertUser(name, birthday, address);
		
		return result > 0? true : false;
	}
}
