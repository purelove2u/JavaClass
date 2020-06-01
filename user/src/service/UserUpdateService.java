package service;

import domain.UserVO;
import persistence.UserDAO;

public class UserUpdateService {
	public int update(UserVO vo) {
		UserDAO dao = new UserDAO();
		return dao.updateUser(vo);
	}
}
