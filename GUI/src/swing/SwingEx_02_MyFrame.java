package swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx_02_MyFrame extends JFrame  { // JFrame�� ��ӹ޾� Ŭ������ü�� â�� ��ó�� �ۼ��Ѵ�

	// ���̺� 1��
	private JLabel lbl;
	// ��ư 2�� 
	private Button btn1; // �׳� ��ư
	private JButton btn2; // J��ư
	private JButton btn3; // J��ư

	// private������, �ٸ� ����� ���Ǻ��� ����
	private SwingEx_02_MyFrame() { // ������ 

		// ���� ǥ���� 
		setTitle("GUI Program");

		// ��ġ�� ũ�� 
		setLocation(500, 200);
		setSize(500, 500);

		// �ݱ� 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		// ��ġ������ 
		setLayout(new GridLayout(2, 2)); 

		// ������Ʈ ����  		// �̺�Ʈ ���� 
		initFrame(); 		initEvent();

		// ��������
		setVisible(true); 

	} // ������ �� 
	
	private void initFrame() { 
		// ���̺� 1��, ��ư 3�� ����
		lbl = new JLabel("���̺� �Դϴ�.");
		lbl.setHorizontalAlignment(JLabel.CENTER); // ��� ����, CENTER�� ���(=0)
												   // Sets the alignment of the label's contents along the X axis. 
		btn1 = new Button("��ư1(awt) �Դϴ�."); 
		btn2 = new JButton("��ư2(swing) �Դϴ�.");
		btn3 = new JButton("��ư3(swing) �Դϴ�.");

		// �����ӿ� ��ư �߰�
		add(btn1); // Awt�� Swing�� �θ�Ŭ���� 
		add(btn2);
		add(btn3); 
		add(lbl);
	} 

	private void initEvent() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(""); 
				lbl.setForeground(Color.red); // �� �ȵ���...
			}
		}); 

		// ��ư�� ������ ���̺� �ؽ�Ʈ�� ���̵��� �ۼ�
		// btn2 -> ��ư2����!!
		// btn3 -> ��ư3����!!
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("��ư2 ����!!");
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("��ư3 �̿���!!");
			}
		});
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame(); 

	}

}
