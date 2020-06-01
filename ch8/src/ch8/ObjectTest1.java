package ch8;

public class ObjectTest1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// == (기본타입), equals() => String+
		
		// Object 를 비교할 때 쓰는 ==, equals()는 같은 개념
		// 주소비교
		// 서로 다른 인스턴스이기 때문에 false false
		
		System.out.println(obj1 == obj2);	// false
		System.out.println(obj1.equals(obj2));	// Sfalse
		
		// toString() : 객체 문자 정보 리턴 (클래스명@16진수)
		System.out.println(obj1.toString());	//java.lang.Object@15db9742
		System.out.println(obj2.toString());	//java.lang.Object@6d06d69c
		
	}
}
