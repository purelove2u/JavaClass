package inherit;

public class ComputerEx {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		System.out.println("원 면적 : " + computer.areaCircle(10));
		
		Calculator cal = new Calculator();
		
		System.out.println("원 면적 : " + cal.areaCircle(10));
	}

}
