import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class lesson1 {

	private JFrame frmJpaneltest;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lesson1 window = new lesson1();
					window.frmJpaneltest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lesson1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJpaneltest = new JFrame();
		frmJpaneltest.setTitle("JPanelTest1");
		frmJpaneltest.setBounds(100, 100, 412, 403);
		frmJpaneltest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJpaneltest.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("왼쪽");
		btnNewButton.setBounds(65, 39, 82, 31);
		frmJpaneltest.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("가운데");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(159, 39, 82, 31);
		frmJpaneltest.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("오른쪽");
		btnNewButton_2.setBounds(253, 39, 82, 31);
		frmJpaneltest.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("서쪽");
		btnNewButton_3.setBounds(12, 80, 70, 31);
		frmJpaneltest.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("동쪽");
		btnNewButton_4.setBounds(314, 80, 70, 31);
		frmJpaneltest.getContentPane().add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setBounds(141, 100, 116, 21);
		frmJpaneltest.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(169, 80, 57, 15);
		frmJpaneltest.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("남쪽");
		btnNewButton_5.setBounds(0, 334, 396, 31);
		frmJpaneltest.getContentPane().add(btnNewButton_5);
	}
}
