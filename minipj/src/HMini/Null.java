package HMini;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Null extends JFrame {  

	// ���� �г�
	private JPanel pane = new JPanel();
	private Container root;

	// �� ���̺� �� ��ư
	private JLabel title;  // ���� ���̺�
	private JTextField name;  // ������
	private JTextField date;
	private JComboBox<String> share;
	private JComboBox<String> anny;
	private JButton okbut;
	private JButton nobut;

	// �� ��üȭ
	private CalendarView cv; 
	// �� �߰�
	private String username = "�켺";
	private String todo; 
	String txtDate;
	private String[] txtArray;
	
	public String getTxtDate() {
		return txtDate;
	}
	
	public String[] initOkbut() {
		// --- ���� ����ϱ� ��ư --- 
		okbut = new JButton("���");
		okbut.setBounds(150, 530, 100, 50);
		okbut.setBackground(new Color(255, 240, 245));
		okbut.setBorderPainted(false);
		okbut.setFocusPainted(false);
		okbut.setForeground(Color.gray);
		
		okbut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// �� ���� ���� 
				try {
					String txtName = name.getText();
					String txtShare = (String) share.getSelectedItem();
					String txtAnny = (String) anny.getSelectedItem();
					txtDate=getTxtDate();
					txtArray=new String[4];
					txtArray[0]=txtDate;
					txtArray[1]=txtName;
					txtArray[2]=txtShare;
					txtArray[3]=txtAnny; 
					String path = "./src/HMini/memo";
					File file = new File(path);
					FileWriter writer = new FileWriter(file, true); 
					writer.write(txtArray[0]); // �׽�Ʈ��
//					writer.write(txtDate+"\t"
//							+ txtName+"\t"
//							+ txtShare+"\t"
//							+ txtAnny+"\n" );
					writer.flush();
					writer.close(); 
					new Ok();
				} catch (Exception e) {
				}

				// �����ϱ�
				dispose();
			}
		});
		
		pane.add(okbut);
		return txtArray;
		
		}

	public Null(String str) { // ������ 

		txtDate=str;
	
		setTitle("���� ���"); // Ÿ��Ʋ 
		setBounds(650, 50, 450, 650); // ũ�� �� ��ġ
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // ����

		// ----- ������ ���� ----- 
		setResizable(false); // ũ�� ���� �Ұ��� 
		pane.setLayout(null); // �� ���̾ƿ�  
		//		pane.setBackground(new Color(255, 245, 238)); 

		// ----- ��ü ���� -----
		title = new JLabel("���� ���");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("����", Font.BOLD, 15));  
		title.setText("���� ���");
		pane.add(title); 

		// ----- ���� ����ϱ� (������ �Է�) -----
		name = new JTextField();
		name.setBounds(20, 100, 350, 40); // ��ġ ���� 
		name.setBorder(null); // �ܰ��� ���� 
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

		// �� ���� ��¥ �޾ƿ��� 
		JTextField date = new JTextField(txtDate);
		date.setBounds(20, 200, 350, 40);
		date.setBackground(Color.white);
		date.setBorder(null);
		date.setEditable(false);
		pane.add(date);

		// ----- ����� �����ϱ� -----
		// ����� �����ϱ� �ؽ�Ʈ
		String select[]= {"����� ����", "�������� �ʱ�"};
		share = new JComboBox<String>(select);
		share.setBounds(20, 340, 350, 40); 
		share.setEditable(false); 

		pane.add(share);

		// --- ����� ����  ---
		String select2[]= {"����� �������� ����", "����� ����"};
		anny = new JComboBox<String>(select2);
		anny.setBounds(20, 430, 350, 40); 
		anny.setEditable(false); 

		pane.add(anny);

		// --- ���� ��� ����ϱ�(â �ݱ�) ��ư ---
		nobut = new JButton("���");
		nobut.setBounds(350, 530, 100, 50); 
		nobut.setBackground(new Color(255, 240, 245));
		nobut.setBorderPainted(false);
		nobut.setFocusPainted(false);
		nobut.setForeground(Color.gray);
		pane.add(nobut); 

		root=getContentPane();
		add(pane);
		initOkbut();
		setVisible(true);
		okbut.requestFocus(); 
	}
	
//	
//	public static void main(String[] args) {
//		new Null();
//		
//	}
	
}