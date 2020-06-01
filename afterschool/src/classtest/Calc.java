package classtest;

public abstract class Calc {
	public int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();	
}
