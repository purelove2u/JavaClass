package exam;

public class Product {
	// 상품코드(pCode), 상품명(pName), 제조회사(company), 가격(price)
	// 할인율(discout)
	String pCode, pName, company;
	int price;
	double discount;
	// 기본생성자
	Product(){}
	// 할인율 뺀 생성자
	Product(String pCode, String pName, String company, int price){
		this.pCode = pCode;
		this.pName = pName;
		this.company = company;
		this.price = price;
	}
	// 인자를 모두 받는 생성자
	Product(String pCode, String pName, String company, 
			int price, double discount){
		this(pCode, pName, company, price);
		this.discount = discount;
	}
	// 할인율 설정(setDiscount : 할인율을 받아 현재 할인율 변경)
	void setDiscount(double discount) {
		this.discount = discount;
	}
	// 판매가격설정(판매가격 = 판매가격 * (100 - discount)
	double sellPrice() {
		return price * (1 - discount);
	}
}
