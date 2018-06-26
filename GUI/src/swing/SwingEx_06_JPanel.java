package swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class loginJPanel extends JPanel{
	public loginJPanel() {
		add(new JButton("로그인"));
	}
}

public class SwingEx_06_JPanel extends JFrame {
	private SwingEx_06_JPanel( ) {
		setTitle("JPanel Example");
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
