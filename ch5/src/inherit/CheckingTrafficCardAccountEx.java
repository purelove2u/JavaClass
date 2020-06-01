package inherit;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) throws Exception {
		CheckingTrafficCardAccount traffic1 = new CheckingTrafficCardAccount("111-11", "홍길동", 1000000,
				"222-22", true);
		
		CheckingTrafficCardAccount traffic2 = new CheckingTrafficCardAccount("111-22", "최길동", 1000000,
				"222-33", false);
		
		//예금한다
		traffic1.deposit(200000);
		System.out.println("1현재잔액 : " + traffic1.getBalance());

		traffic2.deposit(100000);
		System.out.println("2현재잔액 : " + traffic2.getBalance());
		
		//출금한다
		traffic1.withdraw(200000);
		System.out.println("1현재잔액 : " + traffic1.getBalance());
		
		traffic2.withdraw(100000);
		System.out.println("2현재잔액 : " + traffic2.getBalance());
		
		//직불카드 사용액을 지불한다.
		System.out.println(traffic1.pay("222-22", 5000));
//		System.out.println(traffic1.pay("333-11", 3000));		카드번호 상이
		
		System.out.println(traffic2.pay("222-33", 5000));
//		System.out.println(traffic2.pay("333-11", 3000));		카드번호 상이
		
		
		//교통카드 사용액을 지불한다.
		System.out.println(traffic1.payTrafficCard("222-22", 2000));
//		System.out.println(traffic1.payTrafficCard("333-11", 1000));	카드번호 상이
		
		System.out.println(traffic2.payTrafficCard("222-33", 2000));	//교통기능x
//		System.out.println(traffic2.payTrafficCard("333-11", 1000));	카드번호 상이 , 교통기능 x

	}

}
