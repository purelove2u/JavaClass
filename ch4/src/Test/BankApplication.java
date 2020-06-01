package Test;

import java.util.Scanner;

public class BankApplication {
	// Account 객체를 100개 담을 배열 생성
	static Account accountArray[] = new Account[100];
	// 사용자부터 입력받기 위한 객체 생성
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("메뉴 선택 >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
		}
	}
	
	public static void createAccount() {
		//계좌번호(ano), 계좌주(owner), 잔액(balance) 정보 입력 받기
		//입력받은 정보를 이용해 Account 객체를 생성
		//배열에 담기 위해 배열 요소의 어느 부분이 비어있는지 확인 후 생성된 객체 담기
		//담은 후 break;
		for(int i = 0 ;  i < accountArray.length ; i++ ) {
			if(accountArray[i] == null) {
				System.out.println("계좌번호를 입력하세요.");
				String ano = sc.next();
				System.out.println("계좌주 이름을 입력하세요.");
				String owner = sc.next();
				System.out.println("잔액을 입력하세요");
				int balance = sc.nextInt();
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}	
		}
	}
	
	public static void accountList() {
		//현재 생성된 계좌목록 출력하기
		for(int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() +", "+accountArray[i].getOwner()
						+", "+accountArray[i].getBalance());
			}
		}
	}
	
	public static void deposit() {
		//사용자에게 계좌번호 입력받기
		//입력받은 계좌번호를 이용해 몇번째 account의 입금액을 증가해야 하는지 알아내기
		System.out.println("계좌번호를 입력하세요.");
		String ano = sc.next();
		if(findAccount(ano) == null) {
			System.out.println("계좌번호를 확인해주세요.");
		}else {
			System.out.println("예금할 금액을 입력하세요.");
			int deposit = sc.nextInt();
			findAccount(ano).setBalance(findAccount(ano).getBalance() + deposit);
			System.out.printf("출금완료. 현재 잔액은 %d 입니다.\n", findAccount(ano).getBalance());	
		}
		
		
	}
	
	public static void withdraw() {
		System.out.println("계좌번호를 입력하세요.");
		String ano = sc.next();
		if(findAccount(ano) == null) {
			System.out.println("계좌번호를 확인해주세요.");
		}else {
			System.out.println("출금할 금액을 입력하세요.");
			int withdraw = sc.nextInt();
			if(findAccount(ano).getBalance() >= withdraw) {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withdraw);
				System.out.printf("출금완료. 현재 잔액은 %d 입니다.\n", findAccount(ano).getBalance());
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}
	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//넘겨받은 ano를 이용해 몇번째 계좌인지 찾아내기
		//찾은 Account 리턴하기
		for(int i = 0 ; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}
		}
		System.out.println("계좌번호를 확인해주세요");
		return null;
		
	}
}
