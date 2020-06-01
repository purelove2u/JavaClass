package ch8;

public class IntegerTest1 {
	public static void main(String[] args) {
		// int(기본타입) -> Integer(객체타입)
		
		Integer ia = new Integer(10);
		Integer ib = new Integer(10);
		
		// Integer가 equals()를 주소비교에서 값비교로 overriding 했다
		
		System.out.println(ia == ib); // false
		System.out.println(ia.equals(ib));	// true
	}	
}
