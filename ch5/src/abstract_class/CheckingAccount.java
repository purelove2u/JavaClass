package abstract_class;

public class CheckingAccount extends Account {

	
	public CheckingAccount(String ano, String owner, int balance) {
		super(ano, owner, balance);
	
	}

	@Override
	public void withdraw() {
	// 추상클래스를 상속받는 하위 클래스는 무조건 overriding을 해야함

	}

}
