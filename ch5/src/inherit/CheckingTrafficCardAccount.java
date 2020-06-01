package inherit;

public class CheckingTrafficCardAccount extends CheckingAccount {
	
	//교통카드 등록 여부
	private boolean hasTrafficCard;

	public CheckingTrafficCardAccount(String ano, String owner, int balance, String cardNo, 
			boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	//기능
	//예금, 출금, 직불카드사용액 지불
	//교통카드 기능이 있다면 교통비를 지불
	int payTrafficCard(String cardNo, int amount) throws Exception {
		if(!hasTrafficCard) {
			throw new Exception("교통카드 기능이 없습니다.");
		}
		return super.pay(cardNo, amount);		
	}
}
