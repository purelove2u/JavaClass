package thread;

public class AccountThread extends Thread {
	private Account account = new Account();
	@Override
	public void run() {
		while(account.getBalance() > 0) {
			// 100, 200, 300 이 중에서 임의의 값이 들어가도록 작성
			int money = (int)(Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			System.out.println("balance : " + account.getBalance());
		}
	}
}
