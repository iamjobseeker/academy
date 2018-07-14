package swing;

import javax.swing.JFrame;

public class SwingEx_08_Dispose extends JFrame {
	public SwingEx_08_Dispose() { // ������
		setBounds(900, 300, 600, 400); 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // �����Ű�� �ڽ��� â�� �����Ų�� 
		setTitle("Original");
		
		// ������ �߰�
		JFrame another = new JFrame();
		another.setBounds(800, 200, 600, 400);
		another.setDefaultCloseOperation(EXIT_ON_CLOSE); // �����Ű�� ��� â�� �����Ų��
		another.setVisible(true);
		another.setTitle("another"); 
		// ������ �߰� �Ϸ�
		
		setVisible(true); 
	} // ������ ��
	
	public static void main(String[] args) {
		new SwingEx_08_Dispose(); 
	}
}

