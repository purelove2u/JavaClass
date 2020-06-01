package classtest;

import java.util.Scanner;

public class Won2Dollar extends Converter {

	Scanner sc = new Scanner(System.in);
	@Override
	protected double convert(double src) {
		return src / 1200;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
