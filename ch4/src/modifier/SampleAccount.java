package modifier;

public class SampleAccount {
	//잔고(balance) 필드 - 외부에서 직접 접근 불가
	private int balance;
//	int amount;
	
	// setBalance(int amount)구현
	//balance 필드는 음수값이 될 수 없고
	//amount는 최대 100만원 까지만 저장이 가능함
	//amount가 음수 값이거나 100만원이 넘는다면 현재의 잔액을 유지
	void setBalance(int amount) {
		if(amount + balance > 0 && amount <= 1000000 && amount >= 0) {
			this.balance += amount;
		}
	}

	// getBalance() => 현재 잔고 리턴
	int getBalance() {
		return balance;
	}
}
