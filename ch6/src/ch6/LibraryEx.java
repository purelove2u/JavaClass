package ch6;

public class LibraryEx {

	public static void main(String[] args) {
		//도서대출
		Lendable lendable = new SeperateVolume("863?774개", "개미", "베르나르베르베르");
		lendable.checkOut("홍길동", "20200219");
		
		//CD 대출
		lendable = new AppCDInfo("2019-001", "Oracle예제");
		lendable.checkOut("성춘향", "20200219");
		
		//반납
		lendable.checkIn();
	}

}
