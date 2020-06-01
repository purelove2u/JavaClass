package collection;

public class HashCodeObject {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		// HashCode : 객체를 식별할 수 있는 하나의 정수값
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
