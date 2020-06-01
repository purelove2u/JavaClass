package exam;

public class ProductEx {

	public static void main(String[] args) {
		// Product 객체 3개
		// 인자를 모두 받는 생성자를 이용
		// 출력
		Product prod[] = new Product[3];
		prod[0] = new Product("p-001", "cola", "cocacola", 1000, 0.1);
		prod[1] = new Product("p-002", "cider", "chilsung", 900, 0.2);
		prod[2] = new Product("p-003", "fanta", "cocacola", 950, 0.15);

		for(Product p : prod) {
			System.out.println(p.pCode + ", " + p.pName + ", 제조사 " + p.company + ", 소비자가 : " + 
		p.price + ", 할인율 :  " + p.discount + ", 판매가격 : " + p.sellPrice());
			
		}
		
	}

}
