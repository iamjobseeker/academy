package mini;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; 

public class Addschedule_Null extends JFrame { 
	// ���� ������
	private Container root; 
	private Date focusDate;
	// ���� �г� 
	private JPanel pane = new JPanel();
	// ���� �г� 
	private JLabel title; // ���� ���̺�  
	// ���� �г�
	private JTextField name; // ������ �ؽ�Ʈ�ʵ�
	private JTextField start; // �������� �ؽ�Ʈ�ʵ�
	private JTextField end; // ���� ���� �ؽ�Ʈ�ʵ�
	private JTextField share; // ���� ���� �ؽ�Ʈ�ʵ�
	private JTextField anny; // ��������� �ؽ�Ʈ�ʵ� 
	// ��ư �г� 
	private JButton okbut; // ��� ��ư
	private JButton nobut; // ��� ��ư  
//	private int focusDate;

	Addschedule_Null( ) { // ������

		setTitle("���� �߰�"); // Ÿ��Ʋ 
		setBounds(650, 50, 400, 650); // ũ�� �� ��ġ
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // ������ ���� 
		
		root = getContentPane();

		setResizable(false);
		pane.setLayout(null); // �� ���̾ƿ� 
		//		pane.setBackground(new Color(255, 245, 238));  

		initTitlePanel(); // ���� �г�
		initCalndPanel(); // ���� �г�
		initButPanel(); // ��ư �г�  

	} // ������ 

	private void initTitlePanel() {

		// ----- ��ü ���� -----
		title = new JLabel("���� ���");
		title.setBounds(0, 40, 400, 20); 
		title.setFont(new Font("����", Font.BOLD, 15));
		title.setText("���� ���");
		title.setHorizontalAlignment(SwingConstants.CENTER); 
		pane.add(title); 

		// ----- ���� ����ϱ� (������ �Է�) -----
		name = new JTextField();
		name.setBounds(20, 100, 350, 50); // ��ġ ���� 
		//		name.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ���� 

		// place holder
		name.setText("������"); // �ʱ� �ؽ�Ʈ 
		name.setForeground(Color.GRAY); 
		name.setBorder(null);

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

	}

	private void initCalndPanel() {

		// ----- ���� �������� ����ϱ� -----
		start = new JTextField();
		start.setEditable(false);
		start.setBounds(20, 180, 150, 50); // ��ġ ����
		//		start.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		start.setText("����");
		start.setBorder(null);
		start.setBackground(Color.white);

		pane.add(start); 

		// ---- ���� ���۳�¥ �����ϱ� ----
		//		Date now = new Date(); // ������ ��¥ �� �ð� ���� 
		Calendar calendar = Calendar.getInstance(); // Ķ���� ��ü ���
		Date value = calendar.getTime(); // ���� �ð� ���
	
		calendar.add(Calendar.YEAR, -50); // 50�� ���� ��¥ ���
		Date date_minus = calendar.getTime(); //50�� ���� ��¥�� �ּ� ��¥�� ����

		calendar.add(Calendar.YEAR, +50); // 50�� ���� ��¥ ��� +50�ϸ� ���糯¥����.
		Date date_plus = calendar.getTime(); //50�� ���� ��¥�� �ִ� ��¥�� ����

		final SpinnerDateModel model = new SpinnerDateModel(value, date_minus, date_plus, Calendar.DAY_OF_WEEK); // ���ǳ� ��¥ ���� 
		JSpinner spinner = new JSpinner(model); 
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		spinner.setSize(200, 50);
		spinner.setLocation(170, 180); 
		spinner.setBorder(null);

		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
		JFormattedTextField ftf = editor.getTextField();
		ftf.setEditable(false); // ��¥ �������� �Ұ�  
		ftf.setHorizontalAlignment(JTextField.CENTER);

		ftf.setBackground(new Color(255, 255, 255)); 
		spinner.setEditor(editor); 
		spinner.addChangeListener(new ChangeListener() { // ��ȭ�̺�Ʈ ������
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t" 
							+ "next = " + df.format(next));
			}
		}); 

		pane.add(spinner);
		// -------------------------------------------

		// ----- ���� �������� ����ϱ� -----
		end = new JTextField();
		end.setEditable(false);

		end.setBounds(20, 260, 150, 50); // ��ġ ����
		//		end.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		end.setText("����	");
		end.setBorder(null);
		end.setBackground(Color.white);

		pane.add(end); 

		// --- ���� ���ᳯ¥ �����ϱ� ---  
		final SpinnerDateModel model2 = new SpinnerDateModel(value, date_minus, date_plus, Calendar.DAY_OF_WEEK); // ���ǳ� ��¥ ���� 
		JSpinner spinner2 = new JSpinner(model2); 
		spinner2.setSize(200, 50);
		spinner2.setLocation(170, 260); 
		spinner2.setBorder(null);

		JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinner2,"yyyy-MM-dd");
		JFormattedTextField ftf2 = editor2.getTextField(); 
		ftf2.setEditable(false); // ��¥ �������� �Ұ�  
		ftf2.setHorizontalAlignment(JTextField.CENTER);

		ftf2.setBackground(new Color(255, 255, 255)); 
		spinner2.setEditor(editor2); 
		spinner2.addChangeListener(new ChangeListener() { // ��ȭ�̺�Ʈ ������
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t" 
							+ "next = " + df.format(next));
			}
		}); 

		pane.add(spinner2);

		// ----- ����� �����ϱ� -----
		// ����� �����ϱ� �ؽ�Ʈ
		share = new JTextField("����� ����");

		share.setBounds(20, 340, 350, 50); 
		//		share.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		share.setBackground(Color.WHITE); 
		share.setBorder(null);

		share.setEditable(false); 


		// ����� �����ϱ� ��ư 
		JCheckBox share2 = new JCheckBox("�����ϱ�"); 

		share2.setBounds(400, 340, 80, 50); 
		//		share2.setForeground(new Color(255, 182, 193));
		share2.setSelected(true); 

		pane.add(share);
		pane.add(share2);

		// ----- ����Ϸ� ���� ���� -----
		// ����Ϸ� ���� �ؽ�Ʈ
		anny = new JTextField("����Ϸ� ����");

		anny.setBounds(20, 420, 350, 50); 
		//		anny.setFont(new Font("����", Font.PLAIN, 15)); // ��Ʈ ����
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);

		// ���� ���λ��� ����( ) 
		anny.setEditable(false); 

		// ����Ϸ� ���� ��ư
		JCheckBox anny2 = new JCheckBox("����� ����");

		anny2.setBounds(400, 420, 100, 50);
		//		anny2.setForeground(new Color(255, 182, 193));

		pane.add(anny);
		pane.add(anny2); 

		// -------------------------------------------
	}

	private void initButPanel() {

		// --- ���� ����ϱ� ��ư ---
		okbut = new JButton("���");
		okbut.setBounds(50, 530, 100, 50);
		okbut.setBorder(null);
		okbut.setBackground(Color.white);
		pane.add(okbut);

		// --- ���� ��� ����ϱ�(â �ݱ�) ��ư ---
		nobut = new JButton("���");
		nobut.setBounds(250, 530, 100, 50); 
		nobut.setBorder(null); 
		nobut.setBackground(Color.WHITE); 
		pane.add(nobut); 
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CancelConfirm(); 
			}
		});

//		nobut.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// --- ��� ��� ��ȭ���� ---
//				JFrame c_frame = new JFrame("Ȯ��â");
//				c_frame.setBounds(1200, 50, 250, 200); 
//
//				// ���̺� 
//				JLabel c_lbl = new JLabel("���� ����� ����Ͻðڽ��ϱ�?"); 
//				c_lbl.setBounds(30, 30, 200, 50); 
//
//				// Ȯ�� �� ��� ��ư
//				JButton c_okbut = new JButton("Ȯ��");
//				c_okbut.setBounds(30, 90, 70, 40);
//				JButton c_nobut = new JButton("���");
//				c_nobut.setBounds(140, 90, 70, 40);
//
//				JPanel c_pane = new JPanel();
//				c_pane.setLayout(null);
//
//				c_pane.add(c_lbl); 
//				c_pane.add(c_okbut);
//				c_pane.add(c_nobut); 
//
//				c_frame.getContentPane().add(c_pane); 
//				c_frame.setVisible(true);
//
//				c_nobut.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						c_frame.dispose();
//					}
//				});
//
//				c_okbut.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						dispose();
//						c_frame.dispose(); 
//					}
//				});
//
//			}
//		});


		root.add(pane); 

		setVisible(true);

		okbut.requestFocus(); // ��ư�� ��Ŀ�� ȹ�� 

	} 
	
//	public static void main(String[] args) {
//		new Addschedule_Null();
//	}

}