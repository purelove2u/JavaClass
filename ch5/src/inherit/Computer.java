package inherit;

public class Computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle()");
		return Math.PI * r * r;
	}
}
