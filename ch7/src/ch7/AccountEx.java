package ch7;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금
		account.deposit(1000000);
		
		//출금
		try {
			account.withdraw(1500000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
		}

	}

}
