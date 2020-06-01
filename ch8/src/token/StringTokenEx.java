package token;

import java.util.StringTokenizer;

// String : split() => regex 기준
// StringTokenizer : 간단 (구분자를 하나의 문자만 사용가능)

public class StringTokenEx {
	public static void main(String[] args) {
		String str = "100 200 300";
		StringTokenizer token = new StringTokenizer(str);
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
