package collection;

import java.util.Arrays;
import java.util.List;

public class FindKim {
	public static void main(String[] args) {
		String names[] = {"Queen", "Tod", "Kim", "Park", "Choi"};
		
		System.out.println(findKim(names));
		
	}
	
	public static String findKim(String names[]) {
		//넘겨받은 배열에서 Kim이라는 문자열의 위치를 찾아
//		int i = Arrays.asList(names).indexOf("Kim");
//		return "Kim은 " + (i + 1) + "번째 위치에 있다.";
		
		List<String> name = Arrays.asList(names);
		return "Kim은 " + (name.indexOf("Kim") + 1) + "번째 위치에 있다.";
	}
}
