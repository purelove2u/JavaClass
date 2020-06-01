package ch6;

public class SmartTv implements Searchable, RemoteControl {

	private int volume;

	@Override
	public void turnon() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println("URL을 검색합니다.");
	}
}
