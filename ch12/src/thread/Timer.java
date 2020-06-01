package thread;

import javax.swing.JLabel;

public class Timer extends Thread {
	private JLabel label;
	public Timer(JLabel label) {
		this.label = label;
	}

	@Override
	public void run() {
		// label의 값을 하나씩 증가시켜서 보여주기
		int n = 0;
		while(true) {
			//n의 값을 label에 보여주기
			label.setText(n + "");
			n++;
			
			try {
				//현재 쓰레드를 1초간 멈춤
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
