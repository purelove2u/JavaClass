package token;

import java.util.StringTokenizer;

public class StringTokenEx4 {
	public static void main(String[] args) {
		String str = "x=100*(200+300)/2";
		StringTokenizer token = new StringTokenizer(str, "=*(+)/", true);
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
