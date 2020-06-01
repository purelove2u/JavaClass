package Test;

public class MemberEx {

	public static void main(String[] args) {
		Member member = new Member("홍길동", "hong");
		
		if(member.login("hong", "12345")){
			System.out.println("로그인 되었습니다.");
			member.logout();
		}else {
			System.out.println("아이디와 비밀번호를 확인해주세요");
		}
		
	}

}
