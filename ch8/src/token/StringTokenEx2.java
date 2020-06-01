package token;

import java.util.StringTokenizer;

public class StringTokenEx2 {
	public static void main(String[] args) {
		String str = "100/200/300";
		StringTokenizer token = new StringTokenizer(str, "/");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
