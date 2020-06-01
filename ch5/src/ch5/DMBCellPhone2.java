package ch5;

public class DMBCellPhone2 extends CellPhone {
	//추가된 필드
	int channel;
		
	public DMBCellPhone2() {
		super();	//부모의 default 생성자를 호출하는 구문
	}
	
	public DMBCellPhone2(String model, String color, int channel) {
		super();
		this.model = model; //부모의 것도 호출하여 사용가능
		this.color = color;	//단, 부모클래스에 인자를 받는 생성자가
		this.channel = channel; // 없어야함.
	}

	//추가된 메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송시작");
	}
	void turnOffDmb() {
		System.out.println("채널" + channel + "번 DMB 방송종료");
	}
	void changechannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바뀝니다.");
	}
}


