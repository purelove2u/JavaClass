package ch3;

public class ForTest5 {

	public static void main(String[] args) {
		// 1~100까지 숫자중에서 3의 배수는 더하고
		// 9의 배수는 더하지 않은 합계 출력하기
		
		int sum = 0;
		for(int i = 3 ; i < 101 ; i+=3) {
			if(i % 9 == 0) {
				sum+=0;
			}else {
				sum+=i;
			}
		}
		System.out.println("9의 배수는 제외한 3의 배수의 합 : " + sum);
		
		sum = 0;
		for(int i = 1 ; i < 101 ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수이거나 5의 배수의 합 : " + sum);
	}

}



		// for(int i = 1 ; i < 101 ; i++){
		//		if(i % 3 ==0 && i % 9 != 0) {
		//			sum+=i;
		//		}