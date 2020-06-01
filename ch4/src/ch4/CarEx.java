package ch4;

public class CarEx {

	public static void main(String[] args) {
		// Car 객체 생성 => 생성자 호출
		Car car1 = new Car();
		Car car2 = new Car("현대", "그랜저", "검정");
		Car car3 = new Car("대우", "마티즈", "흰색", 200);
			
		// 객체 사용
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.speed);
		System.out.println();
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.speed);
		
	}

}
