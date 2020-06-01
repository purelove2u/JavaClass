package game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class GameTable extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtScore;
	
	private GameDAO dao;
	private DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameTable frame = new GameTable();
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
	public GameTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		dao = new GameDAO();
		
		JLabel lblNewLabel = new JLabel("명예의 전당");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("이름");
		panel.add(lblName);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtName);
		txtName.setColumns(6);
		
		JLabel lblScore = new JLabel("점수");
		panel.add(lblScore);
		
		txtScore = new JTextField();
		txtScore.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtScore);
		txtScore.setColumns(6);
		
		JButton btnSubmit = new JButton("제출");
		panel.add(btnSubmit);
		btnSubmit.addActionListener(this);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(getModel());
		list();
		scrollPane.setViewportView(table);
		
		
	}
	
	public DefaultTableModel getModel() {
		String columnNames[] = {"이름", "점수"};
		model = new DefaultTableModel(columnNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}
	
	public void list() {
		Vector<GameVO> vecList = dao.scoreList();
		
		for(GameVO vo : vecList) {
			Object[] objlist = {vo.getName(), vo.getScore()};
			model.addRow(objlist);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		GameVO vo = new GameVO();
		vo.setName(txtName.getText());
		vo.setScore(Integer.parseInt(txtScore.getText()));
		
		int result = dao.scoreInsert(vo);
		
		if(result > 0) {
			JOptionPane.showMessageDialog(this, "입력성공");
			model.setNumRows(0);
			list();
		}else {
			JOptionPane.showMessageDialog(this, "입력 데이터를 확인해 주세요");
		}
	}
}
