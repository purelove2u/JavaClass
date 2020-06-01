package classtest;

public class Passenger {
	// 승객
	// 이름, 돈, 
	private String name;
	private int money;
	
	public Passenger(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money -= money;	//용돈 -= 요금
	}
	
	
	
	
}
