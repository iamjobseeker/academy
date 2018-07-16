package HMini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class CalendarDataManager { // 6*7�迭�� ��Ÿ�� �޷� ���� ���ϴ� class
	static final int CAL_WIDTH = 7;
	static final int CAL_HEIGHT = 6;
	int calDates[][] = new int[CAL_HEIGHT][CAL_WIDTH];
	int calYear;
	int calMonth;
	int calDayOfMon;
	final int calLastDateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �� ���� ������ �� �迭
	int calLastDate;
	Calendar today = Calendar.getInstance();// ������ ���� ����
	Calendar cal; // calendar ��ü

	public CalendarDataManager() { // ������
		setToday();
	}

	public void setToday() { // ������ ���� �ҷ����� & ������ ����
		calYear = today.get(Calendar.YEAR);
		calMonth = today.get(Calendar.MONTH);
		calDayOfMon = today.get(Calendar.DAY_OF_MONTH);
		makeCalData(today);
	}

	private void makeCalData(Calendar cal) {// �޷��� �ʱ�ȭ�� ��¥ �Է� -> 1���� ��ġ�� ������ ��¥�� ����
		int calStartingPos = (cal.get(Calendar.DAY_OF_WEEK) + 7 - (cal.get(Calendar.DAY_OF_MONTH)) % 7) % 7;
		if (calMonth == 1)
			calLastDate = calLastDateOfMonth[calMonth] + leapCheck(calYear);// 2���� ��� ������ üũ�Ͽ� 1���� ������
		else
			calLastDate = calLastDateOfMonth[calMonth]; // 2���� �ƴ� ��� �迭���� ���� �ҷ��� ����
		// �޷� �迭 �ʱ�ȭ
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				calDates[i][j] = 0;
			}
		}
		// �޷� �迭�� �� ä���ֱ�
		for (int i = 0, num = 1, k = 0; i < CAL_HEIGHT; i++) {
			if (i == 0)
				k = calStartingPos;
			else
				k = 0; // k�� �� ���� �����ϴ� ��¥�̰� ù�ְ� �ƴϸ� �Ͽ��Ϻ��� �迭�� ä���ִ´�. num++�� ������Ű�� ��¥�� �Է��ϰ�,���������� �Է�����
			// �ݺ����� �����Ѵ�.
			for (int j = k; j < CAL_WIDTH; j++) {
				if (num <= calLastDate)
					calDates[i][j] = num++;
			}
		}
	}

	private int leapCheck(int year) { // �������� Ȯ���ϴ� �Լ�
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return 1;// ������ ��� 1�� �����Ͽ� 2���� ��������¥�� �����ش�.
		else
			return 0;
	}

	public void moveMonth(int mon) { // ����޷� ���� n�� ���ĸ� �޾� �޷� �迭�� ����� �Լ�(1���� +12, -12�޷� �̵� ����)
		calMonth += mon;
		if (calMonth > 11)
			while (calMonth > 11) {
				calYear++;
				calMonth -= 12;
			}
		else if (calMonth < 0)
			while (calMonth < 0) {
				calYear--;
				calMonth += 12;
			}
		cal = new GregorianCalendar(calYear, calMonth, calDayOfMon);
		makeCalData(cal);
	}
}
//----------------------------------------------------------------
public class CalendarExercise extends CalendarDataManager implements ActionListener {

	// --���� ������
	private JFrame frame;
	private JPanel upPanel;
	private JPanel downPanel; 
	private Container root;
	// --�� / �� �г�
	private JPanel datePanel;
	private JLabel label;
	private JLabel label2; 
	private JLabel label3;
	private JLabel dateLab;
	private JButton addbut;	 // ���� �߰� ��ư	
	// --��ư �г�
	private JPanel butPanel;
	private JButton nMonBut;
	private JButton lMonBut;
	private JButton nYeaBut;
	private JButton lYeaBut;
	private ListenMoveMonth lMoveMonth = new ListenMoveMonth();
	// --�޷� �г� 
	private JPanel calPanel; 
	private JButton weekDaysName[];
	private JButton dateButs[][] = new JButton[6][7]; 
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" }; 
	private JButton prev_click; 
	// --���� �г�
	private JPanel schedPanel;
	private JTextField[] tfArray;
	JScrollPane scroll;
	// --�׼Ǹ����� ����
	private JButton clickBut;
	
	public CalendarExercise() { // ������ 

		frame = new JFrame("Calendar Example");// Ÿ��Ʋ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �ݱ� ��ư �⺻ ����
		frame.setBounds(300, 10, 700, 850); // �⺻ ũ��, ��ġ ����
		frame.getContentPane().setLayout(new FlowLayout());
		root = frame.getContentPane();

		initLabPane(); // ���̺� �г�
		initCalPane();// �޷� �г�
		initButPane();// ��ư �г�
		initschedPane(); // ���� �г� 
		ReadFile(); // ���� �ҷ����� 
 
		// Frame ����
		upPanel = new JPanel(new BorderLayout());
		upPanel.setPreferredSize(new Dimension(700, 400));
		downPanel = new JPanel(new BorderLayout());
		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

		upPanel.add(datePanel, BorderLayout.NORTH); 
		upPanel.add(calPanel, BorderLayout.CENTER);
		upPanel.add(butPanel, BorderLayout.SOUTH); 
		downPanel.add(schedPanel, BorderLayout.CENTER);
		root.add(upPanel);
		root.add(downPanel);
		
		showCal(); // �޷��� ǥ��

		frame.setVisible(true);
	}

	private void initschedPane() { // ���� �г� ����
		schedPanel = new JPanel();
		schedPanel.setPreferredSize(new Dimension(670, 260));
		schedPanel.setLayout(new GridLayout(5, 0, 10, 2));
		// ��¥ �����ִ� ���̺� 
		tfArray=new JTextField[5];
		tfArray[0] = new JTextField("���� ����"); 
		tfArray[1] = new JTextField();
		tfArray[2] = new JTextField();
		tfArray[3] = new JTextField();
		tfArray[4] = new JTextField(); 
		
		for(JTextField field : tfArray) {
			field.setBorder(null); 
			schedPanel.add(field); 
		}
	}

	private void initCalPane(){ // �޷� �г� ����
		// ���� �κ� ���� 
		calPanel=new JPanel(); 

		weekDaysName = new JButton[7]; 
		for (int i = 0; i < CAL_WIDTH; i++) {
			weekDaysName[i] = new JButton(WEEK_DAY_NAME[i]);
			weekDaysName[i].setBorderPainted(false);
			weekDaysName[i].setContentAreaFilled(false);
			weekDaysName[i].setForeground(Color.WHITE);
			if (i == 0)
				weekDaysName[i].setBackground(new Color(192, 192, 192));//�Ͽ���, silver
			else if (i == 6)
				weekDaysName[i].setBackground(new Color(192, 192, 192));//�����, silver
			else
				weekDaysName[i].setBackground(new Color(150, 150, 150));//����
			weekDaysName[i].setOpaque(true);
			weekDaysName[i].setFocusPainted(false);
			calPanel.add(weekDaysName[i]); 
		}
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				dateButs[i][j] = new JButton(); 
				dateButs[i][j].setBorderPainted(false);
				dateButs[i][j].setContentAreaFilled(false);
				dateButs[i][j].setBackground(Color.WHITE);
				dateButs[i][j].setOpaque(true);
				dateButs[i][j].addActionListener(this);
					
				// ��Ʈ ũ��
				calPanel.add(dateButs[i][j]);
			}
		} // �޷� ���� end
	}
	private void initLabPane() { // ���̺� �г� ����
		// --���̺��г� ���� �ҽ� 
		datePanel = new JPanel(); 
		datePanel.setPreferredSize(new Dimension(700, 50));
		datePanel.setLayout(new GridLayout(0, 5, 0, 0));
		label = new JLabel("");
		datePanel.add(label); 

		// ���� �߰� ��ư ���� 
		ImageIcon originicon = new ImageIcon("./src/HMini/add.png"); // ImageIcon��ü����
		Image originimg = originicon.getImage(); // ImageIcon���� Image�� ����
		Image changedimg = originimg.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Image ũ�� ����
		ImageIcon Icon = new ImageIcon(changedimg); 
		addbut = new JButton(Icon); // ������ �߰�  
		addbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��¥ �Ѱ��ֱ�
				int year = calYear;
				int month = calMonth+1; 
				String day = clickBut.getText(); 
				String txt = year + "-" + month + "-" + day;
				System.out.println(txt); // Ŭ�� ��¥ 
				new CalendarAdd_Grid(txt); 	
			}
		});
		addbut.setToolTipText("���� �߰��ϱ�"); 
		addbut.setSize(100, 50);
		addbut.setBorder(null);
		addbut.setContentAreaFilled(false); 

		label2=new JLabel(""); 
		datePanel.add(label2);
		dateLab = new JLabel(calYear + "�� " + (calMonth + 1) + "��"); 
		dateLab.setHorizontalAlignment(SwingConstants.CENTER);
		dateLab.setFont(new Font("����", Font.BOLD, 15));
		datePanel.add(dateLab); 
		label3=new JLabel("");
		datePanel.add(label3); 
		datePanel.add(addbut);
		//--���̺� �г� end
	} 

	private void initButPane() { //��ư �г� ���� 
		// --��ư �г� ���� �ҽ�
		butPanel = new JPanel();
		butPanel.setLayout(new FlowLayout());
		lYeaBut = new JButton("�۳�");
		lYeaBut.setBackground(Color.WHITE);
		lYeaBut.setBorderPainted(false);
		lYeaBut.addActionListener(lMoveMonth);
		butPanel.add(lYeaBut);
		lMonBut = new JButton("���� ��");
		lMonBut.addActionListener(lMoveMonth);
		lMonBut.setBackground(Color.WHITE);
		lMonBut.setBorderPainted(false);
		butPanel.add(lMonBut);
		nMonBut = new JButton("���� ��");
		nMonBut.setBackground(Color.white);
		nMonBut.setBorderPainted(false);
		nMonBut.addActionListener(lMoveMonth);
		butPanel.add(nMonBut);
		nYeaBut = new JButton("����");
		nYeaBut.setBackground(Color.WHITE); 
		nYeaBut.setBorderPainted(false);
		nYeaBut.addActionListener(lMoveMonth);
		butPanel.add(nYeaBut);
		// --��ư ���� end
	}

	private void showCal() {// �޷��� ������ (ȣ��ø��� calDate �迭�� �ʱ�ȭ�Ͽ� ���� ��¥�� ��
		JButton todayBut = null;
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) { 
				dateButs[i][j].setBackground(Color.white);
				dateButs[i][j].setText(Integer.toString(calDates[i][j]));
				dateButs[i][j].removeAll();

				if (calMonth == today.get(Calendar.MONTH) && calYear == today.get(Calendar.YEAR)
						&& calDates[i][j] == today.get(Calendar.DAY_OF_MONTH)) {
					dateButs[i][j].setToolTipText("Today"); 
					todayBut = dateButs[i][j]; 
					//todayBut.setForeground(new Color(255,000,000)); // ���ó�¥ ���ڻ���
					todayBut.setBackground(new Color(250, 240, 230)); // ���ó�¥ ������, ����
				}

				if (calDates[i][j] == 0)
					dateButs[i][j].setVisible(false);
				else
					dateButs[i][j].setVisible(true);
			}
		}
	}

	public static void main(String[] args) {
		new CalendarExercise(); 
	}

	private class ListenMoveMonth implements ActionListener {//��¥ �̵� �̺�Ʈ ó��
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == lMonBut) {
				moveMonth(-1);
			} else if (e.getSource() == nMonBut) {
				moveMonth(1);
			} else if (e.getSource() == lYeaBut) {
				moveMonth(-12);
			} else if (e.getSource() == nYeaBut) {
				moveMonth(12);
			}
			dateLab.setText("\t" + calYear + "�� "+ (calMonth + 1) + "��"); 
			showCal();
		}
	}
	
	public void ReadFile() {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/HMini/memo"));
			String line ="";
			while((line = in.readLine())!=null) {
				if(line.contains("2018-7-16")) {
					System.out.println(line); // �ش��ϴ� ���� �����ϱ�
					tfArray[0].setText(line); // Ŭ������ �� ���� �߰��ϱ� 
					// �޷¿� ���� ǥ�� �����ϱ�
				}
			} 
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��¥ Ŭ���� ���� ���� ó�� 
		clickBut = (JButton)e.getSource(); 
		clickBut.setForeground(Color.red); 
		if(prev_click != null) prev_click.setForeground(Color.BLACK); 
		prev_click=(JButton)e.getSource(); 
		String txt = calYear+"-"+(calMonth+1)+"-"+clickBut.getText();
//		System.out.println(txt);

		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/HMini/memo"));
			String line ="";
			while((line = in.readLine())!=null) { 
				if(line.contains(txt)) {
					tfArray[0].setText(line); // Ŭ������ �� ���� �߰��ϱ� 
					System.out.println(line); // �ش��ϴ� ���� �����ϱ� 
					// �޷¿� ���� ǥ�� �����ϱ� 
				} if(line.contains(txt)==false)
					tfArray[0].setText("��������"); // �������� ��¥ ó�� 
			} 
			in.close();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}  


}
