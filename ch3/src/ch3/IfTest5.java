package ch3;

public class IfTest5 {

	public static void main(String[] args) {
		// Math.random() : 0.0보다 크거나 같고 1.0보다 작은 수를 랜덤으로 돌려줌
		// 1~6까지 임의로 발생
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("주사위 1번");
		}else if(num == 2){
			System.out.println("주사위 2번");
		}else if(num == 3){
			System.out.println("주사위 3번");
		}else if(num == 4){
			System.out.println("주사위 4번");
		}else if(num == 5){
			System.out.println("주사위 5번");
		}else if(num == 6){
			System.out.println("주사위 6번");
		}
	}
}
