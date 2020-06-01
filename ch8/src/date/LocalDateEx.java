package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
	public static void main(String[] args) {
		// 날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 " + currDate);
		
		// 시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 " + currDate);
		
		// 날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 " + currDateTime);
		
	}
}
