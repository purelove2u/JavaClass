package ch4;

public class ArrayTest14 {
	public static void main(String[] args) {
		int oldScore[][] = { {12, 13}, {14, 15} };
		
		int newScore[][] = new int[oldScore.length][oldScore[0].length];  //oldScore 배열에서 요소가 추가 될 경우를 대비
		
		for(int i = 0 ; i < oldScore.length ; i++) {
			for(int j = 0 ; j < oldScore[i].length ; j++) {
				newScore[i][j] = oldScore[i][j];
			}
		}
		for(int i[] : newScore) {
			for(int j : i) {
				System.out.print(j + " ");
			}
		}

	}
}
