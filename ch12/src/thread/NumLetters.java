package thread;

public class NumLetters extends Thread{
	public NumLetters() {
		setName("NumLetter");
	}
	@Override
	public void run() {
		// 0~30까지 숫자 출력
		for(int i = 0 ; i <31 ; i++) {
			System.out.print(i + "\t");
		}
	}
}
