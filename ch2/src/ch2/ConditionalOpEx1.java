package ch2;

public class ConditionalOpEx1 {
	public static void main(String[] args) {
		// 삼항연산자 : 조건 ? 참일 때 리턴 값 : 거짓일 때 리턴 값
		// 조건 : 비교연산자 주로 사용
		int score = 90;
		char ch = score > 95 ? 'B' : 'A';
		System.out.println(ch);
		
	}
}
