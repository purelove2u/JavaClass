package exam;

public class CarEx {

	public static void main(String[] args) {
		// Car 객체 배열 3개 선언
		Car car[] = new Car[3];
		car[0] = new Car("현대", "그랜저", "검정", 240);
		car[1] = new Car("대우", "마티즈", "핑크", 150);
		car[2] = new Car("삼성", "SM5", "White", 210);
		
		for(Car c : car) {
			System.out.println(c.company + " " + c.model + " " + c.color + " " + c.speed);
		}
		print(car);
	}
	
	static void print(Car[] car) {
		for(int i = 0 ; i < car.length ; i++) {
			System.out.println(car[i].company + " "+ car[i].model + " " 
					+ car[i].color + " " + car[i].speed);
		}
		
		for(Car c : car) {
			System.out.println(c.company + " "+ c.model + " " 
					+ c.color + " " + c.speed);
		}
	}
}
