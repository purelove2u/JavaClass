package enumtest;

import java.util.Calendar;

public class WeekEx {
	public static void main(String[] args) {
		// 열거타입 사용하기
		// Week today = Week.THURSDAY;
		Week today = null;
		Calendar cal = Calendar.getInstance();

					//일(1) ~ 토(7) 돌려주는 메소드
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 오늘 날짜를 가져오는 메소드
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;	break;
		case 2:
			today = Week.MONDAY;	break;
		case 3:
			today = Week.TUESDAY;	break;
		case 4:
			today = Week.WEDNESDAY;	break;
		case 5:
			today = Week.THURSDAY;	break;
		case 6:
			today = Week.FRIDAY;	break;
		case 7:
			today = Week.SATURDAY;	break;
		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영화를 봅니다.");
		}else {
			System.out.println("열심히 자바공부를 합니다.");
		}
	}
}