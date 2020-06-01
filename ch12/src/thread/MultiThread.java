package thread;

public class MultiThread {
	static long startTime;
	
	public static void main(String[] args) {
		BarThread t = new BarThread();
		t.start();
		
		startTime = System.currentTimeMillis();
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - startTime));
	}
}
