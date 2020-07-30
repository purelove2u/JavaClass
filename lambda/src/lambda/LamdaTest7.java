package lambda;

public class LamdaTest7 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();

	}
}
