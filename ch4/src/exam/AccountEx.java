package exam;

public class AccountEx {

	public static void main(String[] args) {
		// Account 배열 객체 생성
		Account account[] = new Account[3];
		
		account[0] = new Account("112-12", "홍길동", 10000);
		account[1] = new Account("112-13", "김자바", 30000);
		account[2] = new Account("112-14", "강동원", 50000);
		
		for(int i = 0 ; i < account.length ; i++) {
			System.out.println(account[i].accountNo + account[i].name + account[i].balance);
//			System.out.println();
//			System.out.print(account[i].accountNo + "\t");
//			System.out.print(account[i].name + "\t");
//			System.out.print(account[i].balance + "\t");
		}
		System.out.println();
		
		for(Account acc : account) {
			System.out.println(acc.accountNo + acc.name + acc.balance);
		}
	}
}
