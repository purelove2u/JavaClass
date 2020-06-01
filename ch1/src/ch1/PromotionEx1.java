package ch1;

public class PromotionEx1 {
	public static void main(String[] args) {
		// Promotion : 자동형변환
		//				작은 타입은 큰 타입으로 자동 형변환 됨
		//				작다, 크다의 의미는 사용하는 메모리 공간의 크기
		//				byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
		
		byte b1 = 3;
		int i1 = b1;	//자동 형변환
		System.out.println(i1);
		
		char ch1 = '가';
		int intValue = ch1 ;	//자동 형변환
		System.out.println(intValue);
		
		double d1 = i1;		//자동 형변환
		System.out.println(d1);
		
		
	}
}
