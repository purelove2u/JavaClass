package modifier;

public class ReferenceEx {

	public static void main(String[] args) {
//		ReferenceEx ref = new ReferenceEx();
//		ref.change();  
//		change가 public 'static' void가 아니라면 위와 같이 해야함
		
		int arr[] = {5, 6, 7, 8, 9};
		change(arr);
		System.out.println(arr[3]);
		
		change(arr[2]); //배열 요소의 값을 던진다
		System.out.println(arr[2]);
	}
	
	public static void change(int[] a) {
		a[3] = 55;
	}
	
	public static void change(int a) {
		a = 25;
	}

}
