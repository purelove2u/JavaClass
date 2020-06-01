package modifier;

public class SampleAccountEx {

	public static void main(String[] args) {
		SampleAccount sa = new SampleAccount();
		
		sa.setBalance(300000);
		System.out.println(sa.getBalance());
		sa.setBalance(-500000);
		System.out.println(sa.getBalance());
		sa.setBalance(1800000);
		System.out.println(sa.getBalance());

	}

}
