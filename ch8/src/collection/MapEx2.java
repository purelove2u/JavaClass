package collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//요소 추가
		map.put("id_0123", "홍길동");
		map.put("id_0124", "박보검");
		map.put("id_0125", "송중기");
		map.put("id_0124", "현빈");
		
		// 모든 키 값 담기
		Set<String> key = map.keySet();
		// 키 값을 Iterator구조로 변경
		Iterator<String> iter = key.iterator();

		while (iter.hasNext()) {
			String id = iter.next();
			String value = map.get(id);
			System.out.println(id + " : " + value);
		}
		
		// 두 번째 방법
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}	
	}
}
