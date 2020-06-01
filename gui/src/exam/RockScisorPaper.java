package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RockScisorPaper extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField textField;
	private static final int ROCK = 0;
	private static final int PAPER = 1;
	private static final int SCISSORS = 2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockScisorPaper frame = new RockScisorPaper();
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
	public RockScisorPaper() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel Label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
		Label.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(Label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnRock = new JButton("ROCK");
		btnRock.setIcon(new ImageIcon(RockScisorPaper.class.getResource("/exam/rock.png")));
		btnRock.setFont(new Font("굴림", Font.BOLD, 30));
		btnRock.addActionListener(this);
		panel.add(btnRock);
		
		JButton btnPaper = new JButton("PAPER");
		btnPaper.setIcon(new ImageIcon(RockScisorPaper.class.getResource("/exam/paper.png")));
		btnPaper.setFont(new Font("굴림", Font.BOLD, 30));
		btnPaper.addActionListener(this);
		panel.add(btnPaper);
		
		JButton btnScissors = new JButton("SCISSORS");
		btnScissors.setIcon(new ImageIcon(RockScisorPaper.class.getResource("/exam/scissor.png")));
		btnScissors.setFont(new Font("굴림", Font.BOLD, 30));
		btnScissors.addActionListener(this);
		panel.add(btnScissors);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//컴퓨터의 가위, 바위, 보 생성하기
		Random random = new Random();
		//random.nextInt(3) : 괄호 안의 숫자는 미포함해서 0,1,2 중에서
		//선택하여 나오게 함.
		int computer = random.nextInt(3);
		//사용자가 누른 버튼의 값을 가져온 후
		String str = e.getActionCommand();
		int human = 0;
		if(str == "ROCK") {
			human = 0;
		}else if(str == "PAPER") {
			human = 1;
		}else if(str == "SCISSORS") {
			human = 2;
		}
		//가위, 바위, 보를 해서 누가 이겼는지 textField에 보여주기
		if(human == computer) {
			textField.setText("무승부");
		}else if(human == 0 && computer == 1) {
			textField.setText("나 : 바위  > 컴퓨터 승리 < 컴 : 보");
		}else if(human == 0 && computer == 2) {
			textField.setText("나 : 바위 > 나의 승리 < 컴 : 가위");
		}else if(human == 1 && computer == 0) {
			textField.setText("나 : 보 > 나의 승리 < 컴 : 바위");
		}else if(human == 1 && computer == 2) {
			textField.setText("나 : 보 > 컴퓨터 승리 < 컴 : 가위");
		}else if(human == 2 && computer == 0) {
			textField.setText("나 : 가위 > 컴퓨터 승리 < 컴 : 바위");
		}else if(human == 2 && computer == 1) {
			textField.setText("나 : 가위 > 나의 승리 < 컴 : 보");
		}
	}
}
