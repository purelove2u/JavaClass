package user;

import java.sql.Date;

public class UserVO {
	// userTBL 레코드 필드 값과 동일하게 맞추기
	private int no;
	private String name;
	private Date birthday;
	private String address;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "[no=" + no + ", name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	
}
