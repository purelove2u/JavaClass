package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> LinkedList = new LinkedList<>();
	
		System.out.println("=== 순차적으로 추가하기 ===");
		System.out.println("ArrayList : " + add1(arrayList));
		System.out.println("LinkedList : " + add1(LinkedList));
		System.out.println();
		System.out.println("===== 중간에 추가하기 =====");
		System.out.println("ArrayList : " + add2(arrayList));
		System.out.println("LinkedList : " + add2(LinkedList));
		System.out.println();
		System.out.println("==== 중간에서 삭제하기 ====");
		System.out.println("ArrayList : " + remove2(arrayList));
		System.out.println("LinkedList : " + remove2(LinkedList));
		System.out.println();
		System.out.println("=== 순차적으로 삭제하기 ===");
		System.out.println("ArrayList : " + remove1(arrayList));
		System.out.println("LinkedList : " + remove1(LinkedList));
		System.out.println();
	}
	
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500, i+"");
		}
		long end = System.currentTimeMillis();
		return end - start;		
	}
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
