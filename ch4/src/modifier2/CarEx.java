package modifier2;

import modifier.Car;

public class CarEx {

	public static void main(String[] args) {
		// modifier 패키지에 있는 Car 객체 생성
		Car car = new Car(100);	// public
		
		// protected / default 접근제한자를 가진 생성자는
		// 다른 패키지에서 보이지 않음

	}

}
