package ch4;

public class Math1 {
	// 인스턴스 필드
	long a, b;
	// 인스턴스 메소드
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multifly() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	// 생성자를 통해서 초기화 불가
	static long c, d;
	
	// 초기화 블록
	static {
		c = 50;
		d = 30;
	}

	// 정적(클래스) 메소드
	static long add(long c, long d) {
		return c + d;
	}
	
	static long subtrack(long c, long d) {
		return c - d;
	}

}