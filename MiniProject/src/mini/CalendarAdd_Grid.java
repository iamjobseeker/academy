package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;  


public class CalendarAdd_Grid extends JFrame { 
	// ���� 
	private Container root; 
	// ���� �г�
	private JPanel titlePanel;
	private JLabel top; // ��ġ ������ ���̺�
	private JLabel title; // ���� ���̺�  
	private String[] split;
	// ���� �г�
	private JPanel calndPanel; 
	private JTextField name; // ������ �ؽ�Ʈ�ʵ�

	private JScrollPane hourScroll;
	private JList<String> hourList; 
	
	private JTextField memo; // ª�� �޸� 

	private JComboBox<String> share; 
	private JComboBox<String> anny;
	// ��ư �г�  
	private JPanel butpanel;
	private JLabel left; // ��ġ ������ ���̺�
	private JLabel right; // ��ġ ������ ���̺�
	private JLabel bottom; // ��ġ ������ ���̺� 
	public JButton okbut ; // ��� ��ư
	private JButton nobut; // ��� ��ư 
	// �޿����� �г�
	private JLabel leftlabel; 
	private JLabel rightlabel;
	// ��¥ �޾ƿ���
	private String startTxt; // start�� �� ��¥�ؽ�Ʈ
	private String year;  // �⺻�� ���� 
	private String month;
	private String day; 
	
	JDialog dialog = new ConfirmDialog(this, "����� ���̾�α�", true, getX()+50, getY()+50);
	
	public CalendarAdd_Grid(String str) {
		if(str=="exit") {
			dispose();
		} else {
		this.startTxt = str;
		
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
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
		
		setVisible(true); 
		okbut.requestFocus(); // ��ư�� ��Ŀ�� ȹ�� 
		}
	} // ������ �� 
	
	public void Exit(int num) {
		if(num==999) { 
			dispose();
			System.out.println("����"); // ����� 
		} 
	}
	
	private void initTitlePanel() { // ���� �г� ����
		titlePanel = new JPanel(new GridLayout(2, 0));

		split = startTxt.split("-");
		year = split[0];
		month = split[1]; 
		day = split[2]; 

		top = new JLabel(""); // ��ġ ������ ���̺�
		title = new JLabel(year+"�� "+month+"�� "+day+"���� �������"); // ���� ���̺� 
		title.setFont(new Font("����", Font.BOLD, 17));
		title.setHorizontalAlignment(SwingConstants.CENTER);

		titlePanel.add(top); 
		titlePanel.add(title); 
	} // ���� �г� ��
	
	private void initCalndPanel() { // ���� �г� ����
		calndPanel = new JPanel(new GridLayout(5, 0, 30, 60)); 

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

		// ----- �ð� -----
		String[] hourArray = {"AM 12:00", "AM 12:30", "AM 1:00", "AM 1:30", "AM 2:00", "AM 2:30", "AM 3:00", "AM 3:30", "AM 4:00",
				"AM 4:30"};
		// ��, �Ʒ� �ð��� ���̵��� �ϱ� 
		hourScroll = new JScrollPane();
		hourList=new JList<>(hourArray);
		hourScroll.setViewportView(hourList);
		calndPanel.add(hourScroll); 
		
		// ----- �޸� -----
		memo = new JTextField("�޸�");
		memo.setBorder(null);
		memo.setForeground(Color.GRAY);
		
		memo.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(memo.getText().isEmpty()) {
					memo.setText("�޸�");
					memo.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(memo.getText().equals("�޸�")) {
					memo.setText("");
				} memo.setForeground(Color.black);
			}
		});
		
		calndPanel.add(memo);
		
		// ----- ��¥ -----
//		start = new JTextField(startTxt);
//		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
//		start.setPreferredSize(new Dimension(50, 100));
//		start.setBorder(null); 
//		start.setBackground(Color.white);
//		start.setEditable(false);
//
//		calndPanel.add(start); 

		// ----- ����Ϸ� ����  -----
		String annyTxt[]= {"������", "�����"};
		anny = new JComboBox<String>(annyTxt);
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);
		anny.setEditable(false); 
		calndPanel.add(anny); 
		
		// ----- ����� �����ϱ� -----
		String shareTxt[]= {"����� ����", "�������� �ʱ�"};
		share = new JComboBox<String>(shareTxt);
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 
		calndPanel.add(share);
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
				// �� ���� ���� 
				try {
					if(name.getText().equals("������")) {
						new No(); // ������ �Է����� ������ ������ ���� ���� 
					} else {
					String[] txtArray=new String[5];
					txtArray[0]=(String)anny.getSelectedItem();
					txtArray[1]=(String)hourList.getSelectedValue();
					txtArray[2]=(String)name.getText();
					txtArray[3]=(String)memo.getText();
					txtArray[4]=(String)startTxt;
					String path = "./src/mini/todo";
					File file = new File(path);
					FileWriter writer = new FileWriter(file, true); 
					writer.write(txtArray[0]+"\t" 
							+ txtArray[1]+"\t"
							+ txtArray[2]+"\t"
					 		+ txtArray[3]+"\t" 
					 		+ txtArray[4]+"\n"); // ���Ͽ� ���� 
					writer.flush();
					writer.close(); 
					dispose();
					new Ok(); 
					} 
				} catch (Exception e2) {
				} 
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
//				JOptionPane.showMessageDialog(null, "test", "�׽�Ʈ", JOptionPane.QUESTION_MESSAGE);
				Confirm con = new Confirm();
				
//				if(con.Press()==999) {
//					System.out.println("999����");
//					dispose(); 
//					}
			}
		});

		bottom = new JLabel("");
		butpanel.add(bottom, BorderLayout.SOUTH); 
	}
	
//	public static void main(String[] args) {
//
//		new CalendarAdd_Grid("2018-7-16"); 
//	}

}