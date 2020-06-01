package modifier;

public class CarEx {

	public static void main(String[] args) {
		Car car1 = new Car(100);
		Car car2 = new Car(100, "스포티지");
		Car car3 = new Car(100, "스포티지", "중형");

		System.out.println(car1 == car2);
	}

}
