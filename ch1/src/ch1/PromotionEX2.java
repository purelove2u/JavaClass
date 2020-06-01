package ch1;

public class PromotionEX2 {
	public static void main(String[] args) {
		byte b1 = 10, b2 = 20;
		//byte b3 = b1 + b2;		//int 타입보다 작은 타입의 연산식에서는 자동으로 형변환됨
		
		short s1 = 15, s2 = 20;
		//short s3 = s1 + s2;		//역시 연산식에서 자동으로 int로 변환됨
		
		int i1 = 25;
		double d1 = 13.5d;
		double result = i1 + d1;
		int result2 = (int)(i1 + d1);		//double을 int로 변환할 수 없다는 오류 즉, double로 변환됨.
		int result3 = i1 + (int)d1;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
}
