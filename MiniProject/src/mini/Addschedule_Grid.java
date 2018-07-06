package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Addschedule_Grid extends JFrame { 

	// ���� ������
	private Container root;
	// ���� �г�
	private JPanel titlepanel = new JPanel();
	// ���� �г�
	private JPanel schedpanel = new JPanel();
	// ��ư �г� 
	private JPanel butpanel = new JPanel();
	// �޿����� �г�
	private JPanel leftpanel = new JPanel();
	private JPanel rightpanel = new JPanel();

	private Addschedule_Grid() { // ������
		
		setTitle("���� ���"); // Ÿ��Ʋ 
		setBounds(650, 50, 580, 650); // ũ�� �� ��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ���� 
		root = getContentPane();

		// ----- ������ ���� ----- 
		schedpanel.setLayout(new GridLayout(5,0, 30, 40)); 
//		schedpanel.setBackground(new Color(255, 245, 238));
		butpanel.setLayout(new GridLayout(0, 2));
		
		root.setLayout(new BorderLayout(20, 20)); 
		root.add(titlepanel, BorderLayout.NORTH);
		root.add(schedpanel, BorderLayout.CENTER); 
		root.add(butpanel, BorderLayout.SOUTH); 
		root.add(leftpanel, BorderLayout.WEST);
		root.add(rightpanel, BorderLayout.EAST); 

		// --- ��ü ���� ---
		JLabel top = new JLabel("");
		JLabel title = new JLabel("���� ���");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("����", Font.BOLD, 20));
		title.setText("���� ���"); 
	
		titlepanel.setLayout(new GridLayout(2, 0));
		titlepanel.add(top);
		titlepanel.add(title); 
		
		// ----- ���� ����ϱ� (������ �Է�) -----
		JTextField name = new JTextField("������", 50);
		name.setColumns(5); 
//		name.setBounds(20, 100, 500, 5); // ��ġ ���� 
		name.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ���� 

		// place holder
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
					name.setForeground(Color.BLACK); 
				}
			}
		});

		schedpanel.add(name);

		// ----- ���� �������� ����ϱ� -----
		JTextField start = new JTextField();
		
		start.setBounds(20, 200, 500, 40); // ��ġ ����
		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		start.setText("����				2018.7.10  ���� 1:00"); // �ʱ� �ؽ�Ʈ
		start.setForeground(Color.GRAY);

		start.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if(start.getText().isEmpty()) {
					start.setText("����				2018.7.10  ���� 1:00");
					start.setForeground(Color.GRAY);
				} // ��Ŀ���� �Ұ� �ؽ�Ʈ�� ��������� �ʱ� �ؽ�Ʈ ����
			}

			@Override
			public void focusGained(FocusEvent e) {
				if(start.getText().equals("����				2018.7.10  ���� 1:00")) {
					start.setText("");
					start.setForeground(Color.black);
				} // ��Ŀ���� ������ ��Ʈ �÷� ������ ���� 
			}

		});

		// ��¥ or �ð� �κ� Ŭ���ϸ� 

		// Ű���� �Է����� ���� �����ϵ��� �ϱ� 
		
		schedpanel.add(start); 

		// -------------------------------------------

		// ----- ���� �������� ����ϱ� -----
		JTextField end = new JTextField();

		end.setBounds(20, 300, 500, 40); // ��ġ ����
		end.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		end.setText("����						  ���� 2:00"); // �ʱ� �ؽ�Ʈ
		end.setForeground(Color.GRAY);

		end.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if(end.getText().isEmpty()) {
					end.setText("����						  ���� 2:00");
					end.setForeground(Color.GRAY);
				} // ��Ŀ���� �Ұ� �ؽ�Ʈ�� ��������� �ʱ� �ؽ�Ʈ ����
			}

			@Override
			public void focusGained(FocusEvent e) {
				if(end.getText().equals("����						  ���� 2:00")) {
					end.setText("");
					end.setForeground(Color.black);
				} // ��Ŀ���� ������ ��Ʈ �÷� ������ ���� 
			}

		});

		schedpanel.add(end); 

		// ----- ����� �����ϱ� -----
		// ����� �����ϱ� �ؽ�Ʈ
		JTextField share = new JTextField("����� ����");

		share.setBounds(20, 400, 350, 40); 
		share.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		share.setBackground(Color.WHITE); 

		// ���� ���λ��� ����( ) 

		share.setEditable(false); 
		schedpanel.add(share);

		// ����� �����ϱ� ��ư 

		// ----- ����Ϸ� ���� ���� -----
		JTextField anny = new JTextField("����Ϸ� ����");

		anny.setBounds(20, 500, 350, 40); 
		anny.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		anny.setBackground(Color.WHITE); 

		// ���� ���λ��� ����( ) 
		anny.setEditable(false); 
		schedpanel.add(anny);

		// -------------------------------------------

		// --- ���� ����ϱ� ��ư ---
		JButton okbut = new JButton("���");
		okbut.setPreferredSize(new Dimension(100, 50)); 
		butpanel.add(okbut);

		// --- ���� ��� ����ϱ�(â �ݱ�) ��ư ---
		JButton cancelbut = new JButton("���"); 
		cancelbut.setPreferredSize(new Dimension(100, 50));
		butpanel.add(cancelbut); 
		
		JLabel bottom = new JLabel("");
		butpanel.setLayout(new GridLayout(2, 0));
		butpanel.add(bottom, BorderLayout.SOUTH); 

		// --- ��� ��� ��ȭ���� ---
		

		// ------------------------------
		
		setVisible(true);

		okbut.requestFocus(); // ��ư�� ��Ŀ�� ȹ�� 

	} 


	public static void main(String[] args) {

		new Addschedule_Grid(); 
	}



}