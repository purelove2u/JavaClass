package inherit;

public class BonusPointAccount extends Account {
	
	// 보너스카드 누적포인즈 적립
	private int bonusPoint;

	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	// 예금한다 : 예금 + 예금액의 1%를 보너스 포인트로 지급 => 기존 기능에 다른 기능 추가필요 = Overriding 도입

	@Override	// 재정의 했다는 표시
	void deposit(int amount) {
		super.deposit(amount);
		bonusPoint += (int)(amount * 0.01);	// 예금액의 1%를 보너스포인트로 지급
		
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
	
	
}
