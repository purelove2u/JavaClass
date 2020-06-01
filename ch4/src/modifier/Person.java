package modifier;
/* final
 * 1. class앞에 final : 상속금지
 * 2. instance 변수 앞에 final : 초기화 후 변경금지
 * 3. Method 앞에 final : overriding 금지 
 */

	// Class에서 final : 서브 class를 가질 수 없다.
public final class Person {
	// final로 선언된 instance변수는 무조건 초기화 필요
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 초기화하든가 생성자를 만들던가
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	// Method에서 final의 의미 : overriding 금지
	final void print() {
		System.out.println("final method");
	}
	
	void print2() {
		System.out.println("instance method");
	}
}
