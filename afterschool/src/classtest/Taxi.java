package classtest;

public class Taxi extends Transport{

	public Taxi(Passenger passenger, int money, int number, String startLocation, String endLocation) {
		super(passenger, money, number, startLocation, endLocation);
	}
	// 속성
	// 승객, 요금, 택시번호, 출발지, 도착지
	
	// 기능(동작)
	// 태우다
	
	// 추가 기능
	public void showTaxiInfo() {
		System.out.println("택시번호" + getNumber());
	}
}
