package shop;
//스마트TV : 상품명, 가격, 해상도
//상품명과 가격을 출력하는 메소드
//해상도 정보를 출력하는 메소드
public class SmartTV extends Product {
	private String resolution;	//해상도
	
	public SmartTV(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution = resolution;
	}
	
	@Override
	public void printExtra() {
		System.out.println("해상도 정보 : " + resolution);
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
}