package thread;

public class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		int i = 10;
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
//			for(long x = 0; x<2500000000L; x++) {
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				interrupt();
				e.printStackTrace();
			}
		}
		System.out.println("카운트 종료");
	}
}
