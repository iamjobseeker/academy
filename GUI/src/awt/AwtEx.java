package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtEx {

	private Frame fr;

	private Button btn1;
	private Button btn2; 

	private Label lbl;

	public AwtEx() {

		// --- ������(â, �����̳�) ���� --- 
		fr = new Frame("myFrame"); // Ÿ��Ʋ ����
		fr.setVisible(true); 
		// ---------------------------

		// --- ������ ���� ---
		fr.setLayout(new GridLayout(3,1)); // ��ġ������, 3�� 1��
		fr.setLocation(50, 300); // ������ ��ġ, �ȼ� ����
		fr.setSize(500, 500); // ������ ũ�� 
		// ---------------

		// --- ������ �̺�Ʈ ���� ---
		windowEvent(fr); 
		// --------------------

		// --- ������Ʈ ���� ---
		showLabel();
		showButton(); 
		// -----------------

	} // ������ �� 

	// �޼ҵ� ���� 
	private void showLabel() {
		lbl = new Label(); // ���̺�
		lbl.setText("������ �������ּ���"); // ���̺� �ؽ�Ʈ

		lbl.setAlignment(Label.CENTER); // ��� ����
		lbl.setBackground(Color.GRAY); // ���� ȸ�� 

		fr.add(lbl); // �����ӿ� ���̺� �߰� 
	}

	private void showButton() { 
		btn1 = new Button("����"); // ��ư
		btn2 = new Button();
		btn2.setLabel("���");

		// ��ư �̺�Ʈ
		buttonEvent(); 

		// �����ӿ� ��ư �߰�
		fr.add(btn1);
		fr.add(btn2); 
	}

	private void buttonEvent() { 

		// ��ư1 �̺�Ʈ ������
		btn1.addActionListener(new ActionListener() { // Ŭ��
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("�����Ͽ����ϴ�.");
			}
		});

		// ��ư2 �̺�Ʈ ������
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("��ҵǾ����ϴ�."); 
			}
		});
	}

	// ������ �̺�Ʈ ��� 
	// ���3. �ѹ��� ȣ�� 
	private void windowEvent(Frame fr) {

		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
	}

	public static void main(String[] args) {
		new AwtEx(); 
	}
}
