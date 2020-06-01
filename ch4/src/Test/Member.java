package Test;

public class Member {
	// 이름 : name (문자열)
	// 아이디 : id (문자열)
	// 비번 : password (문자열)
	// 나이 : age (정수)
	String name, id, password;
	int age;
	
	// 생성자 : name과 id필드를 받아서 초기화
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	// login() method
	// 전달인자로 id와 password 를 전달받아 id 가 hong이고
	// password가 12345인 경우 true를 return
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) { 
			return true;
		}
		return false;
	}
	// logout() method
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	// "로그아웃 되었습니다." 메시지 출력
}
