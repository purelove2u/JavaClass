package ch1;

public class Variable7 {
	public static void main(String[] args) {
		//int 형 타입의 변수를 2개 선언하고 값을 할당한 후 2개의 값을 서로 바꾼 후
		//각 변수를 출력하기
		
		int a = 15;
		int b = 20;
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
