package ch6;

public interface Lendable {
	// 대여하다
	void checkOut(String borrower, String date);
	// 반납하다
	void checkIn();
}
