package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.sun.glass.events.KeyEvent;

public class SwingEx_07_ContentPane 
extends JFrame implements ActionListener { // Jframe이자 ActionListener타입으로 class를 바꾸었다

	//--- 루트 컨테이너 구성에 필요한 변수 ---
	private Container root; // 루트 컨테이너
	
	// --- 첫 번째 판넬 --- 
	private JPanel pane;
	
	private JButton btnHi;
	private JButton btnBye; 
	private JButton btnChange;
	//-----------------
	
	// --- 두 번째 판넬 ---
	private JPanel pane2;
	private JPanel pane2sub; 
	
	private JButton btnOk;
	private JButton btnCancel;
	private JButton btnChange2;
	
	private JLabel lbDesc;
	// ----------------
	
	//--- 메뉴 구성에 필요한 변수 ---
	private JMenuBar menuBar; // 메뉴바

	private JMenu menu; // 메뉴

	private JMenuItem item1; // 드롭다운 항목
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem exitItem; // 닫기버튼
	//------------------------

	// 생성자
	public SwingEx_07_ContentPane() {
		setTitle("Top-Level Component Example"); 
		setBounds(900, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		// 메뉴바 설정
		initMenuBar();
		
		// 루트컨테이너 설정
		initRootContainer();

		setVisible(true);
	} // 생성자 끝

	private void initRootContainer() {
		// 루트 컨테이너 받기
		root = getContentPane(); 
		
		initPane(); // 첫번째 판넬 설정하기
		initPane2(); // 두번째 판넬 설정하기 
		
		root.add(pane); // 메인프레임에 첫번째 판넬 추가하기 
		root.add(pane2); // 메인프레임에 두번째 판넬 추가하기
	}

	private void initPane2() {
		pane2 = new JPanel();
		pane2sub = new JPanel();
		
		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
		btnChange2 = new JButton("바꾸기");
		
		pane2.setLayout(new GridLayout(2, 0)); 
		
		pane2sub.add(btnOk);
		pane2sub.add(btnCancel);
		pane2sub.add(btnChange2); 
		
		pane2.add(pane2sub); 
		
		lbDesc = new JLabel("두번째 컨테이너입니다.");
		lbDesc.setHorizontalAlignment(JLabel.CENTER); 
		
		pane2.setBackground(Color.CYAN); 
		pane2.add(lbDesc); 
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		btnChange2.addActionListener(this); 
	}

	private void initPane() {
		pane = new JPanel(); 
		
		btnHi = new JButton("안녕");
		pane.add(btnHi);
		btnHi.addActionListener(this);
		
		btnBye = new JButton("바이");
		pane.add(btnBye);
		btnBye.addActionListener(this);
		
		btnChange = new JButton("바꾸기");
		pane.add(btnChange);
		btnChange.addActionListener(this);
	}

	private void initMenuBar() { 
		
		menuBar = new JMenuBar();

		menu = new JMenu("메뉴"); 

		item1 = new JMenuItem("아이템1");
		item2 = new JMenuItem("아이템2");
		item3 = new JMenuItem("아이템3");
		exitItem = new JMenuItem("종료(x)");

		menu.add(item1);
		menu.add(item2);
		menu.add(item3); 
		menu.addSeparator(); // 메뉴 드롭다운에 경계선 추가
		menu.add(exitItem);

		menuBar.add(menu); 

		// 메뉴 아이템 이벤트 생성
		initExitItem(); // 종료버튼 이벤트 

		setJMenuBar(menuBar); // 프레임에 메뉴 올리기  
		
		// 기억키
		exitItem.setMnemonic(KeyEvent.VK_X); // 단축키(X)생성 
		
		// 가속키 : 프로그램 어디서나 쓸 수 있는 단축키
		// alt + Q : 종료 단축키
		exitItem.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_Q, KeyEvent.MODIFIER_ALT)); 
	} 
	
	@Override // Action Event 처리 메소드 
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == exitItem ) // exitItem을 클릭했을 때
		System.exit(0); // 프로그램 종료
	 else if (e.getSource() == btnHi ) {
		 pane.remove(btnHi);  // "안녕" 버튼 제거
		 pane.add(btnBye); // "바이" 버튼 활성화
		 pane.add(btnChange); // 버튼순서를 위해 다시 add 
		 
		 pane.validate(); // 컴포넌트 검증 
		 pane.repaint(); // 다시 그리기 
		 
	 } else if (e.getSource() == btnBye) { 
		 pane.remove(btnBye); // "바이" 버튼 제거
		 pane.add(btnHi); //"안녕" 버튼 활성화
		 pane.add(btnChange);
		 
		 pane.validate();
		 pane.repaint(); 
		 
	 } else if (e.getSource() == btnChange) {
		root.remove(pane);
		root.add(pane2);
		
		root.validate(); // 다시 그려주기
		root.repaint(); 
	 } else if (e.getSource() == btnOk) {
		lbDesc.setText("확인!!!!");
	 } else if (e.getSource() == btnCancel) {
		lbDesc.setText("취소!!!");
	 } else if (e.getSource() == btnChange2) {
		root.remove(pane2);
		root.remove(pane);
		
		root.validate();
		root.repaint();
	 }
	 
	}
	
	private void initExitItem() {
		// Action Event 처리 메소드 등록
		exitItem.addActionListener(this); // 자신(ActionListener타입)을 호출 
		exitItem.setToolTipText("프로그램 닫기");
	} 

	public static void main(String[] args) {
		new SwingEx_07_ContentPane();
	}

}
