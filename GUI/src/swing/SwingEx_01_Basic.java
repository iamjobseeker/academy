package swing;

import javax.swing.JFrame;

public class SwingEx_01_Basic {
	public static void main(String[] args) {
		
		// ������ ����
		JFrame frame = new JFrame("���� GUI"); 
		
		// ������ ��ġ�� ũ�� ����
		frame.setLocation(1000, 200);
		frame.setSize(500, 500);
		
		// ������ ���̱� ����
		frame.setVisible(true);
		
		// ������ Ŭ��¡ �̺�Ʈ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// EXIT_ON_CLOSE: �ݱ��ư ������ ���α׷� ���� 
		// DISPOSE_ON_CLOSE: ������ ����(������ ������� ���α׷� ����)
		// HIDE_ON_CLOSE: �������� �ʰ� �ݱ�
		// DO_NOTHING_ON_CLOSE: �ƹ��͵� ���� �ʱ� 
		
	}

}
