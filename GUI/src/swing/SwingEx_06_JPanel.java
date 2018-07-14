package swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class loginJPanel extends JPanel { // 판넬지정 클래스
	
	public loginJPanel() { // 생성자
		setLayout(null);
		
		JButton btn = new JButton("login"); // 레이아웃 지정하여 
		btn.setBounds(10, 130, 150, 80);   	// 로그인 버튼 추가
		add(btn);
		
		// add(new JButton("로그인")); // 로그인 버튼 추가 
	} 
}

public class SwingEx_06_JPanel extends JFrame { // 프레임지정 클래스
	
	private SwingEx_06_JPanel( ) { // 생성자  
		
		setTitle("Example");
		setBounds(1000, 50, 600, 400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		// 윈도우 수직 3분할
		setLayout(new GridLayout(0, 3));

		add(new loginJPanel()); // 윈도우의 왼쪽 분할화면
		add(new JPanel()); // 윈도우의 중앙 분할화면
		add(new loginJPanel()); // 윈도우의 오른족 분할화면 

		setVisible(true);
	} 

	public static void main(String[] args) {
		new SwingEx_06_JPanel();
	}

}
