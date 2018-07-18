package mini;

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
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
//import static mini.CalendarAdd_Grid.okbut; 

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
	Calendar cal; // calendar객체 

	public CalendarDataManager() { // 생성자
		setToday();
	}

	public void setToday() { // 오늘의 정보 불러오기 & 변수에 저장
		calYear = today.get(Calendar.YEAR); // 올해
		calMonth = today.get(Calendar.MONTH); // 이번달
		calDayOfMon = today.get(Calendar.DAY_OF_MONTH); // 오늘
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
	private JPanel upPanel;
	private JPanel downPanel; 
	private Container root;
	// --년 / 월 패널
	private JPanel datePanel;
	private JLabel label;
	private JLabel label2; 
	private JLabel label3;
	private JLabel dateLab;
	private JButton addbut;	 // 일정 추가 버튼	
	// --버튼 패널
	private JPanel butPanel;
	private JButton nMonBut;
	private JButton lMonBut;
	private JButton nYeaBut;
	private JButton lYeaBut;
	private ListenMoveMonth lMoveMonth = new ListenMoveMonth();
	// -- 버튼 액션리스너
	private int lYea;
	private String lYeaStr;
	private int nYea;
	private String nYeaStr;
	// --달력 패널 
	private JPanel calPanel; 
	private JButton weekDaysName[];
	private JButton dateButs[][] = new JButton[6][7]; 
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" }; 
	// --일정 패널
	private JPanel schedPanel;
	private JTextField[] tfArray;
	JScrollPane scroll;
	// --액션리스너 변수
	private JButton clickBut;
	private JButton prev_click; 
	private String txt;
	private BufferedReader in;
	private String line;
	// -- 일정삭제 패널
	private JPanel delPanel;
	private JButton[] butArray;


	private JPanel iljungPanel; 
	
	public CalendarExercise() { // 생성자 
		
		frame = new JFrame("Calendar Example");// 타이틀 설정
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 닫기 버튼 기본 동작
		frame.setBounds(300, 10, 700, 700); // 기본 크기, 위치 설정
		frame.getContentPane().setLayout(new FlowLayout());
		root = frame.getContentPane();

		initLabPane(); // 레이블 패널
		initCalPane();// 달력 패널 
		initButPane();// 버튼 패널  
		initschedPane(); // 일정 패널  

		// Frame 세팅
		upPanel = new JPanel(new BorderLayout());
		upPanel.setPreferredSize(new Dimension(700, 400));
		downPanel = new JPanel(new BorderLayout());
		calPanel.setLayout(new GridLayout(0, 7, 2, 2));
		calPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));

		upPanel.add(datePanel, BorderLayout.NORTH); 
		upPanel.add(calPanel, BorderLayout.CENTER);
		upPanel.add(butPanel, BorderLayout.SOUTH); 
		downPanel.add(iljungPanel, BorderLayout.CENTER);
		root.add(upPanel);
		root.add(downPanel);

		showCal(); // 달력을 표시  
		
		txt=calYear+"-"+(calMonth+1)+"-"+calDayOfMon;
		Filetodo();
		
		frame.setVisible(true); 
	}

	

	private void initCalPane(){ // 달력 패널 생성
		// 요일 부분 설정 
		calPanel=new JPanel();  

		weekDaysName = new JButton[7]; // 요일
		for (int i = 0; i < CAL_WIDTH; i++) {
			weekDaysName[i] = new JButton(WEEK_DAY_NAME[i]);
			weekDaysName[i].setBorderPainted(false);
			weekDaysName[i].setContentAreaFilled(false);
			weekDaysName[i].setForeground(Color.WHITE);
			if (i == 0)
				weekDaysName[i].setBackground(new Color(192, 192, 192)); //일요일, silver
			else if (i == 6)
				weekDaysName[i].setBackground(new Color(192, 192, 192)); //토요일, silver
			else
				weekDaysName[i].setBackground(new Color(150, 150, 150)); //평일
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

				// 폰트 크게
				calPanel.add(dateButs[i][j]);
			}
		} // 달력 생성 end
	}
	private void initLabPane() { // 레이블 패널 생성
		// --레이블패널 생성 소스 
		datePanel = new JPanel(); 
		datePanel.setPreferredSize(new Dimension(700, 50));
		datePanel.setLayout(new GridLayout(0, 5, 0, 0));
		label = new JLabel("");
		datePanel.add(label); 

		// 일정 추가 버튼 생성 
		ImageIcon originicon = new ImageIcon("./src/mini/add.png"); // ImageIcon객체생성
		Image originimg = originicon.getImage(); // ImageIcon에서 Image를 추출
		Image changedimg = originimg.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // Image 크기 조절
		ImageIcon Icon = new ImageIcon(changedimg); 
		addbut = new JButton(Icon); // 아이콘 추가  
		addbut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜 넘겨주기 
				int year = calYear;
				int month = calMonth+1; 
				String day = clickBut.getText(); // 날짜 클릭없이 '+'클릭하면 에러 
				txt = year + "-" + month + "-" + day; 
				System.out.println(txt); // 클릭 날짜 
				CalendarAdd grid  = new CalendarAdd(txt); 	 
			}
		}); 
		addbut.setToolTipText("일정 추가하기"); 
		addbut.setSize(100, 50);
		addbut.setBorder(null);
		addbut.setContentAreaFilled(false); 

		label2=new JLabel(""); 
		datePanel.add(label2);
		dateLab = new JLabel(calYear + "년 " + (calMonth + 1) + "월"); 
		dateLab.setHorizontalAlignment(SwingConstants.CENTER);
		dateLab.setFont(new Font("굴림", Font.BOLD, 15));
		datePanel.add(dateLab); 
		label3=new JLabel("");
		datePanel.add(label3); 
		datePanel.add(addbut); 
		//--레이블 패널 end 
	} 

	private void initButPane() { // 버튼 패널 생성 
		// --버튼 패널 생성 소스
		butPanel = new JPanel();
		butPanel.setLayout(new FlowLayout()); 
		lYea = calYear-1;
		System.out.println(lYea); 
		lYeaStr = String.valueOf(lYea); 
//		lYeaBut = new JButton(lYeaStr+" 년"); // 작년패널 
		lYeaBut = new JButton("작년");
		lYeaBut.setBackground(Color.WHITE); 
		lYeaBut.setBorderPainted(false); 
		lYeaBut.addActionListener(lMoveMonth);
//		lYeaBut.addActionListener(new ActionListener() {

//			@Override
//			public void actionPerformed(ActionEvent e) { 
//				lYea-=1; 
//				lYeaStr = String.valueOf(lYea); 
//				lYeaBut.setText(lYeaStr+" 년");
//				nYea -=1;
//				nYeaStr = String.valueOf(nYea);
//				nYeaBut.setText(nYeaStr+" 년");
//			} 
//		});
		
		butPanel.add(lYeaBut);
		lMonBut = new JButton("지난 달"); 
		lMonBut.addActionListener(lMoveMonth);
		lMonBut.setBackground(Color.WHITE);
		lMonBut.setBorderPainted(false); 
		butPanel.add(lMonBut); 
		nMonBut = new JButton("다음 달");
		nMonBut.setBackground(Color.white);
		nMonBut.setBorderPainted(false);
		nMonBut.addActionListener(lMoveMonth);
		butPanel.add(nMonBut); 
		// 액션리스너 
		nYea = calYear+1;
		nYeaStr = String.valueOf(nYea);
//		nYeaBut = new JButton(nYeaStr+" 년");
		nYeaBut = new JButton("내년");
		nYeaBut.setBackground(Color.WHITE); 
		nYeaBut.setBorderPainted(false);
		nYeaBut.addActionListener(lMoveMonth);
//		nYeaBut.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				nYea+=1;
//				nYeaStr = String.valueOf(nYea);
//				nYeaBut.setText(nYeaStr+" 년"); 
//				lYea +=1;
//				lYeaStr = String.valueOf(lYea);
//				lYeaBut.setText(lYeaStr+" 년");
//			}
//		}); 
		butPanel.add(nYeaBut);
		
//		String.valueOf(2017); 
//		String a = 2017+""; // int -> String 
		
		// --버튼 생성 end
	}

	private void showCal() { // 달력을 보여줌 (호출시마다 calDate 배열을 초기화하여 새로 날짜를 씀
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

	private class ListenMoveMonth implements ActionListener { // 날짜 이동 이벤트 처리
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
			dateLab.setText("\t" + calYear + "년 "+ (calMonth + 1) + "월"); 
			showCal(); 
		}
	} 
	
	public void Filetodo() { 
		try { 
			in = new BufferedReader(
					new FileReader("./src/mini/todo"));
			line =""; 
			tfArray[0].setText("일정없음"); // 일정없는 날짜 처리 
			while((line = in.readLine())!=null) { 
				if(line.contains(txt)) { 
					if(tfArray[0].getText().contains("기념일") == false &&
							tfArray[0].getText().contains("스케쥴")== false) 
					{tfArray[0].setText(line.replace(txt, "")); // 날짜텍스트 제거
					System.out.print("기념일,일정 포함 안함");
					System.out.println("1번칸에 추가");
					} else if(tfArray[1].getText().contains("기념일") == false && 
							tfArray[1].getText().contains("스케쥴")==false) { // 빈 텍스트필드라면
						tfArray[1].setText(line.replace(txt,"")); // 날짜텍스트 제거
						System.out.println("2번칸에 추가");
					} else if(tfArray[2].getText().contains("스케쥴") == false && 
							tfArray[2].getText().contains("기념일")==false) { // 빈 텍스트필드라면
						tfArray[2].setText(line.replace(txt, "")); // 날짜텍스트 제거
						System.out.println("3번칸에 추가");
					} else if(tfArray[3].getText().contains("스케쥴") == false && 
							tfArray[3].getText().contains("기념일")==false) {
						tfArray[3].setText(line.replace(txt, "")); // 날짜텍스트 제거
						System.out.println("4번칸에 추가");
					} 
					// 달력에 일정 표시 삽입하기  
				}		
			} 
			in.close();
		} catch (FileNotFoundException e2) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e2) {
			System.out.println("입출력 오류 발생");
		} 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 날짜 클릭에 대한 동작 처리 
		clickBut = (JButton)e.getSource(); 
		clickBut.setForeground(Color.red); 
		if(prev_click != null) prev_click.setForeground(Color.BLACK); 
		prev_click=(JButton)e.getSource(); 

		txt = calYear+"-"+(calMonth+1)+"-"+clickBut.getText();
		System.out.println("클릭날짜 테스트용" + txt); 
		
		for(JTextField s : tfArray) {
			s.setText("");
		} 
		
		Filetodo(); 
		
		// 달력 넘길때 빨간색 없애기 
		//		if(e.getSource()==lYeaBut || e.getSource()==nYeaBut
		//				|| e.getSource()==lMonBut || e.getSource()==nMonBut) {
		//			for (int i = 0; i < CAL_HEIGHT; i++) {
		//				for (int j = 0; j < CAL_WIDTH; j++) {
		//					dateButs[i][j].setForeground(Color.BLACK);
		//				}
		//			} 

	}
	
	private void initschedPane() { // 일정 패널 생성
		delPanel = new JPanel();
		delPanel.setLayout(new GridLayout(4, 0, 10, 2)); 
		delPanel.setPreferredSize(new Dimension(60, 210));
		
		butArray = new JButton[4]; 
		butArray[0] = new JButton("삭제");
		butArray[1] = new JButton("삭제");
		butArray[2] = new JButton("삭제");
		butArray[3] = new JButton("삭제");
		
//		JButton delBut1 = new JButton("삭제");
//		JButton delBut2 = new JButton("삭제");
//		JButton delBut3 = new JButton("삭제");
//		JButton delBut4 = new JButton("삭제"); 

//		delBut1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		
		for(JButton but : butArray) {
			but.setBorder(null);
			but.setBackground(Color.white);
			but.setForeground(Color.red);
			but.addActionListener(new ActionListener() { // 삭제버튼 액션리스너 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 해당 날짜의 해당 레이블 "" 만들기
					// 파일에서 다시 일정을 읽어서 순서 조정하기 
					txt = calYear+"-"+(calMonth+1)+"-"+clickBut.getText(); // 삭제할 일정의 날짜
					String[] lineArray = new String [4]; // 라인을 담을 스트링 배열
					for(int i=0; i<4; i++) {
						lineArray[i]=""; // 초기화  
					}
					System.out.println( "삭제 테스트용"+txt); 
					
					if(( butArray[0] == (JButton)e.getSource())) { // 첫번째 삭제버튼 클릭
						try { 
							in = new BufferedReader( 
									new FileReader("./src/mini/todo"));  
							line =""; 
							while((line = in.readLine())!=null) { 
								if(line.contains(txt)) { 
									if(lineArray[0].contains(txt)==false) lineArray[0] = line; // 배열이 빈 공간이라면
									else if(lineArray[1].contains(txt)==false) lineArray[1] = line; // 라인을 저장
									else if(lineArray[2].contains(txt)==false) lineArray[2] = line;
									else lineArray[3] = line;  
									
									System.out.println("첫번째" + lineArray[0]);
									System.out.println("두번째" + lineArray[1]);
									System.out.println("세번째" + lineArray[2]);
									System.out.println("네번째" + lineArray[3]); 
								} 
							}
						} catch (IOException e1) {
							System.out.println("삭제 버튼 입출력 에러 발생"); 
						}
					}
				}
			});
			delPanel.add(but); 
		} 
		iljungPanel = new JPanel();
		iljungPanel.setLayout(new FlowLayout()); 

		schedPanel = new JPanel();
		schedPanel.setPreferredSize(new Dimension(600, 210)); 
		schedPanel.setLayout(new GridLayout(4, 0, 10, 2));
		// 날짜 보여주는 레이블 
		tfArray=new JTextField[4];
		tfArray[0] = new JTextField("일정 없음"); 
		tfArray[1] = new JTextField();
		tfArray[2] = new JTextField();
		tfArray[3] = new JTextField();

		for(JTextField field : tfArray) {
			field.setBorder(null);  
			field.setEditable(false);
			field.setBackground(Color.white);
			schedPanel.add(field); 
		}
		
		iljungPanel.add(schedPanel);
		iljungPanel.add(delPanel); 
	} 
}