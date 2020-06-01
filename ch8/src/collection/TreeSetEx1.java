package collection;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("고양이");
		tree.add("사자");
		tree.add("타조");
		tree.add("송아지");
		tree.add("악어");
		tree.add("다람쥐");
		tree.add("양");
		
		System.out.println(tree);
		
		// 주요 메소드
		System.out.println(tree.first());	// 고양이
		System.out.println(tree.last());	// 타조
		System.out.println(tree.lower("송아지"));	//사자
		System.out.println(tree.higher("송아지"));	//악어
		// floor :  주어진 객체와 동등한 객체가 있는 경우 리턴
		// 			없다면 주어진 객체가 위치해야 하는 요소의 앞 요소 리턴
		System.out.println(tree.floor("송아지"));	//송아지
		System.out.println(tree.floor("말"));	// 다람쥐
		// ceiling : 주어진 객체가 없다면 주어가 위치해야 하는 요소의 뒤 요소 리턴
		System.out.println(tree.ceiling("말"));	// 
		
	}
}
