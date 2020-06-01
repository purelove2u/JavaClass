package inherit;

public class Tv {
	//색상, 전원상태, 채널
	/*private*/ String color;
	/*private*/ boolean power;
	/*private*/ int channel;
	
	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	//전원여부
	void power() {
		power = !power;
	}
	//채널변경
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	protected void print() {
		System.out.println("protected 메소드");
	}
	
}
