package Other;

import inherit.Tv;

public class CaptionTV extends Tv {

	public CaptionTV(String color, boolean power, int channel) {
		super(color, power, channel);
	
	}
	@Override
	protected void print() {
		super.print();
	}

	// 다른 패키지에 있는 클래스를 상속받는 경우
	// default 접근 제한자 메소드는 오버라이딩 불가
	// protected 접근 제한자 메소드는 오버라이딩 가능
	
}
