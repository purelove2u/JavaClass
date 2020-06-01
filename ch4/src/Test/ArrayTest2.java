package Test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// Member 객체 배열을 생성
//		Member members[] = new Member[3];
//		members[0] = new Member("홍길동", "hong123");
//		members[1] = new Member("김수지", "kim123");
//		members[2] = new Member("차돌이", "cha123");
		
		Member members[] = null;
		
		// 사용자로부터 생성(Member)할 갯수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 배열의 갯수 : ");
		int size = sc.nextInt();
		members = new Member[size];
		
		// 입력받은 숫자만큼 Member객체 배열 생성
//		for(int i = 0 ; i < size ; i++) {
//			System.out.printf("%d 번째 배열에 입력할 이름, id 를 입력하시오", (i + 1));
//			members[i] = new Member(sc.next(), sc.next());			
//		}
		
		for(int i = 0 ; i < size ; i++) {
			System.out.printf("%d 번째 배열에 입력할 이름을 입력하시오", (i + 1));
			String name = sc.next();
			System.out.printf("%d 번째 배열에 입력할 id를 입력하시오", (i + 1));
			String id = sc.next();
			members[i] = new Member(name, id);			
		}
		
		
		// 생성 후 출력
		for(Member m : members) {
			System.out.println("이름 : " + m.name + ", id : " + m.id);
		}
	}
}
