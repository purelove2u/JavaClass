package Arrays;

public class ArraysEquals {

	public static void main(String[] args) {
		int arr1[] = {10, 73, 2, -5, 42};
		int arr2[] = {10, 73, 2, -5, 41};
		
		// true를 리턴 받은 경우, 두 배열의 요소는 같다 출력
		// false를 리턴 받은 경우, 두 배열의 요소는 다르다 출력
		if(arrayEquals(arr1, arr2)) {
			System.out.println("두 배열의 요소는 같다");
		}else {
			System.out.println("두 배열의 요소는 다르다");
		}
	}
	
	public static boolean arrayEquals(int arr1[], int arr2[]) {
		// 넘겨 받은 두 개의 배열 요소의 값을 비교하여 모든 요소의 값이 같은 경우
		// true 리턴. 다은 요소과 있다면 false 리턴
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;	
	}
}
