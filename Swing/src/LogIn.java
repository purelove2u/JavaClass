import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	 public LogIn() {
		 JPanel panel = new JPanel();
		 JLabel label = new JLabel("ID : ");
		 JLabel pswrd = new JLabel("Password : ");
		 JTextField txtID = new JTextField(10);
		 JPasswordField txtPass = new JPasswordField(10);
		 JButton logBtn = new JButton("Log In");
		 
		 panel.add(label);
		 panel.add(txtID);
		 panel.add(pswrd);
		 panel.add(txtPass);
		 panel.add(logBtn);
		 
		 logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Dan";
				String pass = "1234";
				
				if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "you have logged in successfully");
				}else {
					JOptionPane.showMessageDialog(null, "you failed to log in");
				}
			}
		});
		 
		 add(panel);
		 
		 setVisible(true);
		 setSize(600,400);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLocationRelativeTo(null);
		 setResizable(false);
		 
	 }
	 
	 public static void main(String[] args) {
		new LogIn();
	}
}
