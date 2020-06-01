package exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InterRest {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterRest window = new InterRest();
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
	public InterRest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.setTitle("이자계산기");
		frame.setBounds(100, 100, 557, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel lblNewLabel = new JLabel("원금을 입력하시오");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setBounds(91, 58, 164, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("이율을 입력하시오");
		label.setFont(new Font("굴림", Font.BOLD, 17));
		label.setBounds(91, 106, 164, 28);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(288, 58, 144, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.BOLD, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(288, 109, 144, 26);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("변환");
		btnNewButton.setBounds(206, 161, 97, 28);
		frame.getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.BOLD, 15));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(91, 206, 341, 28);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 541, 262);
		frame.getContentPane().add(panel);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double balance = Double.parseDouble(textField.getText());
				double rate = Double.parseDouble(textField_1.getText());
				double result = balance * rate;
				
				textField_2.setText(String.valueOf(result));
				
			}
		});
	}
}
