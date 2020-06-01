package ch2;

public class ArithmeticEx3 {

	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		
		
		//산술 연산 시 저장되는 값이 int가 표현할 수 없는 범위의 경우 결과가 정확하지 않음. 
		//따라서 더 큰 타입으로 선언해야 함

		long z = x * y;
		System.out.println(z); // -727379968

	}

}
