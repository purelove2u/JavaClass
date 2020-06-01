package ch4;

public class ArrayTest9 {
	public static void main(String[] args) {
		int arr1[][] = {
				{15, 25, 35},
				{45, 55}
		};
		
		for(int i = 0 ; i <arr1.length ; i++) {
			for(int j = 0 ; j < arr1[i].length ; j++) {
				System.out.printf("[%d][%d] = ", i, j);
				System.out.println(arr1[i][j]);
			}
		}
		
		for(int i[] : arr1) {
			for(int j:i) {
				System.out.println(j + " ");
			}
		}
	}
}
