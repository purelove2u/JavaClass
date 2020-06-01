package ch7;

public class ThorwException1 {
	public static void main(String[] args) {
		int arr[] = new int[0];
		try {
			getTotal(arr);
			getAverage(arr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static double getAverage(int arr[]) throws Exception {
		if(arr.length == 0) {
			//예외를 강제로 발생시키는 코드
			throw new Exception("비어 있는 배열입니다.");
		}
		return getTotal(arr)/arr.length;
	}
	
	public static int getTotal(int arr[]) throws Exception {
		if(arr.length == 0) {
			throw new Exception("비어있는 배열입니다.");
		}
		int total = 0;
		for(int i : arr) {
			total +=i;
		}
		return total;
	}
}
