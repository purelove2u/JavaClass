package ch4;

public class ArrayTest2 {
	public static void main(String[] args) {
		// char 타입을 담는 배열 생성
		// 타입 배열명[] = new 타입[숫자];
		
		char arr1[] = new char[3];	// 빈 문자열로 초기화되어
		/*System.out.println(arr1[0]);	// 아무런 값도 출력되지 않음
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);*/
		for(char ch : arr1) {
			System.out.println(ch);
		}
		
		// double 타입을 담는 배열 생성
		double arr2[] = new double[3];	// 0.0으로 초기화됨
		/*System.out.println(arr2[0]);	// 기본 값 0.0 이 출력됨
		System.out.println(arr2[1]);	// float도 같은 결과
		System.out.println(arr2[2]);*/
		//System.out.println(arr2[3]);
		for(double d : arr2) {
			System.out.println(d);
		}
		
		//boolean 타입을 담는 배열 생성
		boolean arr3[] = new boolean[3];	//false 로 초기화됨
		/*System.out.println(arr3[0]);		//기본값 false 가 출력됨
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);*/
		for(boolean b : arr3) {
			System.out.println(b);
		}
		
		// String 타입 배열 생성
		String arr4[] = new String[3];	//null 로 초기화됨
		/*System.out.println(arr4[0]);	//기본값 null 이 출력됨
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);*/
		for(String str : arr4) {
			System.out.println(str);
		}
	}
}
