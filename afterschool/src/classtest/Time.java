package classtest;

public class Time {
	// 속성 : 시, 분, 초
	private int hour, min, sec;

	// 생성자 : 기본생성자, 인자를 받는 생성자
	public Time() {
		super();
	}
	
	// hour, min, sec가 정상 범위의 값인지 확인 후 초기화
	public Time(int hour, int min, int sec) {
		if(hour <= 23 && hour >= 0 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}else {
			this.hour = 0;
			this.min = 0;
			this.sec = 0;
		}
	}
	// 위 작업을 삼항연산자로 표현
//	public Time(int hour, int min, int sec) {
//		super();
//		this.hour = ((hour >= 0 && hour < 24) ? hour : 0);
//		this.min = ((min >= 0 && min < 60) ? min : 0);
//		this.sec = ((sec >= 0 && sec < 60) ? sec : 0);
//	}

	public int getHour() {
		return hour;
	}
	public int getMin() {
		return min;
	}
	public int getSec() {
		return sec;
	}
}
