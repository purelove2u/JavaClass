package ch4;

public class ArrayTest15 {
	public static void main(String[] args) {
		int score[][] = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 40, 30},
				{40, 50, 20},
				{50, 60, 50}
		};
		
		int result[][] = new int[score.length + 1][score[0].length + 1];
		// 값 옮기기
		for(int i = 0 ; i < score.length ; i++) {	
			//score.length => score에 담긴 배열의 개수
			for(int j = 0 ; j < score[i].length ; j++) {	
				//score[i].length => score에 담긴 배열 안에 있는 요소의 개수
				result[i][j] = score[i][j];
				result[i][3] += result[i][j];	//행(가로) 합계
				result[5][j] += result[i][j];	//열(세로) 합계
				result[5][3] += score[i][j];	//전체합계
			}
		}
		//출력
		for(int i = 0 ; i < result.length ; i++) {
			for(int j = 0 ; j < result[i].length ; j++) {
				System.out.printf("%5d", result[i][j]);
			}
			System.out.println();
		}
	}
}