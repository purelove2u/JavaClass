package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class JRadioTestPizza extends JFrame implements ItemListener, ActionListener{

	private JPanel contentPane;
	private JRadioButton radioCombo, radioPotato, radioBul, radioPepper, radioCheese
			, radioPepp, radioBacon, radioSmall, radioMedium, radioLarge;
	private JButton btnConfirm, btnCancel;
	private JLabel lblprice, lblPay;
	private String pizza, topping, size;
	private ButtonGroup group1,group2,group3;
	private static int money = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTestPizza frame = new JRadioTestPizza();
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
	public JRadioTestPizza() {
		setTitle("피자주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblWelcome = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setForeground(new Color(72, 61, 139));
		lblWelcome.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(lblWelcome, BorderLayout.NORTH);
				
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		radioCombo = new JRadioButton("콤보");
		panel_2.add(radioCombo);
		
		radioPotato = new JRadioButton("포테이토");
		panel_2.add(radioPotato);
		
		radioBul = new JRadioButton("불고기");
		panel_2.add(radioBul);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		radioPepper = new JRadioButton("피망");
		panel_3.add(radioPepper);
		
		radioCheese = new JRadioButton("치즈");
		panel_3.add(radioCheese);
		
		radioPepp = new JRadioButton("페퍼로니");
		panel_3.add(radioPepp);
		
		radioBacon = new JRadioButton("베이컨");
		panel_3.add(radioBacon);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		radioSmall = new JRadioButton("Small");
		panel_4.add(radioSmall);
		
		radioMedium = new JRadioButton("Medium");
		panel_4.add(radioMedium);
		
		radioLarge = new JRadioButton("Large");
		panel_4.add(radioLarge);

		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnConfirm = new JButton("주문");
		panel_5.add(btnConfirm);
		
		btnCancel = new JButton("취소");
		panel_5.add(btnCancel);
		
		lblprice = new JLabel("금액 : ");
		panel_5.add(lblprice);
		
		lblPay = new JLabel(money + "원");
		panel_5.add(lblPay);
		
		group1 = new ButtonGroup();
		group1.add(radioCombo);
		group1.add(radioPotato);
		group1.add(radioBul);
		
		group2 = new ButtonGroup();
		group2.add(radioPepp);
		group2.add(radioCheese);
		group2.add(radioPepper);
		group2.add(radioBacon);
		
		group3 = new ButtonGroup();
		group3.add(radioSmall);
		group3.add(radioMedium);
		group3.add(radioLarge);
		
		radioCombo.addItemListener(this);
		radioPotato.addItemListener(this);
		radioBul.addItemListener(this);
		radioCheese.addItemListener(this);
		radioPepper.addItemListener(this);
		radioPepp.addItemListener(this);
		radioBacon.addItemListener(this);
		radioSmall.addItemListener(this);
		radioMedium.addItemListener(this);
		radioLarge.addItemListener(this);
		btnCancel.addActionListener(this);
		btnConfirm.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		if(btn == btnCancel) {
		//	money = 0;
			lblPay.setText(String.valueOf(money + "원"));
			group1.clearSelection();
			group2.clearSelection();
			group3.clearSelection();
		}else {
			if(pizza == null || topping == null || size == null) {
				JOptionPane.showConfirmDialog(getParent(), "주문이 완료되지 않았습니다.","주문완료",
						JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			}else{
				if(btn == btnConfirm) {
					String option[] = {"주문", "변경", "취소"};
					JOptionPane.showOptionDialog(this, "종류 : " + pizza + "\n토핑 : " + topping + 
							"\n크기 : " + size + "\n가격은 " + money + "입니다. 주문하시겠습니까?", "주문내역"
							, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
				}
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton)e.getItem();
		
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(radio == radioCombo) {
				money += 1000;
				pizza = radio.getText();
			}else if(radio == radioPotato) {
				money += 2000;
				pizza = radio.getText();
			}else if(radio == radioBul) {
				money += 4000;
				pizza = radio.getText();
			}else if(radio == radioPepper) {
				money += 800;
				topping = radio.getText();
			}else if(radio == radioCheese) {
				money += 1000;
				topping = radio.getText();
			}else if(radio == radioPepp) {
				money += 1500;
				topping = radio.getText();
			}else if(radio == radioBacon) {
				money += 1500;
				topping = radio.getText();
			}else if(radio == radioSmall) {
				money += 8000;
				size = radio.getText();
			}else if(radio == radioMedium) {
				money += 10000;
				size = radio.getText();
			}else if(radio == radioLarge) {
				money += 13000;
				size = radio.getText();
			}
			
		}else {
			if(radio == radioCombo) {
				money -= 1000;
			}else if(radio == radioPotato) {
				money -= 2000;
			}else if(radio == radioBul) {
				money -= 4000;
			}else if(radio == radioPepper) {
				money -= 800;
			}else if(radio == radioCheese) {
				money -= 1000;
			}else if(radio == radioPepp) {
				money -= 1500;
			}else if(radio == radioBacon) {
				money -= 1500;
			}else if(radio == radioSmall) {
				money -= 8000;
			}else if(radio == radioMedium) {
				money -= 10000;
			}else if(radio == radioLarge) {
				money -= 13000;
			}
		}
		
		lblPay.setText(String.valueOf(money + "원"));
	}
}
