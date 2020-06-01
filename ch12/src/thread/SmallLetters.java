package thread;

public class SmallLetters implements Runnable {

	@Override
	public void run() {
		// SmallLetters 해야하는 작업을 작성
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print(ch + "\t");
		}
	}
}
