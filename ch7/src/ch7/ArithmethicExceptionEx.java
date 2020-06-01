package ch7;

public class ArithmethicExceptionEx {

	public static void main(String[] args) {
		
		try {
			int num1 = 3, num2 = 0;
			System.out.println(num1 / num2);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
