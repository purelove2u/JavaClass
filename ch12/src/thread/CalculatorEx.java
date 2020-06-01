package thread;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1(cal);
		user1.start();
		
		User2 user2 = new User2(cal);
		user2.start();
	}
}
