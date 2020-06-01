package ch3;

public class ForTest11 {

	public static void main(String[] args) {
		// 이중 for문
		for(int i = 5 ; i >= 1 ; i--) {
			for(int j = 5 ; j >= 1 ; j--) {
				System.out.print(i >= j ? "*": " ");
				
//				if(i >= j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}

	}

}
