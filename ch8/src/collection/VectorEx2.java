package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("박보검");
		list.add("박지원");
		list.add("하정우");
		list.add("추격자");
		list.add("4885");
		list.add("잡아라");
		
		System.out.println(list);			// toString 오버라이딩 되어있음
		System.out.println(list.size());	// list의 크기
		System.out.println(list.isEmpty());	// list가 비어있는지 여부
		System.out.println(list.contains("추격자")); // 담고 있는지 여부
		System.out.println("특정요소 : "+ list.get(3));
		System.out.println(list.remove(0));	//
		System.out.println(list);
		
		list.sort(Comparator.naturalOrder());	// 오름차순
		System.out.println("오름정렬 후 : " + list);
		list.sort(Comparator.reverseOrder());	// 내림차순
		System.out.println("내림정렬 후 : " + list);

		// 리스트를 배열로 변경
		Object[] strArr = list.toArray();
		System.out.println(strArr);
		System.out.println(Arrays.toString(strArr));
		
		list.clear();						// list 객체 모두 삭제
		System.out.println(list);			//
		
		
		String fruit[] = {"사과", "딸기", "바나나", "수박","참외", "자두"};
		System.out.println(fruit);
		System.out.println(Arrays.toString(fruit));
		
		//List<String> fruits = Arrays.asList(fruit);  java.lang.UnsupportedOperationException
		List<String> fruits = new Vector<String>(Arrays.asList(fruit));
		System.out.println(fruits);
		
		fruits.add("메론");
		
	}
}
