package swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class loginJPanel extends JPanel{
	public loginJPanel() {
		add(new JButton("�α���"));
	}
}

public class SwingEx_06_JPanel extends JFrame {
	private SwingEx_06_JPanel( ) {
		setTitle("JPanel Example");
		setBounds(1000, 50, 600, 400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		// ������ ���� 3����
		setLayout(new GridLayout(0, 3));
		
		add(new loginJPanel()); // �������� ���� ����ȭ��
		add(new JPanel()); // �������� �߾� ����ȭ��
		add(new loginJPanel()); // �������� ������ ����ȭ�� 
		
		setVisible(true);
	} 
	
	public static void main(String[] args) {
		new SwingEx_06_JPanel();
	}
	
}
