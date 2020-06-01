package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//요소 추가
		map.put("id_0123", "홍길동");
		map.put("id_0124", "박보검");
		map.put("id_0125", "송중기");
		map.put("id_0124", "현빈");
		
		Set<String> keyValue = map.keySet();	// 키 값만 가져오기
		System.out.println(keyValue);
		
		Collection<String> values = map.values();	// value 값만 가져오기
		System.out.println(values);
		
		//주요메소드
		System.out.println("키에 해당하는 값 가져오기 : " + map.get("id_0124"));
		System.out.println("키가 존재하는지 확인 : " + map.containsKey("id_0124"));
		System.out.println("값이 존재하는지 확인 : " + map.containsValue("박보검"));
		System.out.println("Map이 비어있는지 확인 : " + map.isEmpty());
		System.out.println("Map 크기 : " + map.size());
		System.out.println("Map 요소 삭제 : " + map.remove("id_0125"));

	}
}
