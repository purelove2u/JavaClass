package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Celsius extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Celsius frame = new Celsius();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Celsius() {
		setTitle("온도변환기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Celsius = new JLabel("  Celsius");
		Celsius.setFont(new Font("굴림", Font.BOLD, 15));
		contentPane.add(Celsius);
		
		JButton ConvertBtn = new JButton("Convert");
		ConvertBtn.setFont(new Font("굴림", Font.BOLD, 15));
		contentPane.add(ConvertBtn);
		
		JLabel Fahrenheit = new JLabel("  Fahrenheit");
		Fahrenheit.setFont(new Font("굴림", Font.BOLD, 15));
		contentPane.add(Fahrenheit);
		
		pack();
		
		ConvertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() != null) {
					double celsius = Double.parseDouble(textField.getText());
					Celsius.setText("   " + textField.getText() + "C");
					double result = (celsius * (9.0)/(5.0)) + 32;
					Fahrenheit.setText("   " + String.valueOf(result) + "F");
				}else {
					textField.setText("");
					Celsius.setText("  Celsius");
					Fahrenheit.setText("   Fahrenheit");
				}
			}
		});
	}
}
