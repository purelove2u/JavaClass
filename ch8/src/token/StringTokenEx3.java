package token;

import java.util.StringTokenizer;

public class StringTokenEx3 {
	public static void main(String[] args) {
		String str = " 1, 김천재, 100, 100, 100 | 2, 박수재, 95, 80, 90 |"
				+ " 3, 이자바, 80, 90, 90";
		StringTokenizer token = new StringTokenizer(str, "|");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
