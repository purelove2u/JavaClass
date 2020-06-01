package collection;

import java.util.List;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		// List 계열은 배열과 같음
		// 객체 생성시 크기 지정이 필수요소가 아님
		// 순서를 가지고 있음
		// 데이터의 중복을 허용
		
		List<String> list = new Vector<String>();
		
		// 요소 삽입
		list.add("사과");
		list.add("딸기");
		list.add("수박");
		list.add("메론");
		list.add("포도");
		list.add("블루베리");
		
		// 요소 확인
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
