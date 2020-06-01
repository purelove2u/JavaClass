package ch3;

public class DiceSum {
	public static void main(String[] args) {
		// while문과 Math.random()을 이용해서 두 개의 주사위를 던졌을 때
		// 나오는 수를 (수1, 수2) 형태로 출력하기
		// 단, 두 수의 합이 5가 아니라면 계속 주사위를 던지고,
		// 두 수의 합이 5가 나오면 실행을 멈추기 => break;
		
		int num1 = 0, num2 = 0;
		
		while(true) {
			num1 = (int)(Math.random()*6) + 1;
			num2 = (int)(Math.random()*6) + 1;
			
			System.out.printf("(%d, %d)\n", num1, num2);
			if(num1 + num2 == 5) {
				break;
			}
		}
	}
}
