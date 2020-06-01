package ch4;

public class ArrayTest1 {
	public static void main(String[] args) {
		// 타입(기본, 참조) 배열명[];	//배열선언
		// ex) int arr1[];
		int arr1[];
		
		// 배열 생성
		arr1 = new int[5];	// int 타입의 5개의 배열 공간 생성
		/*System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);*/
		//System.out.println(arr1[5]);
		
		for(int i: arr1) {
			System.out.println(i);
		}
	}
}
