package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {

	public static void main(String[] args) {
		Set<MemberVO> set = new HashSet<MemberVO>();
		
		// MemberVO 객체를 3개 생성한 후 Set에 담기
		// 단, id와 pwd가 같은 경우 담지 않도록 설정
		set.add(new MemberVO("hong123", "12345", "홍길동"));
		set.add(new MemberVO("hong123", "12345", "김길동"));
		set.add(new MemberVO("kim123", "12345", "홍길동"));
		
		
		System.out.println(set);
	}

}
