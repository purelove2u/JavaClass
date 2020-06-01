package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");	// SSS 1/1000초  
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.a");	// a 오전오후
		System.out.println(sdf.format(date));

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		// HH 24시, hh 12시
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");	// 해당 년의 n번째 일
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 이번 달의 d번째 날입니다.");	// 해당 월의 n번째 일
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");	// 해당 년의 n번째 주
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 이번 달의 W번째 주입니다.");	// 해당 월의 n번째 주
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 이번 달의 F번째 E요일입니다.");	// 해당 월의 n번째 요일
		System.out.println(sdf.format(date));
		
	}
}
