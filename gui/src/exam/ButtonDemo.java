package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonDemo extends JFrame implements ActionListener{

	private JPanel contentPane, panel;
	private JButton btnMiddle, btnLeft, btnRight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonDemo frame = new ButtonDemo();
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
	public ButtonDemo() {
		setTitle("버튼 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnLeft = new JButton("Disable Middle Button");
		btnLeft.setMnemonic('D');
		btnLeft.setActionCommand("disable");
		btnLeft.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/left.gif")));
		btnLeft.addActionListener(this);
		panel.add(btnLeft);
		
		btnMiddle = new JButton("Middle Button");
		btnMiddle.setMnemonic('M');
		btnMiddle.setActionCommand("middle");
		btnMiddle.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/middle.gif")));
		btnMiddle.addActionListener(this);
		panel.add(btnMiddle);
		
		btnRight = new JButton("Enable Middle Button");
		btnRight.setMnemonic('E');
		btnRight.setActionCommand("enable");
		btnRight.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/right.gif")));
		btnRight.addActionListener(this);
		panel.add(btnRight);
		pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource()   /e.getActioncommand()
		
		String cmd = e.getActionCommand();
		if(cmd.equals("disable")) {
			btnMiddle.setEnabled(false);
			btnLeft.setEnabled(false);
			btnRight.setEnabled(true);
		}else {
			btnMiddle.setEnabled(true);
			btnLeft.setEnabled(true);
			btnRight.setEnabled(false);
		}
	}
}
