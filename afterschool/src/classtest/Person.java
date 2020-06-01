package classtest;

public class Person {
	// 속성 - 이름, 키, 몸무게, 주소
	private String name, address;
	private double height, weight;
	public Person() {
		super();
	}
	public Person(String name, String address, double height, double weight) {
		super();
		this.name = name;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	
}
