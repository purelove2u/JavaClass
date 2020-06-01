package classtest;

public class Transport {
	private Passenger passenger; 	//승객
	private int money; 				//요금
	private int number;				//열차,버스,택시번호
	private String startLocation;	//출발지
	private String endLocation; 	//도착지
	private String transLocation;	//경유지
	
	// 택시
	public Transport(Passenger passenger, int money, int number, String startLocation, String endLocation) {
		super();
		this.passenger = passenger;
		this.money = money;
		this.number = number;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}
	
	// 버스, 지하철
	public Transport(Passenger passenger, int money, int number, String startLocation, String endLocation,
			String transLocation) {
		super();
		this.passenger = passenger;
		this.money = money;
		this.number = number;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.transLocation = transLocation;
	}
	
	public void take(int money) {	//승차(태우다)
		this.money += money;	//수입, 요금
	}

	public int getNumber() {
		return number;
	}
}
