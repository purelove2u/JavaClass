package classtest;

public class TimeEx {

	public static void main(String[] args) {
		
		Time time1 = new Time(23, 48, 25);
		System.out.print(time1.getHour() + "시");
		System.out.print(time1.getMin() + "분");
		System.out.println(time1.getSec() + "초");
		
		Time time2 = new Time(25, 58, 90);
		System.out.print(time2.getHour() + "시");
		System.out.print(time2.getMin() + "분");
		System.out.print(time2.getSec() + "초");
	}

}
