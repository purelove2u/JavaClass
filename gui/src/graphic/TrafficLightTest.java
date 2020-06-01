package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

class Traffic extends JPanel implements ActionListener{
	private int lightNumber = 0;
	
	public Traffic() {
		setLayout(new BorderLayout());
		JButton btn = new JButton("Turn On");
		btn.addActionListener(this);
		add(btn, BorderLayout.SOUTH);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(20, 20, 80, 80);
		g.drawOval(20, 100, 80, 80);
		g.drawOval(20, 180, 80, 80);
		if(lightNumber == 0) {
			g.setColor(Color.red);
			g.fillOval(20, 20, 80, 80);
		}else if(lightNumber == 1) {
			g.setColor(Color.green);
			g.fillOval(20, 100, 80, 80);
		}else if(lightNumber == 2) {
			g.setColor(Color.blue);
			g.fillOval(20, 180, 80, 80);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(++lightNumber > 2) {
			lightNumber = 0;
		}
		repaint();
	}

}
public class TrafficLightTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficLightTest frame = new TrafficLightTest();
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
	public TrafficLightTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 145, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().add(new Traffic());
	}

}
