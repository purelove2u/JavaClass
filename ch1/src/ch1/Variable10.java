package ch1;

public class Variable10 {

	public static void main(String[] args) {
		//1byte를 저장할 수 있는 메모리 공간이고 이름은 var1
		byte var1 = 125;  //2의 8승 범위의 값 : -값 ~ + 값(-128 ~ 127)
		int var2 = 125;  //2의 32승 범위의 값
		
		for(int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + " var2 : " + var2);
			
		}

	}

}
