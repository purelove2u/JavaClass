package date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();	// 추상클래스(객체생성 X)
		
		System.out.println("이 해의 연도 : " + calendar.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): " + calendar.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("시간(0~11) : " + calendar.get(Calendar.HOUR));
		System.out.println("분(0~59) : " + calendar.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + calendar.get(Calendar.SECOND));
		
	}
}
