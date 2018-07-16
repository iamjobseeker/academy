//package HMini;
//
//import java.awt.BorderLayout; 
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//class CalendarDataManager { // 6*7�迭�� ��Ÿ�� �޷� ���� ���ϴ� class 
//	static final int CAL_HEIGHT = 6; 
//	static final int CAL_WIDTH = 7; 
//	int calDates[][] = new int[CAL_HEIGHT][CAL_WIDTH]; // �迭
//	int calYear; // ��
//	int calMonth; // ��
//	int calDayOfMon; // ��
//	final int calLastDateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �� ���� ������ �� �迭
//	int calLastDate;
//	Calendar today = Calendar.getInstance();// ������ ���� ����
//	Calendar cal; // calendar ��ü 
//
//	public CalendarDataManager() { // ������ 
//		setToday();
//	}
//
//	public void setToday() { // ������ ���� �ҷ����� & ������ ���� 
//		calYear = today.get(Calendar.YEAR);
//		calMonth = today.get(Calendar.MONTH);
//		calDayOfMon = today.get(Calendar.DAY_OF_MONTH);
//		makeCalData(today); // ���� �Լ�? 
//	}
//
//	private void makeCalData(Calendar cal) {// �޷��� �ʱ�ȭ�� ��¥ �Է� -> 1���� ��ġ�� ������ ��¥�� ����
//		int calStartingPos = (cal.get(Calendar.DAY_OF_WEEK) + 7 - (cal.get(Calendar.DAY_OF_MONTH)) % 7) % 7;
//		if (calMonth == 1)
//			calLastDate = calLastDateOfMonth[calMonth] + leapCheck(calYear);// 2���� ��� ������ üũ�Ͽ� 1���� ������
//		else
//			calLastDate = calLastDateOfMonth[calMonth]; // 2���� �ƴ� ��� �迭���� ���� �ҷ��� ����
//		// �޷� �迭 �ʱ�ȭ
//		for (int i = 0; i < CAL_HEIGHT; i++) {
//			for (int j = 0; j < CAL_WIDTH; j++) {
//				calDates[i][j] = 0;
//			}
//		}
//		// �޷� �迭�� �� ä���ֱ�
//		for (int i = 0, num = 1, k = 0; i < CAL_HEIGHT; i++) {
//			if (i == 0)
//				k = calStartingPos;
//			else
//				k = 0; // k�� �� ���� �����ϴ� ��¥�̰� ù�ְ� �ƴϸ� �Ͽ��Ϻ��� �迭�� ä���ִ´�. num++�� ������Ű�� ��¥�� �Է��ϰ�,���������� �Է�����
//			// �ݺ����� �����Ѵ�.
//			for (int j = k; j < CAL_WIDTH; j++) {
//				if (num <= calLastDate)
//					calDates[i][j] = num++;
//			}
//		}
//	}
//
//	private int leapCheck(int year) { // �������� Ȯ���ϴ� �Լ�
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//			return 1;// ������ ��� 1�� �����Ͽ� 2���� ��������¥�� �����ش�.
//		else
//			return 0;
//	}
//
//	public void moveMonth(int mon) { // ����޷� ���� n�� ���ĸ� �޾� �޷� �迭�� ����� �Լ�(1���� +12, -12�޷� �̵� ����)
//		calMonth += mon;
//		if (calMonth > 11)
//			while (calMonth > 11) {
//				calYear++;
//				calMonth -= 12;
//			}
//		else if (calMonth < 0)
//			while (calMonth < 0) {
//				calYear--;
//				calMonth += 12;
//			}
//		cal = new GregorianCalendar(calYear, calMonth, calDayOfMon);
//		makeCalData(cal);
//	}
//}
////----------------------------------------------------------------
//public class CalendarView extends CalendarDataManager implements ActionListener {
//	// --���� ������
//	private JFrame frame;
//	private Container root;
//	// �� / �� �г�
//	private JPanel datePanel;
//	private JLabel dateLab;
//	// --��ư �г�
//	private JPanel butPanel;
//	private JButton nMonBut;
//	private JButton lMonBut;
//	private JButton nYeaBut;
//	private JButton lYeaBut;
//	private ListenMoveMonth lMoveMonth = new ListenMoveMonth();
//	// �� ����ʵ� ����
//	public JButton clickBut;
//	public int year;
//	public int month;
//	public String day;
//	private JLabel iljung;
//	private String todo;
//	private Null nul;
//	// --�޷� �г� ȯ�� ����
//	private JPanel calPanel;
//	private JButton weekDaysName[];
//	private JButton dateButs[][] = new JButton[6][7];
//	final String WEEK_DAY_NAME[] = { "��", "��", "ȭ", "��", "��", "��", "��" };
//
//	public CalendarView() { // ������ 
//		frame = new JFrame("Calendar Example");// Ÿ��Ʋ ����
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �ݱ� ��ư �⺻ ����
//		frame.setBounds(300, 200, 700, 500); // �⺻ ũ��, ��ġ ����
//		// frame.setResizable(false); // ũ�� ���� ����
//		root = frame.getContentPane();
//
//		initLabPane(); // ���̺� �г�
//		initCalPane();// �޷� �г�
//		initButPane();// ��ư �г�
//
//		// Frame ����
//		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
//		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
//		root.add(butPanel, BorderLayout.SOUTH);
//		root.add(datePanel, BorderLayout.NORTH);
//		root.add(calPanel);
//		
//		showCal(); // �޷��� ǥ��
//
//		frame.setVisible(true);
//	} // ������ end 
//
//
//	private void initCalPane(){//�޷� �г� ����
//		// ---�޷� �г� ���� �ҽ�
//		calPanel = new JPanel();
//		weekDaysName = new JButton[7];
//		for (int i = 0; i < CAL_WIDTH; i++) {
//			weekDaysName[i] = new JButton(WEEK_DAY_NAME[i]);
//			weekDaysName[i].setBorderPainted(false);
//			weekDaysName[i].setContentAreaFilled(false);
//			weekDaysName[i].setForeground(Color.WHITE);
//			if (i == 0)
//				weekDaysName[i].setBackground(new Color(200, 50, 50));//�Ͽ���
//			else if (i == 6)
//				weekDaysName[i].setBackground(new Color(50, 100, 200));//�����
//			else
//				weekDaysName[i].setBackground(new Color(150, 150, 150));//����
//			weekDaysName[i].setOpaque(true);
//			weekDaysName[i].setFocusPainted(false);
//			calPanel.add(weekDaysName[i]);
//		}
//		for (int i = 0; i < CAL_HEIGHT; i++) {
//			for (int j = 0; j < CAL_WIDTH; j++) {
//				dateButs[i][j] = new JButton();
//				dateButs[i][j].setBorderPainted(false);
//				dateButs[i][j].setContentAreaFilled(false);
//				dateButs[i][j].setBackground(Color.WHITE);
//				dateButs[i][j].setOpaque(true);
//				dateButs[i][j].addActionListener(this);
//				calPanel.add(dateButs[i][j]);
//			}
//		} // �޷� ���� end
//	}
//	private void initLabPane() {//���̺� �г� ����
//		// --���̺��г� ���� �ҽ�
//		datePanel = new JPanel();
//		dateLab = new JLabel();
//		dateLab.setText(calYear + "�� " + (calMonth + 1)+ "��");
//		datePanel.add(dateLab);
//		//--���̺� �г� end
//	}
//	 
//	private void initButPane() {//��ư �г� ����
//		// --��ư �г� ���� �ҽ� 
//		// ��ũ���ؼ� �ű�� ������� ����
//		butPanel = new JPanel();
//		butPanel.setLayout(new FlowLayout());
//		lYeaBut = new JButton("�۳�");
//		lYeaBut.addActionListener(lMoveMonth);
//		butPanel.add(lYeaBut);
//		lMonBut = new JButton("���� ��");
//		lMonBut.addActionListener(lMoveMonth);
//		butPanel.add(lMonBut);
//		nMonBut = new JButton("���� ��");
//		nMonBut.addActionListener(lMoveMonth);
//		butPanel.add(nMonBut);
//		nYeaBut = new JButton("����");
//		nYeaBut.addActionListener(lMoveMonth);
//		butPanel.add(nYeaBut);
//		
//		iljung = new JLabel(todo);
//		iljung.setSize(200, 50);
//		iljung.setBackground(Color.WHITE); 
//		iljung.setBorder(null);
//		butPanel.add(iljung); 
//		// --��ư ���� end
//	}
//
//	private void showCal() {// �޷��� ������ (ȣ��ø��� calDate �迭�� �ʱ�ȭ�Ͽ� ���� ��¥�� ��
//		JButton todayBut = null;
//		for (int i = 0; i < CAL_HEIGHT; i++) {
//			for (int j = 0; j < CAL_WIDTH; j++) {
//				dateButs[i][j].setBackground(Color.white);
//				dateButs[i][j].setText(Integer.toString(calDates[i][j]));
//				dateButs[i][j].removeAll();
//
//				if (calMonth == today.get(Calendar.MONTH) && calYear == today.get(Calendar.YEAR)
//						&& calDates[i][j] == today.get(Calendar.DAY_OF_MONTH)) {
//					dateButs[i][j].setToolTipText("Today");
//					todayBut = dateButs[i][j];
//					todayBut.setBackground(Color.orange);
//				}
//
//				if (calDates[i][j] == 0)
//					dateButs[i][j].setVisible(false);
//				else
//					dateButs[i][j].setVisible(true);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		new CalendarView();
//		
//		// �� ���پ� ���� �о���̱� 
//		try {
//			BufferedReader in = new BufferedReader(
//					new FileReader("./src/HMini/memo"));
//			String line ="";
//			while((line = in.readLine())!=null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//	}
//
//	private class ListenMoveMonth implements ActionListener {//��¥ Ŭ�� �̺�Ʈ ó��
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == lMonBut) {
//				moveMonth(-1);
//			} else if (e.getSource() == nMonBut) {
//				moveMonth(1);
//			} else if (e.getSource() == lYeaBut) {
//				moveMonth(-12);
//			} else if (e.getSource() == nYeaBut) {
//				moveMonth(12);
//			}
//			dateLab.setText(calYear + "�� " + (calMonth + 1)+ "��");
//			showCal();
//		}
//	} 
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		//��¥ Ŭ���� ���� ���� ó��
//		clickBut = (JButton)e.getSource();
//		System.out.println(clickBut.getText()+"�� �Դϴ�.");
//
//		// �ڳ�¥ ������ �Ѱ��ֱ� 
//		this.year = calYear;
//		this.month = calMonth+1; 
//		this.day = clickBut.getText(); 
//		String txt = this.year + "-" + this.month + "-" + this.day;
//
//		System.out.println(txt); // Ŭ�� ��¥ 
//		
//		nul = new Null(txt); 
//		
//	} 
//}
