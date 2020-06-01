package ch3;

public class WhileTest3 {

	public static void main(String[] args) {
		// 1~100까지 3의 배수만 출력
		int i = 1;
		while(i <= 100) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
