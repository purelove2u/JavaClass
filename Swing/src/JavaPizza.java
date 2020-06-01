import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class JavaPizza {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPizza window = new JavaPizza();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaPizza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 148);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오");
		lblNewLabel.setBounds(0, 10, 626, 28);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("콤보피자");
		btnNewButton.setBounds(10, 48, 108, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("포테이토 피자");
		btnNewButton_1.setBounds(130, 48, 123, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("슈프림피자");
		btnNewButton_2.setBounds(265, 48, 128, 28);
		frame.getContentPane().add(btnNewButton_2);
	}

}
