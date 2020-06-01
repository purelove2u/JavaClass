package classtest;

public class TransportEx {
	public static void main(String[] args) {
		// 객체 생성
		// passenger 만들고 넣기 -> 변수로 사용 가능
		Passenger passenger = new Passenger("홍길동", 20000);
		Subway subway = new Subway(passenger, 0, 4, "당고개", "안산", null);
		
		// passenger 넣으면서 만들기 -> 일회용
		Bus bus = new Bus(new Passenger("성춘향", 10000), 0, 1233, "공릉동", "시청", null);

		// 메소드 오버라이딩 하려면 왼쪽이 부모가 오는 형태가 낫다.
		// 다만 부모가 제공하는 메소드만 접근 가능
		Transport transport = new Taxi(passenger, 10000, 4381, "잠실", "노원");
		
		
		
	}
}
