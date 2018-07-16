package HMini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.rmi.activation.ActivationInstantiator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants; 

public class CalendarAdd_Grid extends JFrame { 
	// 메인 
	private Container root; 
	// 제목 패널
	private JPanel titlePanel;
	private JLabel top; // 위치 조정용 레이블
	private JLabel title; // 제목 레이블  
	// 본문 패널
	private JPanel calndPanel; 
	private JTextField name; // 일정명 텍스트필드
	private JTextField start; // 일정시작 텍스트필드
	private String startTxt; // start에 들어갈 날짜텍스트
	private JComboBox<String> share;
	private JComboBox<String> anny;
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
	
	public CalendarAdd_Grid(String str) {
		this.startTxt = str; // 달력에서 날짜 받아오기
		setTitle("일정 등록"); // 타이틀 
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
		calndPanel = new JPanel(new GridLayout(4, 0, 30, 60)); 

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

		// ----- 날짜 -----
		start = new JTextField(startTxt);
//		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		start.setPreferredSize(new Dimension(50, 100));
		start.setBorder(null); 
		start.setBackground(Color.white);
		start.setEditable(false);

		calndPanel.add(start); 

		// ----- 상대방과 공유하기 -----
		String shareTxt[]= {"상대방과 공유", "공유하지 않기"};
		share = new JComboBox<String>(shareTxt);
		share.setBackground(Color.WHITE); 
		share.setBorder(null);
		share.setEditable(false); 
		calndPanel.add(share);

		// ----- 기념일로 지정  -----
		String annyTxt[]= {"일정", "기념일"};
		anny = new JComboBox<String>(annyTxt);
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
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ★ 파일 저장 
				try {
					String[] txtArray=new String[4];
					txtArray[0]=start.getText();
					txtArray[1]=name.getText();
					txtArray[2]=(String) share.getSelectedItem();
					txtArray[3]=(String) anny.getSelectedItem(); 
					
					String path = "./src/HMini/memo";
					File file = new File(path);
					FileWriter writer = new FileWriter(file, true); 
					// 일정명 미 입력시 "일정명을 입력하세요" 창 뜨고 파일 저장 안하기 
					writer.write(txtArray[0]+"\t"
							+ txtArray[1]+"\t"
							+ txtArray[2]+"\t"
					 		+ txtArray[3]+"\n");
					writer.flush();
					writer.close(); 
					new Ok();
				} catch (Exception e2) {
				}

				// 종료하기
				dispose();
				
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
				// CancelConfirm 창 호출
			}
		});

		bottom = new JLabel("");
		butpanel.add(bottom, BorderLayout.SOUTH); 
		
	}
	
	
	
//	public static void main(String[] args) {
//
//		new CalendarAdd_Grid(); 
//		
//	}

}