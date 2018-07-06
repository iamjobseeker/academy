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

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField; 

public class Addschedule_Null extends JFrame { 
	
	// ���� ������ ���̰�
	// �޸� ��� �߰��ϱ� 

	// ���� �г�
	private JPanel pane = new JPanel();

	private Addschedule_Null() { // ������
		
		setTitle("���� ���"); // Ÿ��Ʋ 
		setBounds(650, 50, 580, 650); // ũ�� �� ��ġ
		setDefaultCloseOperation(EXIT_ON_CLOSE); // ������ ���� 
		
		Container root = getContentPane();

		// ----- ������ ���� ----- 
		setResizable(false); // ũ�� ���� �Ұ��� 
		pane.setLayout(null); // �� ���̾ƿ� 
//		pane.setBackground(new Color(255, 245, 238)); 

		// ----- ��ü ���� -----
		JLabel title = new JLabel("���� ���");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("����", Font.BOLD, 15));
		title.setText("���� ���");
		pane.add(title); 
		
		// ----- ���� ����ϱ� (������ �Է�) -----
		JTextField name = new JTextField();
		name.setBounds(20, 100, 500, 40); // ��ġ ���� 
//		name.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ���� 

		// place holder
		name.setText("������"); // �ʱ� �ؽ�Ʈ 
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

		pane.add(name);

		// ----- ���� �������� ����ϱ� -----
		JTextField start = new JTextField();
		
		start.setBounds(20, 180, 500, 40); // ��ġ ����
//		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
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
		
		pane.add(start); 

		// -------------------------------------------

		// ----- ���� �������� ����ϱ� -----
		JTextField end = new JTextField();

		end.setBounds(20, 260, 500, 40); // ��ġ ����
//		end.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
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

		pane.add(end); 

		// ----- ����� �����ϱ� -----
		// ����� �����ϱ� �ؽ�Ʈ
		JTextField share = new JTextField("����� ����");

		share.setBounds(20, 340, 350, 40); 
//		share.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		share.setBackground(Color.WHITE); 

		// ���� ���λ��� ����( ) 

		share.setEditable(false); 
		

		// ����� �����ϱ� ��ư 
		JCheckBox share2 = new JCheckBox("�����ϱ�"); 
		
		share2.setBounds(400, 340, 80, 40); 
//		share2.setForeground(new Color(255, 182, 193));
		share2.setSelected(true); 
	
		pane.add(share);
		pane.add(share2);

		// ----- ����Ϸ� ���� ���� -----
		// ����Ϸ� ���� �ؽ�Ʈ
		JTextField anny = new JTextField("����Ϸ� ����");

		anny.setBounds(20, 420, 350, 40); 
//		anny.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		anny.setBackground(Color.WHITE); 

		// ���� ���λ��� ����( ) 
		anny.setEditable(false); 
		
		// ����Ϸ� ���� ��ư
		JCheckBox anny2 = new JCheckBox("����� ����");
		
		anny2.setBounds(400, 420, 100, 40);
//		anny2.setForeground(new Color(255, 182, 193));
		
		pane.add(anny);
		pane.add(anny2); 

		// -------------------------------------------

		// --- ���� ����ϱ� ��ư ---
		JButton okbut = new JButton("���");
		okbut.setBounds(150, 530, 100, 50);
		pane.add(okbut);

		// --- ���� ��� ����ϱ�(â �ݱ�) ��ư ---
		JButton nobut = new JButton("���");
		nobut.setBounds(350, 530, 100, 50); 
		pane.add(nobut); 
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// --- ��� ��� ��ȭ���� ---
				JFrame c_frame = new JFrame("Ȯ��â");
				c_frame.setBounds(1200, 50, 250, 200); 
				
				// ���̺� 
				JLabel c_lbl = new JLabel("���� ����� ����Ͻðڽ��ϱ�?"); 
				c_lbl.setBounds(30, 30, 200, 50); 
				 
				// Ȯ�� �� ��� ��ư
				JButton c_okbut = new JButton("Ȯ��");
				c_okbut.setBounds(30, 90, 70, 40);
				JButton c_nobut = new JButton("���");
				c_nobut.setBounds(140, 90, 70, 40);
				
				JPanel c_pane = new JPanel();
				c_pane.setLayout(null);
				
				c_pane.add(c_lbl); 
				c_pane.add(c_okbut);
				c_pane.add(c_nobut); 
				
				c_frame.add(c_pane); 
				
				
				c_frame.setVisible(true);
				

				
				c_nobut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c_frame.dispose();
					}
				});
				
				c_okbut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0); 
					}
				});
		
			}
		});

		root.add(pane); 
		
		setVisible(true);

		okbut.requestFocus(); // ��ư�� ��Ŀ�� ȹ�� 
	} 


	public static void main(String[] args) {

		new Addschedule_Null(); 
	}



}