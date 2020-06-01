package event;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("버튼을 누르세요");
		contentPane.add(btnNewButton);
		// 버튼과 리스너연동
		btnNewButton.addActionListener(new MyListener2());
		
		label = new JLabel("New label");
		contentPane.add(label);
	}
	
	// 이벤트 처리를 위한 클래스를 내부 클래스로 작성하기
	class MyListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			// 버튼 위에 있는 글자를 변경
			label.setText("버튼이 눌러졌습니다.");
		}
	}
}
