package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SimpleCalc2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JPanel panel_1;
	private JButton btnCancel;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiple;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
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
	JLabel lblcalc = new JLabel("?");
	
	public SimpleCalc2() {
		setTitle("사칙연산 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		txtOp1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtOp1);
		txtOp1.setColumns(10);
		
		
		lblcalc.setFont(new Font("굴림", Font.BOLD, 15));
		panel.add(lblcalc);
		
		txtOp2 = new JTextField();
		txtOp2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtOp2);
		txtOp2.setColumns(10);
		
		JLabel lblequals = new JLabel("=");
		lblequals.setFont(new Font("굴림", Font.BOLD, 15));
		panel.add(lblequals);
		
		txtResult = new JTextField();
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtResult);
		txtResult.setColumns(15);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(this);
		panel_1.add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(this);
		panel_1.add(btnMinus);
		
		btnMultiple = new JButton("*");
		btnMultiple.addActionListener(this);
		panel_1.add(btnMultiple);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(this);
		panel_1.add(btnDivide);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		double op1 = Double.parseDouble(txtOp1.getText());
		double op2 = Double.parseDouble(txtOp2.getText());
		double result = 0;
		
		if(btn == btnPlus) {
			result = op1 + op2;
			lblcalc.setText("+");
		}
		else if(btn == btnMinus) {
			result = op1 - op2;
			lblcalc.setText("-");
		}
		else if(btn == btnMultiple) {
			result = op1 * op2;
			lblcalc.setText("*");
		}
		else if(btn == btnDivide) {
			result = op1 / op2;
			lblcalc.setText("/");
		}else {
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
		}
		txtResult.setText(String.valueOf(result));
	}
}
