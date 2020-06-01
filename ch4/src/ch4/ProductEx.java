package ch4;

public class ProductEx {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.price = 10000;
		product.setDiscount(0.3);
		System.out.println(product.sellPrice());
		System.out.println(product);//toString override 해야함.
	}

}
