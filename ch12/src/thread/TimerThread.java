package thread;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThread extends JFrame{
	public TimerThread() {
		setTitle("타이머 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic", Font.ITALIC, 80));
		add(label);
		
		setSize(250, 150);
		setVisible(true);
		
		Timer timer = new Timer(label);
		timer.start();
	}
	public static void main(String[] args) {
		TimerThread t1 = new TimerThread();
	}
}
