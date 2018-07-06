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

class CalendarDataManager { // 6*7배열에 나타낼 달력 값을 구하는 class
	static final int CAL_WIDTH = 7;
	static final int CAL_HEIGHT = 6;
	int calDates[][] = new int[CAL_HEIGHT][CAL_WIDTH];
	int calYear;
	int calMonth;
	int calDayOfMon;
	final int calLastDateOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각 월의 마지막 날 배열
	int calLastDate;
	Calendar today = Calendar.getInstance();// 오늘의 정보 저장
	Calendar cal; // calendar 객체

	public CalendarDataManager() { // 생성자
		setToday();
	}

	public void setToday() { // 오늘의 정보 불러오기 & 변수에 저장
		calYear = today.get(Calendar.YEAR);
		calMonth = today.get(Calendar.MONTH);
		calDayOfMon = today.get(Calendar.DAY_OF_MONTH);
		makeCalData(today);
	}

	private void makeCalData(Calendar cal) {// 달력의 초기화와 날짜 입력 -> 1일의 위치와 마지막 날짜를 구함
		int calStartingPos = (cal.get(Calendar.DAY_OF_WEEK) + 7 - (cal.get(Calendar.DAY_OF_MONTH)) % 7) % 7;
		if (calMonth == 1)
			calLastDate = calLastDateOfMonth[calMonth] + leapCheck(calYear);// 2월일 경우 윤년을 체크하여 1일을 더해줌
		else
			calLastDate = calLastDateOfMonth[calMonth]; // 2월이 아닐 경우 배열에서 값을 불러와 저장
		// 달력 배열 초기화
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				calDates[i][j] = 0;
			}
		}
		// 달력 배열에 값 채워넣기
		for (int i = 0, num = 1, k = 0; i < CAL_HEIGHT; i++) {
			if (i == 0)
				k = calStartingPos;
			else
				k = 0; // k는 각 주의 시작하는 날짜이고 첫주가 아니면 일요일부터 배열에 채워넣는다. num++을 증가시키며 날짜를 입력하고,마지막날을 입력한후
						// 반복문을 종료한다.
			for (int j = k; j < CAL_WIDTH; j++) {
				if (num <= calLastDate)
					calDates[i][j] = num++;
			}
		}
	}

	private int leapCheck(int year) { // 윤년인지 확인하는 함수
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return 1;// 윤년일 경우 1을 리턴하여 2월의 마지막날짜에 더해준다.
		else
			return 0;
	}

	public void moveMonth(int mon) { // 현재달로 부터 n달 전후를 받아 달력 배열을 만드는 함수(1년은 +12, -12달로 이동 가능)
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
	// --메인 프레임
	private JFrame frame;
	private Container root;
	// 년 / 월 패널
	private JPanel datePanel;
		private JLabel dateLab;
	// 일정 추가 버튼
	private JButton schedbut;		
	// --버튼 패널
	private JPanel butPanel;
		private JButton nMonBut;
		private JButton lMonBut;
		private JButton nYeaBut;
		private JButton lYeaBut;
	private ListenMoveMonth lMoveMonth = new ListenMoveMonth();
	// --달력 패널 
	private JPanel calPanel; 
	private JButton weekDaysName[];
	private JButton dateButs[][] = new JButton[6][7];
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" };
	private JLabel label;
	private final JPanel panel = new JPanel();
	
	private void initCalPane(){ //달력 패널 생성

		// 요일 부분 설정 
		calPanel=new JPanel();
		weekDaysName = new JButton[7]; 
		for (int i = 0; i < CAL_WIDTH; i++) {
			weekDaysName[i] = new JButton(WEEK_DAY_NAME[i]);
			weekDaysName[i].setBorderPainted(false);
			weekDaysName[i].setContentAreaFilled(false);
			weekDaysName[i].setForeground(Color.WHITE);
			if (i == 0)
				weekDaysName[i].setBackground(new Color(192, 192, 192));//일요일, silver
			else if (i == 6)
				weekDaysName[i].setBackground(new Color(192, 192, 192));//토요일, silver
			else
				weekDaysName[i].setBackground(new Color(150, 150, 150));//평일
			weekDaysName[i].setOpaque(true);
			weekDaysName[i].setFocusPainted(false);
			calPanel.add(weekDaysName[i]); 
		}
		for (int i = 0; i < CAL_HEIGHT; i++) {
			for (int j = 0; j < CAL_WIDTH; j++) {
				dateButs[i][j] = new JButton();
				// 폰트 크기 크게 조정하기 
				dateButs[i][j].setBorderPainted(false);
				dateButs[i][j].setContentAreaFilled(false);
				dateButs[i][j].setBackground(Color.WHITE);
				dateButs[i][j].setOpaque(true);
				dateButs[i][j].addActionListener(this);
				calPanel.add(dateButs[i][j]);
			}
		} // 달력 생성 end
	}
	private void initLabPane() { // 레이블 패널 생성
		// --레이블패널 생성 소스
		datePanel = new JPanel();
		datePanel.setPreferredSize(new Dimension(700, 50));
		datePanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		// 일정 추가 버튼 생성 
		ImageIcon originicon = new ImageIcon("./src/mini/plus.png"); // ImageIcon객체생성
		Image originimg = originicon.getImage(); // ImageIcon에서 Image를 추출
		Image changedimg = originimg.getScaledInstance(32, 10, Image.SCALE_SMOOTH); // Image 크기 조절
		ImageIcon Icon = new ImageIcon(changedimg);
		
		label = new JLabel("");
		datePanel.add(label);
		dateLab = new JLabel();
		dateLab.setText(calYear + "년 " + (calMonth + 1) + "월"); 
		datePanel.add(dateLab);
		
		//--레이블 패널 end
	}
	private void initButPane() {//버튼 패널 생성
		// --버튼 패널 생성 소스
				butPanel = new JPanel();
				butPanel.setLayout(new FlowLayout());
				lYeaBut = new JButton("작년");
				lYeaBut.addActionListener(lMoveMonth);
				butPanel.add(lYeaBut);
				lMonBut = new JButton("지난 달");
				lMonBut.addActionListener(lMoveMonth);
				butPanel.add(lMonBut);
				nMonBut = new JButton("다음 달");
				nMonBut.addActionListener(lMoveMonth);
				butPanel.add(nMonBut);
				nYeaBut = new JButton("내년");
				nYeaBut.addActionListener(lMoveMonth);
				butPanel.add(nYeaBut);
				// --버튼 생성 end

	}
	public CalendarExercise() {
		frame = new JFrame("Calendar Example");// 타이틀 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기 버튼 기본 동작
		frame.setBounds(300, 200, 700, 400); // 기본 크기, 위치 설정
		// frame.setResizable(false); // 크기 변경 금지
		root = frame.getContentPane();

		initLabPane(); // 레이블 패널
		initCalPane();// 달력 패널
		initButPane();// 버튼 패널

		// Frame 세팅
		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		root.add(butPanel, BorderLayout.SOUTH);
		root.add(datePanel, BorderLayout.NORTH);
		datePanel.add(panel);
		
		JButton addbut = new JButton(Icon); // 아이콘 추가
		panel.add(addbut);
		addbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		root.add(calPanel);
		showCal(); // 달력을 표시
		
		frame.setVisible(true);
	}

	private void showCal() {// 달력을 보여줌 (호출시마다 calDate 배열을 초기화하여 새로 날짜를 씀
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
					//todayBut.setForeground(new Color(255,000,000)); // 오늘날짜 글자색상
					todayBut.setBackground(new Color(250, 240, 230)); // 오늘날짜 배경색상, 린넨
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

	private class ListenMoveMonth implements ActionListener {//날짜 클릭 이벤트 처리
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
		//날짜 클릭에 대한 동작 처리
		JButton clickBut = (JButton)e.getSource();
		System.out.println(clickBut.getText()+"일 입니다.");
		
		// 일정 보여주기 
		
	}

}