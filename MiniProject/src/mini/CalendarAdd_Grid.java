package mini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants; 

public class CalendarAdd_Grid extends JFrame { 
	// 메인 프레임
	private Container root; 
	// 제목 패널
	private JPanel titlePanel;
	private JLabel top; // 위치 조정용 레이블
	private JLabel title; // 제목 레이블  
	// 본문 패널
	private JPanel calndPanel; 
	private JTextField name; // 일정명 텍스트필드
	private JTextField start; // 일정시작 텍스트필드
	private JTextField end; // 일정 종료 텍스트필드
	private JTextField share; // 일정 공유 텍스트필드
	private JTextField anny; // 기념일지정 텍스트필드 
	// 버튼 패널 
	private JPanel butpanel;
	private JLabel left; // 위치 조정용 레이블
	private JLabel right; // 위치 조정용 레이블
	private JLabel bottom; // 위치 조정용 레이블 
	private JButton okbut; // 등록 버튼
	private JButton nobut; // 취소 버튼 
	// 왼오른쪽 패널
	private JLabel leftlabel;
	private JLabel rightlabel;

	protected CalendarAdd_Grid() { // 생성자 

		setTitle("일정 등록"); // 타이틀 
		setBounds(650, 50, 500, 600); // 크기 및 위치
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 프레임 열기 

		initTitlePanel(); // 제목 패널
		initCalndPanel(); // 본문 패널
		initButPanel(); // 버튼 패널 
		
		leftlabel=new JLabel();
		rightlabel = new JLabel();
		
		root = getContentPane();
		root.setLayout(new BorderLayout(20, 20)); 
		root.add(titlePanel, BorderLayout.NORTH); 
		root.add(calndPanel, BorderLayout.CENTER); 
		root.add(butpanel, BorderLayout.SOUTH); 
		root.add(leftlabel, BorderLayout.WEST);
		root.add(rightlabel, BorderLayout.EAST); 
		
		setVisible(true); 
		
		okbut.requestFocus(); // 버튼이 포커스 획득 
		
	} // 생성자 끝

	private void initTitlePanel() { // 제목 패널 설정

		titlePanel = new JPanel(new GridLayout(2, 0));

		top = new JLabel(""); // 위치 조정용 레이블
		title = new JLabel("일정 등록"); // 제목 레이블 
		title.setFont(new Font("굴림", Font.BOLD, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);

		titlePanel.add(top);
		titlePanel.add(title); 

	} // 제목 패널 끝

	private void initCalndPanel() { // 본문 패널 설정

		calndPanel = new JPanel(new GridLayout(5, 0, 30, 40)); 

		// ----- 일정 등록하기 (일정명 입력) -----
		name = new JTextField("일정명", 50);
		name.setColumns(5); 
//		name.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정 
		name.setBorder(null);
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
				} name.setForeground(Color.BLACK); 
			}
		});

		calndPanel.add(name); 

		// ----- 일정 시작지점 등록하기 -----
		start = new JTextField("시작");
//		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		start.setBorder(null); 
		start.setBackground(Color.white);
		start.setEditable(false);

		calndPanel.add(start); 

		// 날짜 or 시간 부분 클릭하면  키보드 입력으로 수정 가능하도록 하기 

		// ----- 일정 종료지점 등록하기 -----
		end = new JTextField("종료");
//		end.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		end.setBorder(null);
		end.setEditable(false);
		end.setBackground(Color.white);
		calndPanel.add(end); 

		// ----- 상대방과 공유하기 -----
		// 공유하기 텍스트
		share = new JTextField("상대방과 공유");
//		share.setFont(new Font(null, Font.BOLD, 12)); // 폰트 지정
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 

		calndPanel.add(share);

		// 공유하기 버튼 

		// ----- 기념일로 지정 설정 -----
		anny = new JTextField("기념일로 지정");
//		anny.setFont(new Font(null, Font.BOLD, 12)); // 폰트 지정
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);
		anny.setEditable(false); 
		calndPanel.add(anny); 
	}

	private void initButPanel() {

		butpanel = new JPanel();
		butpanel.setLayout(new GridLayout(0, 4, 30, 15));

		// --- 일정 등록하기 버튼 ---
		left = new JLabel(); 
		okbut = new JButton("등록"); 
		okbut.setBackground(Color.white);
		okbut.setBorderPainted(false);
		butpanel.add(left);
		butpanel.add(okbut);

		// --- 일정 등록 취소하기 버튼 ---
		right = new JLabel();
		nobut = new JButton("취소"); 
		nobut.setBackground(Color.white);
		nobut.setBorderPainted(false);
		butpanel.add(nobut); 
		butpanel.add(right);
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// CancelConfirm 창 호출
			}
		});

		bottom = new JLabel("");
		butpanel.add(bottom, BorderLayout.SOUTH); 
		
	}
	
	
	public static void main(String[] args) {

		new CalendarAdd_Grid(); 
		
	}

}