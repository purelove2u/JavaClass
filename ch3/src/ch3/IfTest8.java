package ch3;

import java.util.Scanner;

public class IfTest8 {

	public static void main(String[] args) {
		// 근무시간을 사용자로부터 입력받아 시간제 임금을 계산
		// 8시간 까지는 시간당 9000원, 8시간 초과분은 1.5배
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무 시간 : ");
		int hours = sc.nextInt();
		double over = 8 * 9000 + (hours - 8) * 9000 * 1.5;
		
		if(hours <= 8) {
			System.out.printf("임금 : %d원", hours * 9000);
		}else {
			System.out.printf("임금 : %.0f원", over);
		}
		
	}

}


/*	
		int pay = 0, rate = 9000;
		if(hours >8) {
			pay = (int)(rate * 8 + ((hours - 8) * 1.5 * rate));
		}else{
			pay = hours * rate;
		System.out.println("임금 : " + pay);
*/