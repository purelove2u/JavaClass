package domain;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	// UserTBL Table
	private int userNo;
	private String userId;
	private String password;
	private String name;
	private String email;

	// 기본(default) 생성자
	public UserVO() {
		super();
	}

	// 매개변수를 인자로 받는 생성자
	public UserVO(int userNo, String userId, String password, String name, String email) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	// Getter & Setter
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString
	@Override
	public String toString() {
		return "UserVO [userNo= " + userNo + ", userId= " + userId + 
			   ", password= " + password + ", name= " + name + ", email= " + email + "]";
	}
}
