package ch3;

public class ForTest12 {

	public static void main(String[] args) {
		// 중첩 for 문을 이용해서 4x + 5y = 60 의 모든 해 구하기
		// 출력은 (x, y)형태
		// x, y는 10 이하의 자연수
		
		for(int i = 1 ; i <= 10 ; i++) {
			for(int j = 1 ; j <= 10 ; j++) {
				if(4 * i + 5 * j == 60) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
		

	}

}
