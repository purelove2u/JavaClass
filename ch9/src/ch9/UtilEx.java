package ch9;

public class UtilEx {

	public static void main(String[] args) {
		Box2<Integer> box1 = Util.boxing(15);
		System.out.println(box1.getItem());
		
		Box2<String> box2 = Util.boxing("홍길동");
		System.out.println(box2.getItem());

	}
}
