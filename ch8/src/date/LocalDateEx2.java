package date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateEx2 {
	public static void main(String[] args) {
		// JDK8 버전부터 사용가능
		// 날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		
		System.out.println(currDateTime.getYear() + "년");
		System.out.println(currDateTime.getMonthValue() + "월");
		System.out.println(currDateTime.getDayOfMonth() + "일");
		
		LocalDate nowDate = currDateTime.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		// 연산
		LocalDateTime targetDateTime = currDateTime.plusYears(1)
												.minusMonths(1)
												.plusDays(3)
												.minusMinutes(5)
												.plusSeconds(6);
		
		System.out.println(targetDateTime);
	}
}
