package ch2;

public class Trapezoid2 {

	public static void main(String[] args) {
		//사다리 꼴 넓이 구하기
		//윗변, 아랫변, 높이에 해당하는 변수를 선언한 뒤 계산.
		
		int a = 3, b = 4, h = 5;
		double result = (double)((a + b) * h ) / 2;
		
		System.out.printf("사다리 꼴의 넓이는 : %d\n", ((a + b) * h) / 2);
		System.out.printf("사다리 꼴의 넓이는 : " + result);

	}

}
