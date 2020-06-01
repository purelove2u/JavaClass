package ch3;

public class WhileTest4 {

	public static void main(String[] args) {
		// 1~100까지 합 구하기
		int i = 1;
		int sum = 0;
		
		while(i <=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);

	}

}
