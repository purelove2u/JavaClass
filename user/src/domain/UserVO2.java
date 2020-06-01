package domain;

import java.sql.Date;

public class UserVO2 {
	// userTBL 레코드 필드 값과 동일하게 맞추기
	private int no;
	private String username;
	private int birthyear;
	private String addr;
	private String mobile;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UserVO2 [no=" + no + ", username=" + username + ", birthyear=" + birthyear + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}
	
	
}
