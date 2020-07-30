package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaTest11 {
	public static void main(String[] args) {
		// 컬렉션 프레임워크에 함수형 인터페이스가 많이 추가됨
		// forEach
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add("E");
		
		//lists 에 있는 내용을 하나씩 가져오기
		//향상된 for, for, Iterator
		System.out.println("향상된 for문");
		for(String s : lists) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("for문");
		for(int i=0;i<lists.size();i++) {
			System.out.println(lists.get(i));
		}
		System.out.println();
		System.out.println("Iterator");
		Iterator<String> iter = lists.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		System.out.println("forEach");
		
		lists.forEach(item -> System.out.println(item));
		
		//사용자 객체 forEach
		List<Student> stuList = Arrays.asList(
				new Student("홍길동",98,65),
				new Student("김지원",89,75),
				new Student("정우성",67,85));
		//학생이름, 점수 출력
		stuList.forEach(student -> System.out.println(student.getName()+": "
		+student.getEnglish()+", "+student.getMath()));
		
	}
}




















