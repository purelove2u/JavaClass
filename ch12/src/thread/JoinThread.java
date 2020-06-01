package thread;

public class JoinThread extends Thread {
	int start;
	int end;
	int total;
	public JoinThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			total = i;
		}
	}
}
