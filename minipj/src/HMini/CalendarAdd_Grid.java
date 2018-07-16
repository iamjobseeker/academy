package HMini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants; 

public class CalendarAdd_Grid extends JFrame { 
	// ���� 
	private Container root; 
	// ���� �г�
	private JPanel titlePanel;
	private JLabel top; // ��ġ ������ ���̺�
	private JLabel title; // ���� ���̺�  
	// ���� �г�
	private JPanel calndPanel; 
	private JTextField name; // ������ �ؽ�Ʈ�ʵ�
	private JTextField start; // �������� �ؽ�Ʈ�ʵ�
	private String startTxt; // start�� �� ��¥�ؽ�Ʈ
	private JComboBox<String> share;
	private JComboBox<String> anny;
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
	
	public CalendarAdd_Grid(String str) {
		this.startTxt = str; // �޷¿��� ��¥ �޾ƿ���
		setTitle("���� ���"); // Ÿ��Ʋ 
		setBounds(650, 50, 500, 650); // ũ�� �� ��ġ
		
		initTitlePanel(); // ���� �г�
		initCalndPanel(); // ���� �г�
		initButPanel(); // ��ư �г� 
		
		leftlabel=new JLabel();
		rightlabel = new JLabel();
		
		root = getContentPane();
		root.setLayout(new BorderLayout(40, 60)); 
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
		calndPanel = new JPanel(new GridLayout(4, 0, 30, 60)); 

		// ----- ���� ����ϱ� (������ �Է�) -----
		name = new JTextField("������", 50);
		name.setColumns(5); 
		name.setPreferredSize(new Dimension(500, 50));
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

		// ----- ��¥ -----
		start = new JTextField(startTxt);
//		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		start.setPreferredSize(new Dimension(50, 100));
		start.setBorder(null); 
		start.setBackground(Color.white);
		start.setEditable(false);

		calndPanel.add(start); 

		// ----- ����� �����ϱ� -----
		String shareTxt[]= {"����� ����", "�������� �ʱ�"};
		share = new JComboBox<String>(shareTxt);
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 
		calndPanel.add(share);

		// ----- ����Ϸ� ����  -----
		String annyTxt[]= {"����", "�����"};
		anny = new JComboBox<String>(annyTxt);
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
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// �� ���� ���� 
				try {
					String[] txtArray=new String[4];
					txtArray[0]=start.getText();
					txtArray[1]=name.getText();
					txtArray[2]=(String) share.getSelectedItem();
					txtArray[3]=(String) anny.getSelectedItem(); 
					
					String path = "./src/HMini/memo";
					File file = new File(path);
					FileWriter writer = new FileWriter(file, true); 
					// ������ �� �Է½� "�������� �Է��ϼ���" â �߰� ���� ���� ���ϱ� 
					writer.write(txtArray[0]+"\t"
							+ txtArray[1]+"\t"
							+ txtArray[2]+"\t"
					 		+ txtArray[3]+"\n");
					writer.flush();
					writer.close(); 
					new Ok();
				} catch (Exception e2) {
				}

				// �����ϱ�
				dispose();
				
			}
		});
		butpanel.add(left);
		butpanel.add(okbut);
		okbut.requestFocus();
		

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
	
	
	
//	public static void main(String[] args) {
//
//		new CalendarAdd_Grid(); 
//		
//	}

}