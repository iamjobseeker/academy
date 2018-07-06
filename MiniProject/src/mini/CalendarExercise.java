package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	private Container root;
	// �� / �� �г�
	private JPanel datePanel;
		private JLabel dateLab;
	// ���� �߰� ��ư
	private JButton schedbut;		
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
	private JLabel label;
	private final JPanel panel = new JPanel();
	
	private void initCalPane(){ //�޷� �г� ����

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
				// ��Ʈ ũ�� ũ�� �����ϱ� 
				dateButs[i][j].setBorderPainted(false);
				dateButs[i][j].setContentAreaFilled(false);
				dateButs[i][j].setBackground(Color.WHITE);
				dateButs[i][j].setOpaque(true);
				dateButs[i][j].addActionListener(this);
				calPanel.add(dateButs[i][j]);
			}
		} // �޷� ���� end
	}
	private void initLabPane() { // ���̺� �г� ����
		// --���̺��г� ���� �ҽ�
		datePanel = new JPanel();
		datePanel.setPreferredSize(new Dimension(700, 50));
		datePanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		// ���� �߰� ��ư ���� 
		ImageIcon originicon = new ImageIcon("./src/mini/plus.png"); // ImageIcon��ü����
		Image originimg = originicon.getImage(); // ImageIcon���� Image�� ����
		Image changedimg = originimg.getScaledInstance(32, 10, Image.SCALE_SMOOTH); // Image ũ�� ����
		ImageIcon Icon = new ImageIcon(changedimg);
		
		label = new JLabel("");
		datePanel.add(label);
		dateLab = new JLabel();
		dateLab.setText(calYear + "�� " + (calMonth + 1) + "��"); 
		datePanel.add(dateLab);
		
		//--���̺� �г� end
	}
	private void initButPane() {//��ư �г� ����
		// --��ư �г� ���� �ҽ�
				butPanel = new JPanel();
				butPanel.setLayout(new FlowLayout());
				lYeaBut = new JButton("�۳�");
				lYeaBut.addActionListener(lMoveMonth);
				butPanel.add(lYeaBut);
				lMonBut = new JButton("���� ��");
				lMonBut.addActionListener(lMoveMonth);
				butPanel.add(lMonBut);
				nMonBut = new JButton("���� ��");
				nMonBut.addActionListener(lMoveMonth);
				butPanel.add(nMonBut);
				nYeaBut = new JButton("����");
				nYeaBut.addActionListener(lMoveMonth);
				butPanel.add(nYeaBut);
				// --��ư ���� end

	}
	public CalendarExercise() {
		frame = new JFrame("Calendar Example");// Ÿ��Ʋ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �ݱ� ��ư �⺻ ����
		frame.setBounds(300, 200, 700, 400); // �⺻ ũ��, ��ġ ����
		// frame.setResizable(false); // ũ�� ���� ����
		root = frame.getContentPane();

		initLabPane(); // ���̺� �г�
		initCalPane();// �޷� �г�
		initButPane();// ��ư �г�

		// Frame ����
		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		root.add(butPanel, BorderLayout.SOUTH);
		root.add(datePanel, BorderLayout.NORTH);
		datePanel.add(panel);
		
		JButton addbut = new JButton(Icon); // ������ �߰�
		panel.add(addbut);
		addbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		root.add(calPanel);
		showCal(); // �޷��� ǥ��
		
		frame.setVisible(true);
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

	private class ListenMoveMonth implements ActionListener {//��¥ Ŭ�� �̺�Ʈ ó��
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
			dateLab.setText("Year : " + calYear + " / Month : " + (calMonth + 1));
			showCal();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//��¥ Ŭ���� ���� ���� ó��
		JButton clickBut = (JButton)e.getSource();
		System.out.println(clickBut.getText()+"�� �Դϴ�.");
		
		// ���� �����ֱ� 
		
	}

}