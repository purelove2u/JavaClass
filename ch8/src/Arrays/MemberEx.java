package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MemberEx {
	public static void main(String[] args) {
		Member memArr[] = new Member[5];
		
		memArr[0]  = new Member("홍길동", 1);
		memArr[1]  = new Member("정해원", 2);
		memArr[2]  = new Member("박보검", 3);
		memArr[3]  = new Member("송중기", 4);
		memArr[4]  = new Member("조인성", 5);
		
		Arrays.sort(memArr);
		
		System.out.println(Arrays.toString(memArr));
		
	}

}
