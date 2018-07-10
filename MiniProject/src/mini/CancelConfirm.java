package mini;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CancelConfirm extends JFrame{

	JLabel c_label;
	JButton c_okbut;
	JButton c_nobut;
	
	private CancelConfirm() { // ������ 
		
		setTitle("Ȯ��â");
		setBounds(1200, 50, 250, 200); 
		setResizable(false);
		
		JPanel c_pane = new JPanel();
		c_pane.setLayout(null);
		
		// ���̺� 
		c_label = new JLabel("���� ����� ����Ͻðڽ��ϱ�?"); 
		c_label.setBounds(30, 30, 200, 50); 

		// Ȯ�� �� ��� ��ư
		c_okbut = new JButton("Ȯ��"); // ����ϱ� Ȯ��(cancel_ok)
		c_okbut.setBounds(30, 90, 70, 40);
		c_okbut.setBorderPainted(false);
		c_okbut.setBackground(Color.white);
		
		c_nobut = new JButton("���"); // ������� �ʱ�(cancel_cancel)
		c_nobut.setBounds(140, 90, 70, 40);
		c_nobut.setBorderPainted(false);
		c_nobut.setBackground(Color.WHITE);
		
		c_pane.add(c_label); 
		c_pane.add(c_okbut);
		c_pane.add(c_nobut); 

		add(c_pane); 
		setVisible(true);
		
		//��� Ȯ��â �̺�Ʈ
		c_nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // Ȯ��â ���� 
				
			}
		});

		c_okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // Ȯ��â�� ����
				System.exit(0); // ���� ���â�� ����
				
			}
		});
}

	public static void main(String[] args) {
		new CancelConfirm();
	}
}
