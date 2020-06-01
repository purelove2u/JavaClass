package ch2;

public class OperatorEx2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		// (x = x + 1; == x++), ++x
		System.out.println("x = " + (x++));
		System.out.println("x = " + (++x));
		
		
		System.out.println("y = " + (y++));
		System.out.println("y = " + (++y));
		System.out.println("x = " + x + ", y = " + y);

	}

}
