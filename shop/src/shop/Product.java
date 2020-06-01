package shop;

public abstract class Product {
	private String pname;	//상품명
	private int price;		//가격
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	// 상품명과 가격을 출력하는 메소드(printDetail)
	public void printDetail() {
		System.out.println("상품이름 : " + pname);
		System.out.println("가격 : " + price);
		printExtra();
	}
	public abstract void printExtra();
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}		
}
