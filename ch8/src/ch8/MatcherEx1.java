package ch8;

public class MatcherEx1 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		
		System.out.println("aa 를" + stringCount(src,"aa") + " 개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
//		int count = 0;
//		char[] arr = src.toCharArray();
//		for(int i = 0; i <= arr.length/2; i++) {
//			if(arr[i] == 'a' && arr[i+1] == 'a') {
//					count ++;
//					i = i + 1;
//				}
//		}
//		return count;
		
		int index = 0;
		int pos = 0;
		int cnt = 0;
		while((index = src.indexOf(key, pos)) != -1){
			cnt++;
			pos = index + key.length();
		}
		return cnt;
		
	}
}
