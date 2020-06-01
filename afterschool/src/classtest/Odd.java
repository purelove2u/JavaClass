package classtest;

public class Odd extends OddDetector {
	
	public Odd(int n) {
		super(n);
	}
	
	@Override
	public boolean isOdd() {
		return this.getN() % 2 == 0;
	}
	
}
