package ch4;
public class SubscriberInfo {
	String name, id, pwd, tel, addr;
	// 기본 생성자
	SubscriberInfo(){}
	// 인자를 모두 받는 생성자
	SubscriberInfo(String name, String id, String pwd, String tel, 
			String addr){
		this(name, id, pwd); // 아래 3줄 아래생성자에서 호출가능
//		this.name = name;
//		this.id = id;
//		this.pwd = pwd;
		this.tel = tel;
		this.addr = addr;
	}
	// 이름, 아이디, 비밀번호를 받는 생성자
	SubscriberInfo(String name, String id, String pwd){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	// Method
	// 비밀번호 변경(return x - 변경비밀번호를 받아 현재 비밀번호 변경)
	void changePwd(String pwd){
		this.pwd = pwd;
	}
	// 전화번호 변경(return x - 상동)
	void changeTel(String tel) {
		this.tel = tel;
	}
	// 주소등록(return x - 상동)
	void changeAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "[name = " + name + ", id = " + id + ", pwd = " + pwd +
				 ", tel = " + tel + ", addr = " + addr + "]";
	}
}
