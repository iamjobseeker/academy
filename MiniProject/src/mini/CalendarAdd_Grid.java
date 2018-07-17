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
	// 메인 
	private Container root; 
	// 제목 패널
	private JPanel titlePanel;
	private JLabel top; // 위치 조정용 레이블
	private JLabel title; // 제목 레이블  
	private String[] split;
	// 본문 패널
	private JPanel calndPanel; 
	private JTextField name; // 일정명 텍스트필드

	private JScrollPane hourScroll;
	private JList<String> hourList; 
	
	private JTextField memo; // 짧은 메모 

	private JComboBox<String> share; 
	private JComboBox<String> anny;
	// 버튼 패널  
	private JPanel butpanel;
	private JLabel left; // 위치 조정용 레이블
	private JLabel right; // 위치 조정용 레이블
	private JLabel bottom; // 위치 조정용 레이블 
	public JButton okbut ; // 등록 버튼
	private JButton nobut; // 취소 버튼 
	// 왼오른쪽 패널
	private JLabel leftlabel; 
	private JLabel rightlabel;
	// 날짜 받아오기
	private String startTxt; // start에 들어갈 날짜텍스트
	private String year;  // 기본값 설정 
	private String month;
	private String day; 
	
	JDialog dialog = new ConfirmDialog(this, "사용자 다이얼로그", true, getX()+50, getY()+50);
	
	public CalendarAdd_Grid(String str) {
		if(str=="exit") {
			dispose();
		} else {
		this.startTxt = str;
		
		setBounds(650, 50, 500, 650); // 크기 및 위치
		
		initTitlePanel(); // 제목 패널
		initCalndPanel(); // 본문 패널
		initButPanel(); // 버튼 패널 
		
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
		okbut.requestFocus(); // 버튼이 포커스 획득 
		}
	} // 생성자 끝 
	
	public void Exit(int num) {
		if(num==999) { 
			dispose();
			System.out.println("종료"); // 실행됨 
		} 
	}
	
	private void initTitlePanel() { // 제목 패널 설정
		titlePanel = new JPanel(new GridLayout(2, 0));

		split = startTxt.split("-");
		year = split[0];
		month = split[1]; 
		day = split[2]; 

		top = new JLabel(""); // 위치 조정용 레이블
		title = new JLabel(year+"년 "+month+"월 "+day+"일의 일정등록"); // 제목 레이블 
		title.setFont(new Font("굴림", Font.BOLD, 17));
		title.setHorizontalAlignment(SwingConstants.CENTER);

		titlePanel.add(top); 
		titlePanel.add(title); 
	} // 제목 패널 끝
	
	private void initCalndPanel() { // 본문 패널 설정
		calndPanel = new JPanel(new GridLayout(5, 0, 30, 60)); 

		// ----- 일정 등록하기 (일정명 입력) -----
		name = new JTextField("일정명", 50);
		name.setColumns(5); 
		name.setPreferredSize(new Dimension(500, 50));
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

		// ----- 시간 -----
		String[] hourArray = {"AM 12:00", "AM 12:30", "AM 1:00", "AM 1:30", "AM 2:00", "AM 2:30", "AM 3:00", "AM 3:30", "AM 4:00",
				"AM 4:30"};
		// 위, 아래 시간도 보이도록 하기 
		hourScroll = new JScrollPane();
		hourList=new JList<>(hourArray);
		hourScroll.setViewportView(hourList);
		calndPanel.add(hourScroll); 
		
		// ----- 메모 -----
		memo = new JTextField("메모");
		memo.setBorder(null);
		memo.setForeground(Color.GRAY);
		
		memo.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(memo.getText().isEmpty()) {
					memo.setText("메모");
					memo.setForeground(Color.GRAY);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(memo.getText().equals("메모")) {
					memo.setText("");
				} memo.setForeground(Color.black);
			}
		});
		
		calndPanel.add(memo);
		
		// ----- 날짜 -----
//		start = new JTextField(startTxt);
//		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
//		start.setPreferredSize(new Dimension(50, 100));
//		start.setBorder(null); 
//		start.setBackground(Color.white);
//		start.setEditable(false);
//
//		calndPanel.add(start); 

		// ----- 기념일로 지정  -----
		String annyTxt[]= {"스케쥴", "기념일"};
		anny = new JComboBox<String>(annyTxt);
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);
		anny.setEditable(false); 
		calndPanel.add(anny); 
		
		// ----- 상대방과 공유하기 -----
		String shareTxt[]= {"상대방과 공유", "공유하지 않기"};
		share = new JComboBox<String>(shareTxt);
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 
		calndPanel.add(share);
	} 

	private void initButPanel() {
		butpanel = new JPanel();
		butpanel.setLayout(new GridLayout(0, 4, 30, 15));

		// --- 일정 등록하기 버튼 ---
		left = new JLabel(); 
		okbut = new JButton("등록"); 
		okbut.setBackground(Color.white);
		okbut.setBorderPainted(false);
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 
				// ★ 파일 저장 
				try {
					if(name.getText().equals("일정명")) {
						new No(); // 일정명 입력하지 않으면 저장이 되지 않음 
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
					 		+ txtArray[4]+"\n"); // 파일에 저장 
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
//				JOptionPane.showMessageDialog(null, "test", "테스트", JOptionPane.QUESTION_MESSAGE);
				Confirm con = new Confirm();
				
//				if(con.Press()==999) {
//					System.out.println("999눌림");
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