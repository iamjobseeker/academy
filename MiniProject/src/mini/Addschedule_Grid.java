package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Addschedule_Grid extends JFrame { 

	// 메인 프레임
	private Container root;
	// 제목 패널
	private JPanel titlepanel = new JPanel();
	// 본문 패널
	private JPanel schedpanel = new JPanel();
	// 버튼 패널 
	private JPanel butpanel = new JPanel();
	// 왼오른쪽 패널
	private JPanel leftpanel = new JPanel();
	private JPanel rightpanel = new JPanel();

	private Addschedule_Grid() { // 생성자
		
		setTitle("일정 등록"); // 타이틀 
		setBounds(650, 50, 580, 650); // 크기 및 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 열기 
		root = getContentPane();

		// ----- 프레임 설정 ----- 
		schedpanel.setLayout(new GridLayout(5,0, 30, 40)); 
//		schedpanel.setBackground(new Color(255, 245, 238));
		butpanel.setLayout(new GridLayout(0, 2));
		
		root.setLayout(new BorderLayout(20, 20)); 
		root.add(titlepanel, BorderLayout.NORTH);
		root.add(schedpanel, BorderLayout.CENTER); 
		root.add(butpanel, BorderLayout.SOUTH); 
		root.add(leftpanel, BorderLayout.WEST);
		root.add(rightpanel, BorderLayout.EAST); 

		// --- 전체 제목 ---
		JLabel top = new JLabel("");
		JLabel title = new JLabel("일정 등록");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("굴림", Font.BOLD, 20));
		title.setText("일정 등록"); 
	
		titlepanel.setLayout(new GridLayout(2, 0));
		titlepanel.add(top);
		titlepanel.add(title); 
		
		// ----- 일정 등록하기 (일정명 입력) -----
		JTextField name = new JTextField("일정명", 50);
		name.setColumns(5); 
//		name.setBounds(20, 100, 500, 5); // 위치 설정 
		name.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정 

		// place holder
		name.setForeground(Color.GRAY); 

		name.addFocusListener(new FocusListener() {
			@Override

			public void focusLost(FocusEvent e) {

				// 포커스를 잃고 텍스트가 비어있으면 초기 텍스트 유지 

				if(name.getText().isEmpty()) {
					name.setText("일정명");
					name.setForeground(Color.gray);
				} 
			}

			@Override
			public void focusGained(FocusEvent e) { 
				// 포커스를 얻으면 폰트 컬러 블랙으로 설정 
				if(name.getText().equals("일정명")) { 
					name.setText("");
					name.setForeground(Color.BLACK); 
				}
			}
		});

		schedpanel.add(name);

		// ----- 일정 시작지점 등록하기 -----
		JTextField start = new JTextField();
		
		start.setBounds(20, 200, 500, 40); // 위치 설정
		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		start.setText("시작				2018.7.10  오후 1:00"); // 초기 텍스트
		start.setForeground(Color.GRAY);

		start.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if(start.getText().isEmpty()) {
					start.setText("시작				2018.7.10  오후 1:00");
					start.setForeground(Color.GRAY);
				} // 포커스를 잃고 텍스트가 비어있으면 초기 텍스트 유지
			}

			@Override
			public void focusGained(FocusEvent e) {
				if(start.getText().equals("시작				2018.7.10  오후 1:00")) {
					start.setText("");
					start.setForeground(Color.black);
				} // 포커스를 얻으면 폰트 컬러 블랙으로 설정 
			}

		});

		// 날짜 or 시간 부분 클릭하면 

		// 키보드 입력으로 수정 가능하도록 하기 
		
		schedpanel.add(start); 

		// -------------------------------------------

		// ----- 일정 종료지점 등록하기 -----
		JTextField end = new JTextField();

		end.setBounds(20, 300, 500, 40); // 위치 설정
		end.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		end.setText("종료						  오후 2:00"); // 초기 텍스트
		end.setForeground(Color.GRAY);

		end.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				if(end.getText().isEmpty()) {
					end.setText("종료						  오후 2:00");
					end.setForeground(Color.GRAY);
				} // 포커스를 잃고 텍스트가 비어있으면 초기 텍스트 유지
			}

			@Override
			public void focusGained(FocusEvent e) {
				if(end.getText().equals("종료						  오후 2:00")) {
					end.setText("");
					end.setForeground(Color.black);
				} // 포커스를 얻으면 폰트 컬러 블랙으로 설정 
			}

		});

		schedpanel.add(end); 

		// ----- 상대방과 공유하기 -----
		// 상대방과 공유하기 텍스트
		JTextField share = new JTextField("상대방과 공유");

		share.setBounds(20, 400, 350, 40); 
		share.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		share.setBackground(Color.WHITE); 

		// 상자 라인색상 변경( ) 

		share.setEditable(false); 
		schedpanel.add(share);

		// 상대방과 공유하기 버튼 

		// ----- 기념일로 지정 설정 -----
		JTextField anny = new JTextField("기념일로 지정");

		anny.setBounds(20, 500, 350, 40); 
		anny.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		anny.setBackground(Color.WHITE); 

		// 상자 라인색상 변경( ) 
		anny.setEditable(false); 
		schedpanel.add(anny);

		// -------------------------------------------

		// --- 일정 등록하기 버튼 ---
		JButton okbut = new JButton("등록");
		okbut.setPreferredSize(new Dimension(100, 50)); 
		butpanel.add(okbut);

		// --- 일정 등록 취소하기(창 닫기) 버튼 ---
		JButton cancelbut = new JButton("취소"); 
		cancelbut.setPreferredSize(new Dimension(100, 50));
		butpanel.add(cancelbut); 
		
		JLabel bottom = new JLabel("");
		butpanel.setLayout(new GridLayout(2, 0));
		butpanel.add(bottom, BorderLayout.SOUTH); 

		// --- 등록 취소 대화상자 ---
		

		// ------------------------------
		
		setVisible(true);

		okbut.requestFocus(); // 버튼이 포커스 획득 

	} 


	public static void main(String[] args) {

		new Addschedule_Grid(); 
	}



}