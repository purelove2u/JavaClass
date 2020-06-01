package modifier;

public class ArrayEx {

	public static void main(String[] args) {
		int arr[]= {15, 35, 65, 3, 4};
		Array arr1 = new Array(arr);
		change(arr1);
		System.out.println();
		for(int i : arr) {
			System.out.print(i + "\t");
		}
	}
	
	static void change(Array arrays) {
		int[] arr = arrays.getArr();
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		arr[2] = 98;
	}
}
