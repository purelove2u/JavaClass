package exam;

public class Account {
	// 필드 - 계좌번호(accountNo), 이름(name), 잔액(balance)
	String accountNo;
	String name;
	int balance;
	
	Account(){}
	Account(String accountNo, String name, int balance){
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	// method - 예금한다(deposit) / 출금한다(withdraw)
	// 입금할 금액 / 출금금액을 입력받아 현재 잔액에 더하거나 빼기
	int Deposit(int amount) {
		return balance += amount;
	}
	
	int withdraw(int amount) {
		return balance -= amount;
	}
}
