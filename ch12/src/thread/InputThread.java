package thread;

import javax.swing.JOptionPane;

public class InputThread extends Thread {
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력 값은 " + input + "입니다.");
	}
}
