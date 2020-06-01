package poly;

public class Tv {
	//색상, 전원상태, 채널
	/*private*/ String color;
	/*private*/ boolean power;
	/*private*/ int channel;
	
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
	
}
