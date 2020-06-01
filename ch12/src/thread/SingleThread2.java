package thread;

import javax.swing.JOptionPane;

public class SingleThread2 {

	public static void main(String[] args) {
		// 사용자로부터 입력을 받고, 10~1까지 출력하는 프로그램
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력 값은 " + input + "입니다.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
