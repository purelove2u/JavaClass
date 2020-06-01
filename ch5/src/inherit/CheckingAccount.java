package inherit;

public class CheckingAccount extends Account {
	
	//직불카드번호
	private String cardNo;

	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);		
		this.cardNo = cardNo;
	}
	
	//직불카드 사용액을 지불한다.
	int pay(String cardNo, int amount) throws Exception {
		if(!this.cardNo.equals(cardNo) || super.getBalance() < amount) {
			throw new Exception("지불불가");
		}
		return super.getBalance() - amount;
	}
	
}
