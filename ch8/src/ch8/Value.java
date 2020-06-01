package ch8;

public class Value {
	private int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	@Override		//Object가 부모이기 때문에 Object로 받음
	public boolean equals(Object obj) {
		//castException 방지 obj가 Value로 casting 가능한가?
		if(obj instanceof Value) {	
			Value v = (Value)obj;
			return this.value == v.value;
		}
		return false;
	}
	
	@Override
	public String toString() {	//멤버변수의 값을 문자열로 리턴
		return "" + value;
	}
}
