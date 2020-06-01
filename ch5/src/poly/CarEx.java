package poly;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire(13, "앞 오른쪽");
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire(14, "뒤 왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire(17, "뒤 오른쪽");
				break;
//			default:
//				System.out.println("재확인");
			}
			System.out.println("--------------------------------------");
		}

	}

}
