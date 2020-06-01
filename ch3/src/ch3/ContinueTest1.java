package ch3;

public class ContinueTest1 {
	public static void main(String[] args) {
		// 1~10까지의 숫자 중에서 3의 배수가 아닌 숫자만 출력
		for(int i = 1 ; i <= 10 ; i++) {
			if(i % 3 == 0) {	//continue 다음의 문장을 실행하지 않고 루프 처음으로 되돌아감
				continue;
			}
			System.out.println(i);
		}
	}
}
