package inherit;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonus = new BonusPointAccount("111-11", "홍길동", 1000000, 10000);
		
		bonus.deposit(200000);
		System.out.println("현재잔액 = " + bonus.getBalance() + " 누적보너스포인트 = " + bonus.getBonusPoint());

	}

}
