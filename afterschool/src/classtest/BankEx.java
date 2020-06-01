package classtest;

public class BankEx {
	public static void main(String[] args) {
		GoodBank good = new GoodBank();
		printRate(good);
		NormalBank normal = new NormalBank();
		printRate(normal);
		BadBank bad = new BadBank();
		printRate(bad);
	}
	
	// 이자율을 출력하는 메소드
	public static void printRate(Bank bank) {
		System.out.println(bank.getinterestRate());
	}
}
