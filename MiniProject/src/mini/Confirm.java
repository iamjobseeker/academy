package mini;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Confirm { 
	private JFrame cframe; 
	private JPanel cpane;
	private JLabel cLabel;
	private JButton okbut;
	private JButton nobut; 
	
	private int num;

	public int Press() {
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cframe.dispose();
				
				num = 1;
				// �������â�� �Բ� ���� 
			} 
		});
		
		return 998+num; 
	}
	
	public Confirm() { // ������
	// --- ��� ��� ��ȭ���� ---
	cframe = new JFrame("Ȯ��â");
	cframe.setBounds(1200, 50, 250, 200); 
	cframe.setResizable(false);
	cframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	// ���̺� 
	cLabel = new JLabel("���� ����� ����Ͻðڽ��ϱ�?"); 
	cLabel.setBounds(30, 30, 200, 50); 

	
	// Ȯ�� �� ��� ��ư
	okbut = new JButton("Ȯ��"); // ����ϱ� Ȯ��
	okbut.setBounds(30, 90, 70, 40);
	okbut.setLayout(null);
	okbut.setBackground(Color.WHITE);
	okbut.setBorder(null);
	
	Press();
	
	nobut = new JButton("���"); // ������� �ʱ�
	nobut.setBounds(140, 90, 70, 40);
	nobut.setLayout(null);
	nobut.setBackground(Color.white); 
	nobut.setBorder(null); 
	nobut.addActionListener(new ActionListener() {
		
		@Override 
		public void actionPerformed(ActionEvent e) {
			cframe.dispose();
		}
	});

	cpane = new JPanel();
	cpane.setLayout(null);

	cpane.add(cLabel); 
	cpane.add(okbut);
	cpane.add(nobut); 

	cframe.add(cpane); 
	cframe.setVisible(true);
	} // ������ end
	
//	public static void main(String[] args) {
//		new Confirm();
//	}
	
}
