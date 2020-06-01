package thread;

public class MultiThread2 {
	public static void main(String[] args) {
		InputThread t = new InputThread();
		t.start();

		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
}
