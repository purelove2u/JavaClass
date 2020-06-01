package ch4;

public class SubscriberInfoEx {

	public static void main(String[] args) {
		SubscriberInfo info1 = new SubscriberInfo("홍길동", "hong123", "hong123@", 
				"010-1234-1234", "서울");
		System.out.println(info1);
		
		SubscriberInfo info2 = new SubscriberInfo("성춘향", "sung123", "sung123@");
		System.out.println(info2);
		
		info2.changeTel("010-9876-5432");
		info2.changeAddr("경기도");
		System.out.println(info2);
		
	}

}
