package ch3;

public class WhileTest2 {

	public static void main(String[] args) {
		// 1 ~ 10까지 짝수만 출력하기
		int i = 1;
		while(i < 11) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
