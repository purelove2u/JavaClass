package ch4;

public class ArrayTest12 {
	public static void main(String[] args) {
		int oldArray[] = {10, 20, 30};
		
		int newArray[] = new int[4];
		
//		for(int i = 0 ; i < oldArray.length ; i++) {
//			newArray[i] = oldArray[i];
//		}
//		
		//배열 카피
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i : newArray) {
			System.out.print(i + " ");
		}
	}
}
