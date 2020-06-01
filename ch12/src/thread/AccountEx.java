package thread;

public class AccountEx {
	public static void main(String[] args) {
		AccountThread r = new AccountThread();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}
