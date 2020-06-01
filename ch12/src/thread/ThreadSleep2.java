package thread;

public class ThreadSleep2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println("<<ThreadSleep2 종료");
	}
}
