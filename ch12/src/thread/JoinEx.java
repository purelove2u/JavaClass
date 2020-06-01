package thread;

public class JoinEx {

	public static void main(String[] args) {
		JoinThread t1 = new JoinThread(1, 50);
		t1.start();
		
		JoinThread t2 = new JoinThread(51, 100);
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int total = t1.total + t2.total;
		System.out.println("t1 total = " + t1.total);
		System.out.println("t2 total = " + t2.total);
		System.out.println("t1 total + t2 total = " + total);
	}

}
