package inherit;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
//	public Account() {
//		// TODO Auto-generated constructor stub
//	}
//	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		this.balance += amount;
	}
	int withdraw(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔고부족");
		return this.balance -= amount;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}