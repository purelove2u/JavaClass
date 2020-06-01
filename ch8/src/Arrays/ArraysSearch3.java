package Arrays;

public class ArraysSearch3 {
	public static void main(String[] args) {
		// 정렬된 상태인 경우 => 이진검색
		int arr[] = {10, 18, 35, 45, 55, 65, 99};
		
		// 배열에 45라는 값이 들어있는지 확인하고
		// 찾으면 그 찾은 위치를 출력하고
		// 찾지 못하면 검색 값 없음 이라는 메세지 출력
		
		int i = 0;
		int key = 48;
		int pos = binarySearch(arr, key);
		
		if(pos == -1) {
			System.out.println("검색값 없음");			
		}else {
			System.out.println("찾은 위치 : " + (pos+1));
		}
	}
	
	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] > key){
				high = mid - 1;
			}else if(arr[mid] < key){
				low = mid + 1;
			}
		}
		return -1;
	}
}
