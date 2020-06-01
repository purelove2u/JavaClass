package ch3;

import java.util.Scanner;

public class IfTest7 {
	public static void main(String[] args) {
		// 윤년 / 평년 구하기
		// 윤년 : 해당 년도를 4로 나눈 나머지가 0과 같고
		// 100으로 나눈 나머지가 0이 아니거나
		// 400으로 나눈 나머지가 0인 경우
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}
}
