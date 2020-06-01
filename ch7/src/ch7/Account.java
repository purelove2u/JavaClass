package ch7;

public class Account {
	private int balance;
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) throws BalanceInsufficientException {
		if(this.balance < amount) {
			throw new BalanceInsufficientException
			("잔고 부족 : " + (this.balance - amount) + "부족함");
		}
		this.balance -= amount;
	}
}

