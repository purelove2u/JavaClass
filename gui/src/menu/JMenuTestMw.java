package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.undo.UndoManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenuTestMw extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextArea textArea;
	private JMenuItem mntmNew, mntmOpen, mntmSave, mntmExit, mntmUndo, mntmCut, mntmCopy, mntmPaste, mntmSelectAll, mntmTimeDate;
	private UndoManager undo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					JMenuTestMw frame = new JMenuTestMw();
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
	public JMenuTestMw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("파일(F)");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("새로만들기(N)");
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnFile.add(mntmNew);
		
		mntmOpen = new JMenuItem("열기(O)");
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmOpen);
		
		mntmSave = new JMenuItem("저장(S)");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		mntmExit = new JMenuItem("끝내기(X)");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("편집(E)");
		mnEdit.setMnemonic('E');
		menuBar.add(mnEdit);
		
		mntmUndo = new JMenuItem("실행취소");
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmUndo);
		
		JSeparator separator = new JSeparator();
		mnEdit.add(separator);
		
		mntmCut = new JMenuItem("잘라내기");
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCut);
		
		mntmCopy = new JMenuItem("복사");
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopy);
		
		mntmPaste = new JMenuItem("붙여넣기");
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);
		
		JSeparator separator_1 = new JSeparator();
		mnEdit.add(separator_1);
		
		mntmSelectAll = new JMenuItem("모두선택");
		mntmSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnEdit.add(mntmSelectAll);
		
		mntmTimeDate = new JMenuItem("시간/날짜");
		mntmTimeDate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mnEdit.add(mntmTimeDate);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		
		undo = new UndoManager();
		textArea.getDocument().addUndoableEditListener(undo);
		
		mntmNew.addActionListener(this);
		mntmOpen.addActionListener(this);
		mntmSave.addActionListener(this);
		mntmExit.addActionListener(this);
		mntmUndo.addActionListener(this);
		mntmCut.addActionListener(this);
		mntmCopy.addActionListener(this);
		mntmPaste.addActionListener(this);
		mntmSelectAll.addActionListener(this);
		mntmTimeDate.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menu = (JMenuItem)e.getSource();
		
		if(menu == mntmNew) {
			// textArea에 내용이 있다면 현재 내용에 대한 변경여부를 묻는 창을 하나 띄운 후
			// 사용자의 선택 여부에 따라 일을 수행한 후 새 창 보여주기
			if(textArea.getText().length() > 0) {
				String options[] = {"저장", "저장안함", "취소"};
				int retVal = JOptionPane.showOptionDialog(this, "변경 내용을 제목없음에 저장하시겠습니까?", "메모장", JOptionPane.DEFAULT_OPTION, -1, null, options, options);
				if(retVal == 0) {	//저장
					save();
				}else if(retVal == 1) {	//저장안함
					textArea.setText("");
				}else {	//취소
					return;
				}
			}			
		}else if(menu == mntmOpen) {
			JFileChooser choo = getChooser();
			//열기 or 취소
			int retVal = choo.showOpenDialog(this);
			
			if(retVal == 0) {	//열기 버튼 클릭한 경우
				File file = choo.getSelectedFile();
				// Reader 이용해서 읽어온 후
				// textArea에 보여주기
				try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "ms949")){					
					int input;
					while((input = reader.read()) != -1){
						textArea.append((String.valueOf((char)input)));
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}else {		//취소 버튼 클릭한 경우
				return;
			}
		}else if(menu == mntmSave) {
			save();
		}else if(menu == mntmExit) {
			System.exit(0);
		}else if(menu == mntmUndo) {
			undo.undo();
		}else if(menu == mntmCut) {
			textArea.cut();
		}else if(menu == mntmCopy) {
			textArea.copy();
		}else if(menu == mntmPaste) {
			textArea.paste();
		}else if(menu == mntmSelectAll) {
			textArea.selectAll();
		}else if(menu == mntmTimeDate) {
			// y:년도, M:월, d:일, h:시, m:분, s:초, a:am/pm
			SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd");
			//Date time = new Date();
			//textArea.setText(sdf.format(time.getTime()));
			
			// 데이터 중간에 삽입가능한 메소드 2가지 중 편한 것으로 사용
			textArea.replaceSelection(sdf.format(new Date()));
			//textArea.insert(sdf.format(new Date()), textArea.getCaretPosition());
		}
		
	}
	
	//JFileChooser 객체 생성 후 리턴
	private JFileChooser getChooser() {
		JFileChooser chooser = new JFileChooser();
		//기존 필터 값 지우기
		chooser.setAcceptAllFileFilterUsed(false);
		//필터 추가하기
		chooser.addChoosableFileFilter(new FileNameExtensionFilter("텍스트파일(*.txt)", "txt"));
		chooser.setSelectedFile(new File("*.txt"));
		return chooser;
	}

	private void save() {
		JFileChooser chooser = getChooser();
		
		int retVal = chooser.showSaveDialog(this);
		if(retVal == 0) {	//저장
			// 사용자가 입력한 파일명을 가져와서 해당경로에 현재 textArea 값을 파일로 저장한다.
			// BufferedWriter(FileWriter)
			
			File file = chooser.getSelectedFile();
			// 넘어오는 경로 및 파일명에서 확장자 포함 여부 검사 후 처리
			if(file.getPath().lastIndexOf(".") < 0) {
				file = new File(file.getPath() + ".txt");
			}
			
			try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(file.getPath()), "ms949"))){
				String msg = textArea.getText();
				msg = msg.replaceAll("\n", "\r\n"); //엔터 누른 것이 깨지는 문제
				writer.write(msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			return;
		}
		
	}
}
