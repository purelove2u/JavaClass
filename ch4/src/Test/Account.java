package Test;

public class Account {
	// 인스턴스 변수
	private String ano;		// 계좌번호 : 110-11 
	private String owner;	// 계좌주 : 홍길동
	private int balance;	// 잔액 : 100000
	
	// 생성자
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 메소드 : getter/setter
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
