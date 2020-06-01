package ch4;

public class ArrayTest3 {
	public static void main(String[] args) {
		int arr1[] = new int[5];
		
		//초기화
		arr1[0] = 5;
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 8;
		arr1[4] = 9;
		
		//배열 사용
		/*System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);*/
		
		for(int i = 0 ; i < arr1.length ; i++ ) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		for(int i : arr1) {
			System.out.println(i);
		}
	}
}
