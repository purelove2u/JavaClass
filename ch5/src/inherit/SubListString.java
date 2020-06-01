package inherit;

public class SubListString extends ListString {
	String name = "임꺽정";
	
	//메소드 오버라이딩 : 부모의 메소드와 동일한 시그니처(리턴타입, 메소드명, 메개변수)를 가져야 한다.
	//				접근 제한을 더 강하게 오버라이딩 할 수 없다.
	//				새로운 예외를 throws 할 수 없다.
	@Override
	public void list() {
		super.list();
		System.out.println(name + " 하위 클래스 이름");
	}
}
