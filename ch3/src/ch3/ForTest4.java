package ch3;

public class ForTest4 {

	public static void main(String[] args) {
		// 1~100까지 짝수의 합
		int sum = 0;
		for(int i = 2 ; i < 100 ; i+=2) {
			sum+=i;
		}
		System.out.println("1~100까지 짝수의 합 : " + sum);

	}

}
