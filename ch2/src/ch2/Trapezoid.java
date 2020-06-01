package ch2;

public class Trapezoid {
	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눠줄 때
		//학생 당 몇 개를 가져갈 수 있고 최종적으로 몇 개가 남는지 출력하기
		
		int pencil = 534;
		int person = 30;
		
		/*
		int take = pencil / person;
		int etc = pencil % person;
		
		System.out.println("학생 당 가져가는 개수 : " + take);
		System.out.println("최종적으로 남는 개수 : " + etc);
		*/
		
		System.out.printf("학생 당 가져가는 개수 : %d\n", (pencil / person));
		System.out.printf("최종적으로 남는 개수 : %d", (pencil % person));
	}
}
