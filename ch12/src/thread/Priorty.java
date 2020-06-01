package thread;

public class Priorty {

	public static void main(String[] args) {
		// Thread 우선순위 : Thread.MAX_PRIORITY(10)
		// Thread.MIN_PRIORITY(1), Thread.NORM_PRIORITY(5)
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
