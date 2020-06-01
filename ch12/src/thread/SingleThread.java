package thread;

public class SingleThread {

	public static void main(String[] args) {
		// - | 출력하는 프로그램
		long startTime = System.currentTimeMillis();
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간 1 : " + (System.currentTimeMillis() - startTime));
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간 2 : " + (System.currentTimeMillis() - startTime));
	}
}