package ch3;

public class ContinueTest2 {
	public static void main(String[] args) {
		//짝수만 출력하기
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
