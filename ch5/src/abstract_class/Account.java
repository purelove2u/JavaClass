package abstract_class;

// abstract - 추상

// Method 앞에 abstract가 오면 {} body 를 가지지 않음
// 추상 Method가 존재한다면 클래스는 무조건 추상 클래스가 되어야함

// 추상클래스 = 클래스 + 추상메소드
//			but 객체생성 못함 

public abstract class Account {
	// 멤버변수 가능 (변수)
	private String ano;
	private String owner;
	private int balance;
	
	// 멤버변수 가능 (상수)
	public static final int MAX = 15;
	
	// 생성자 생성 가능
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 메소드 생성 가능
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	//추상메소드
	public abstract void withdraw();
}
