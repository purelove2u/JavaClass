package ch4;

public class ArrayTest8 {

	public static void main(String[] args) {
		// íƒ€ìž… ë°°ì—´ëª…[][] = new íƒ€ìž…[2][2];
		int arr1[][] = new int[3][5];
		
//		arr1[0][0] = 15;
//		arr1[0][1] = 25;
//		arr1[1][0] = 35;
//		arr1[1][1] = 45;
		
		for(int i = 0 ; i < arr1.length ; i++) {			//í–‰ ê¸¸ì�´
			for(int j = 0 ; j < arr1[i].length ; j++){		//ì—´ ê¸¸ì�´
//				System.out.printf("[%d][%d] = ", i, j);
				arr1[i][j] = (j * 3) + (i + 1); 
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
