package ch9;

public class Box2<T> { // T : Type  Variable / E : Element Variable
	// 여러가지 타입의 객체를 담을 수 있는 변수 선언
	private T item;

	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
