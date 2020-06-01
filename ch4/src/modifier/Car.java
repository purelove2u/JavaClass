package modifier;

public class Car {
	private int speed;
	private String model;
	private String name;
	private int maxSpeed;
		
	public Car(int speed) {
		super();
		this.speed = speed;
	}
	protected Car(int speed, String model) {
		super();
		this.speed = speed;
		this.model = model;
	}
	Car(int speed, String model, String name) {
		super();
		this.speed = speed;
		this.model = model;
		this.name = name;
	}
	private Car(int speed, String model, String name, int maxSpeed) {
		super();
		this.speed = speed;
		this.model = model;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
}
