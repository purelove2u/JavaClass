package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Java");
		set.add("Test");
		set.add("Swing");
		set.add("Java");
		
		System.out.println(set);
		
		System.out.println("set empty : " + set.isEmpty());
		System.out.println("Test 포함 여부 : " + set.contains("Test"));
		System.out.println("Set 크기 : " + set.size());
		System.out.println("특정 객체 삭제 : " + set.remove("Swing"));
		System.out.println(set);
	}

}
