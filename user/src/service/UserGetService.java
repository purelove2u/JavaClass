package service;

import domain.UserVO;
import persistence.UserDAO;

public class UserGetService {
	public UserVO getUser(int no) {
		UserDAO dao = new UserDAO();
		return dao.getUser(no);
	}
}
