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
extends JFrame implements ActionListener { // Jframe���� ActionListenerŸ������ class�� �ٲپ���

	//--- ��Ʈ �����̳� ������ �ʿ��� ���� ---
	private Container root; // ��Ʈ �����̳�
	
	// --- ù ��° �ǳ� --- 
	private JPanel pane;
	
	private JButton btnHi;
	private JButton btnBye; 
	private JButton btnChange;
	//-----------------
	
	// --- �� ��° �ǳ� ---
	private JPanel pane2;
	private JPanel pane2sub; 
	
	private JButton btnOk;
	private JButton btnCancel;
	private JButton btnChange2;
	
	private JLabel lbDesc;
	// ----------------
	
	//--- �޴� ������ �ʿ��� ���� ---
	private JMenuBar menuBar; // �޴���

	private JMenu menu; // �޴�

	private JMenuItem item1; // ��Ӵٿ� �׸�
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem exitItem; // �ݱ��ư
	//------------------------

	// ������
	public SwingEx_07_ContentPane() {
		setTitle("Top-Level Component Example"); 
		setBounds(900, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		// �޴��� ����
		initMenuBar();
		
		// ��Ʈ�����̳� ����
		initRootContainer();

		setVisible(true);
	} // ������ ��

	private void initRootContainer() {
		// ��Ʈ �����̳� �ޱ�
		root = getContentPane(); 
		
		initPane(); // ù��° �ǳ� �����ϱ�
		initPane2(); // �ι�° �ǳ� �����ϱ� 
		
		root.add(pane); // ���������ӿ� ù��° �ǳ� �߰��ϱ� 
		root.add(pane2); // ���������ӿ� �ι�° �ǳ� �߰��ϱ�
	}

	private void initPane2() {
		pane2 = new JPanel();
		pane2sub = new JPanel();
		
		btnOk = new JButton("Ȯ��");
		btnCancel = new JButton("���");
		btnChange2 = new JButton("�ٲٱ�");
		
		pane2.setLayout(new GridLayout(2, 0)); 
		
		pane2sub.add(btnOk);
		pane2sub.add(btnCancel);
		pane2sub.add(btnChange2); 
		
		pane2.add(pane2sub); 
		
		lbDesc = new JLabel("�ι�° �����̳��Դϴ�.");
		lbDesc.setHorizontalAlignment(JLabel.CENTER); 
		
		pane2.setBackground(Color.CYAN); 
		pane2.add(lbDesc); 
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		btnChange2.addActionListener(this); 
	}

	private void initPane() {
		pane = new JPanel(); 
		
		btnHi = new JButton("�ȳ�");
		pane.add(btnHi);
		btnHi.addActionListener(this);
		
		btnBye = new JButton("����");
		pane.add(btnBye);
		btnBye.addActionListener(this);
		
		btnChange = new JButton("�ٲٱ�");
		pane.add(btnChange);
		btnChange.addActionListener(this);
	}

	private void initMenuBar() { 
		
		menuBar = new JMenuBar();

		menu = new JMenu("�޴�"); 

		item1 = new JMenuItem("������1");
		item2 = new JMenuItem("������2");
		item3 = new JMenuItem("������3");
		exitItem = new JMenuItem("����(x)");

		menu.add(item1);
		menu.add(item2);
		menu.add(item3); 
		menu.addSeparator(); // �޴� ��Ӵٿ ��輱 �߰�
		menu.add(exitItem);

		menuBar.add(menu); 

		// �޴� ������ �̺�Ʈ ����
		initExitItem(); // �����ư �̺�Ʈ 

		setJMenuBar(menuBar); // �����ӿ� �޴� �ø���  
		
		// ���Ű
		exitItem.setMnemonic(KeyEvent.VK_X); // ����Ű(X)���� 
		
		// ����Ű : ���α׷� ��𼭳� �� �� �ִ� ����Ű
		// alt + Q : ���� ����Ű
		exitItem.setAccelerator(
				KeyStroke.getKeyStroke(
						KeyEvent.VK_Q, KeyEvent.MODIFIER_ALT)); 
	} 
	
	@Override // Action Event ó�� �޼ҵ� 
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == exitItem ) // exitItem�� Ŭ������ ��
		System.exit(0); // ���α׷� ����
	 else if (e.getSource() == btnHi ) {
		 pane.remove(btnHi);  // "�ȳ�" ��ư ����
		 pane.add(btnBye); // "����" ��ư Ȱ��ȭ
		 pane.add(btnChange); // ��ư������ ���� �ٽ� add 
		 
		 pane.validate(); // ������Ʈ ���� 
		 pane.repaint(); // �ٽ� �׸��� 
		 
	 } else if (e.getSource() == btnBye) { 
		 pane.remove(btnBye); // "����" ��ư ����
		 pane.add(btnHi); //"�ȳ�" ��ư Ȱ��ȭ
		 pane.add(btnChange);
		 
		 pane.validate();
		 pane.repaint(); 
		 
	 } else if (e.getSource() == btnChange) {
		root.remove(pane);
		root.add(pane2);
		
		root.validate(); // �ٽ� �׷��ֱ�
		root.repaint(); 
	 } else if (e.getSource() == btnOk) {
		lbDesc.setText("Ȯ��!!!!");
	 } else if (e.getSource() == btnCancel) {
		lbDesc.setText("���!!!");
	 } else if (e.getSource() == btnChange2) {
		root.remove(pane2);
		root.remove(pane);
		
		root.validate();
		root.repaint();
	 }
	 
	}
	
	private void initExitItem() {
		// Action Event ó�� �޼ҵ� ���
		exitItem.addActionListener(this); // �ڽ�(ActionListenerŸ��)�� ȣ�� 
		exitItem.setToolTipText("���α׷� �ݱ�");
	} 

	public static void main(String[] args) {
		new SwingEx_07_ContentPane();
	}

}
