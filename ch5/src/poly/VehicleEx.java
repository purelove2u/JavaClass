package poly;

public class VehicleEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Taxi taxi = new Taxi();
//		driver.drive(taxi);
		Vehicle vehicle = new Taxi();
		driver.drive(vehicle);
				
//		Bus bus = new Bus();
//		driver.drive(bus);
		vehicle = new Bus();
		driver.drive(vehicle);
		
	}

}
