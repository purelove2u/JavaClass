package ch7;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {
		try {
			int data1 = Integer.parseInt("100");
			int data2 = Integer.parseInt("100a");
				
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}
		
	}
}
