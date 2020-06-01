package inherit;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 100;
	}
	
	//final이 붙은 stop은 오버라이딩(Overriding) 금지

}
