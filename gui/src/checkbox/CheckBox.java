package checkbox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Font;

public class CheckBox extends JFrame implements ItemListener{

	private JLabel lblApple, lblGrape, lblOrange;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxApple = new JCheckBox("Apple");
		chckbxApple.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(chckbxApple);
		
		JCheckBox chckbxGrape = new JCheckBox("Grape");
		chckbxGrape.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(chckbxGrape);
		
		JCheckBox chckbxOrange = new JCheckBox("Orange");
		chckbxOrange.setFont(new Font("굴림", Font.BOLD, 12));
		panel_1.add(chckbxOrange);
		
		lblApple = new JLabel("");
		panel.add(lblApple);
		
		lblGrape = new JLabel("");
		panel.add(lblGrape);
		
		lblOrange = new JLabel("");
		panel.add(lblOrange);
		
		chckbxApple.addItemListener(this);
		chckbxGrape.addItemListener(this);
		chckbxOrange.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox checkbox = (JCheckBox)e.getItem();
		ImageIcon icon = null;
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(checkbox.getText().equals("Apple")) {
				icon = new ImageIcon(getClass().getResource("apple.gif"));
				lblApple.setIcon(icon);
			}else if(checkbox.getText().equals("Grape")) {
				icon = new ImageIcon(getClass().getResource("grape.gif"));
				lblGrape.setIcon(icon);
			}else if(checkbox.getText().equals("Orange")) {
				icon = new ImageIcon(getClass().getResource("orange.gif"));
				lblOrange.setIcon(icon);
			}
		}else {
			if(checkbox.getText().equals("Apple")) {				
				lblApple.setIcon(null);
			}else if(checkbox.getText().equals("Grape")) {				
				lblGrape.setIcon(null);
			}else if(checkbox.getText().equals("Orange")) {
				lblOrange.setIcon(null);
			}
		}
	}
}
