package Test;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 피연산자 입력 : ");
		int op1 = sc.nextInt();  // 입력시 : 5 엔터
		
		System.out.print("+ - * / % 중에서 하나를 선택");
		//String oper = sc.nextLine();  // 줄전체를 읽어드리기 때문에 
									// 위에서 입력한 엔터가 입력값으로 들어가버림
		String oper = sc.next();  // 특정 문자열만 읽어들임
		
		System.out.print("두번째 피연산자 입력: ");
		int op2 = sc.nextInt();
		

	}

}
