package service;

import persistence.UserDAO;

public class UserDeleteService {
	public int delete(int no){
		// dao의 deleteUser() 호출
		UserDAO dao = new UserDAO();
		return dao.deleteUser(no);
	}
}
