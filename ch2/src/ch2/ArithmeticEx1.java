package ch2;

public class ArithmeticEx1 {
	public static void main(String[] args) {
		int b1 = 10, b2 = 20;
		int result = b1 + b2;

		System.out.printf("b1 + b2 = %d\n", result);
		
		result = b2 - b1;
		System.out.printf("b2 - b1 = %d\n", result);

		result = b1 * b2;
		System.out.printf("b1 * b2 = %d\n", result);
		
		result = b2 / b1;
		System.out.printf("b2 / b1 = %d\n", result);

		result = b1 / b2;
		System.out.println("b1 / b2 = " + result);

		result = b2 % b1;
		System.out.println("b2 % b1 = " + result);
		result = b2 % b1;
		System.out.printf("b2 %% b1 = %d\n", result);
		
		result = b1 % b2;
		System.out.println("b1 % b2 = " + result);
		result = b1 % b2;
		System.out.printf("b1 %% b2 = %d", result);
		
		
	}
}
