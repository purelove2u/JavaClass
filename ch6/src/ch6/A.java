package ch6;

public interface A {
	String str = "";	// 상수필드만 선언이 가능
	
	// 추상메소드만 가능
	// java8 버전부터 static or default 키워드가 붙은 메소드까지 가능
	void print();
	static void print_static() {}
	default void print_default() {}
}
