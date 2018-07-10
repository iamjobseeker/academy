package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants; 

public class CalendarAdd_Grid extends JFrame { 
	// ���� ������
	private Container root; 
	// ���� �г�
	private JPanel titlePanel;
	private JLabel top; // ��ġ ������ ���̺�
	private JLabel title; // ���� ���̺�  
	// ���� �г�
	private JPanel calndPanel; 
	private JTextField name; // ������ �ؽ�Ʈ�ʵ�
	private JTextField start; // �������� �ؽ�Ʈ�ʵ�
	private JTextField end; // ���� ���� �ؽ�Ʈ�ʵ�
	private JTextField share; // ���� ���� �ؽ�Ʈ�ʵ�
	private JTextField anny; // ��������� �ؽ�Ʈ�ʵ� 
	// ��ư �г� 
	private JPanel butpanel;
	private JLabel left; // ��ġ ������ ���̺�
	private JLabel right; // ��ġ ������ ���̺�
	private JLabel bottom; // ��ġ ������ ���̺� 
	private JButton okbut; // ��� ��ư
	private JButton nobut; // ��� ��ư 
	// �޿����� �г�
	private JLabel leftlabel;
	private JLabel rightlabel;

	protected CalendarAdd_Grid() { // ������ 

		setTitle("���� ���"); // Ÿ��Ʋ 
		setBounds(650, 50, 500, 600); // ũ�� �� ��ġ
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // ������ ���� 

		initTitlePanel(); // ���� �г�
		initCalndPanel(); // ���� �г�
		initButPanel(); // ��ư �г� 
		
		leftlabel=new JLabel();
		rightlabel = new JLabel();
		
		root = getContentPane();
		root.setLayout(new BorderLayout(20, 20)); 
		root.add(titlePanel, BorderLayout.NORTH); 
		root.add(calndPanel, BorderLayout.CENTER); 
		root.add(butpanel, BorderLayout.SOUTH); 
		root.add(leftlabel, BorderLayout.WEST);
		root.add(rightlabel, BorderLayout.EAST); 
		
		setVisible(true); 
		
		okbut.requestFocus(); // ��ư�� ��Ŀ�� ȹ�� 
		
	} // ������ ��

	private void initTitlePanel() { // ���� �г� ����

		titlePanel = new JPanel(new GridLayout(2, 0));

		top = new JLabel(""); // ��ġ ������ ���̺�
		title = new JLabel("���� ���"); // ���� ���̺� 
		title.setFont(new Font("����", Font.BOLD, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);

		titlePanel.add(top);
		titlePanel.add(title); 

	} // ���� �г� ��

	private void initCalndPanel() { // ���� �г� ����

		calndPanel = new JPanel(new GridLayout(5, 0, 30, 40)); 

		// ----- ���� ����ϱ� (������ �Է�) -----
		name = new JTextField("������", 50);
		name.setColumns(5); 
//		name.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ���� 
		name.setBorder(null);
		name.setForeground(Color.GRAY); 

		name.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// ��Ŀ���� �Ұ� �ؽ�Ʈ�� ��������� �ʱ� �ؽ�Ʈ ���� 
				if(name.getText().isEmpty()) {
					name.setText("������");
					name.setForeground(Color.gray);
				} 
			}

			@Override
			public void focusGained(FocusEvent e) { 
				// ��Ŀ���� ������ ��Ʈ �÷� ������ ���� 
				if(name.getText().equals("������")) { 
					name.setText("");
				} name.setForeground(Color.BLACK); 
			}
		});

		calndPanel.add(name); 

		// ----- ���� �������� ����ϱ� -----
		start = new JTextField("����");
//		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		start.setBorder(null); 
		start.setBackground(Color.white);
		start.setEditable(false);

		calndPanel.add(start); 

		// ��¥ or �ð� �κ� Ŭ���ϸ�  Ű���� �Է����� ���� �����ϵ��� �ϱ� 

		// ----- ���� �������� ����ϱ� -----
		end = new JTextField("����");
//		end.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		end.setBorder(null);
		end.setEditable(false);
		end.setBackground(Color.white);
		calndPanel.add(end); 

		// ----- ����� �����ϱ� -----
		// �����ϱ� �ؽ�Ʈ
		share = new JTextField("����� ����");
//		share.setFont(new Font(null, Font.BOLD, 12)); // ��Ʈ ����
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 

		calndPanel.add(share);

		// �����ϱ� ��ư 

		// ----- ����Ϸ� ���� ���� -----
		anny = new JTextField("����Ϸ� ����");
//		anny.setFont(new Font(null, Font.BOLD, 12)); // ��Ʈ ����
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);
		anny.setEditable(false); 
		calndPanel.add(anny); 
	}

	private void initButPanel() {

		butpanel = new JPanel();
		butpanel.setLayout(new GridLayout(0, 4, 30, 15));

		// --- ���� ����ϱ� ��ư ---
		left = new JLabel(); 
		okbut = new JButton("���"); 
		okbut.setBackground(Color.white);
		okbut.setBorderPainted(false);
		butpanel.add(left);
		butpanel.add(okbut);

		// --- ���� ��� ����ϱ� ��ư ---
		right = new JLabel();
		nobut = new JButton("���"); 
		nobut.setBackground(Color.white);
		nobut.setBorderPainted(false);
		butpanel.add(nobut); 
		butpanel.add(right);
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// CancelConfirm â ȣ��
			}
		});

		bottom = new JLabel("");
		butpanel.add(bottom, BorderLayout.SOUTH); 
		
	}
	
	
	public static void main(String[] args) {

		new CalendarAdd_Grid(); 
		
	}

}