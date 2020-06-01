package ch4;

public class AccumulatorEx {

	public static void main(String[] args) {
		Accumulator acc1 = new Accumulator();
		acc1.accumulate(10);
		
		Accumulator acc2 = new Accumulator();
		acc2.accumulate(200);
		
		System.out.printf("acc1 total = %d, grandTotal = %d", acc1.total, Accumulator.grandTotal);
		System.out.println();
		System.out.printf("acc1 total = %d, grandTotal = %d", acc2.total, Accumulator.grandTotal);
		
	}

}
