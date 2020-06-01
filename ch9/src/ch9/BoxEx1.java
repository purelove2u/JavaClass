package ch9;

public class BoxEx1 {

	public static void main(String[] args) {
		Box1 box1 = new Box1();
		
		box1.setItem("홍길동");	// box1.setItem(new String("홍길동"))
		System.out.println(box1.getItem());	// (String)box1.getItem()
		box1.setItem(15);		// box1.setItem(new Integer(15))
		box1.setItem(3.14);		// 
		box1.setItem(true);
		box1.setItem(3.16f);
		

	}

}
