package ch9;

public class BoxEx2 {

	public static void main(String[] args) {
		// 제네릭 - 타입안정성 / 타입체크와 형변환 생략이 가능하므로 코드 간결
		
		Box2<String> box2 = new Box2<String>();
		
		box2.setItem("홍길동");	// box1.setItem(new String("홍길동"))
		System.out.println(box2.getItem());	// (String)box1.getItem()
//		box2.setItem(15);		// box1.setItem(new Integer(15))
//		box2.setItem(3.14);		// 
//		box2.setItem(true);
//		box2.setItem(3.16f);
	}

}
