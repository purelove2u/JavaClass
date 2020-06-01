package modifier;
// modifier는 다음과 같은 것들이 있다
// public
// protected
// default
// private
public class Account {
	private String accountNo;
	private String name;
	private int balance;
	
	public Account() {
		super();
	}
	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	//속성의 변경을 위해서 메소드를 제공
	//값을 세팅하는 목적일 때는 set~로
	//메소드에도 private 을 붙이는 경우도 있음
	//(이 클래스 내에서만 사용할 때)
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//값을 가져오는 목적일 때는 get~로 하는 것이 일반적
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
}
