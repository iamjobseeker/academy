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

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField; 

public class Addschedule_Null extends JFrame { 
	
	// 가로 사이즈 줄이고
	// 메모 기능 추가하기 

	// 본문 패널
	private JPanel pane = new JPanel();

	private Addschedule_Null() { // 생성자
		
		setTitle("일정 등록"); // 타이틀 
		setBounds(650, 50, 580, 650); // 크기 및 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 프레임 열기 
		
		Container root = getContentPane();

		// ----- 프레임 설정 ----- 
		setResizable(false); // 크기 조정 불가능 
		pane.setLayout(null); // 널 레이아웃 
//		pane.setBackground(new Color(255, 245, 238)); 

		// ----- 전체 제목 -----
		JLabel title = new JLabel("일정 등록");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("굴림", Font.BOLD, 15));
		title.setText("일정 등록");
		pane.add(title); 
		
		// ----- 일정 등록하기 (일정명 입력) -----
		JTextField name = new JTextField();
		name.setBounds(20, 100, 500, 40); // 위치 설정 
//		name.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정 

		// place holder
		name.setText("일정명"); // 초기 텍스트 
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

		pane.add(name);

		// ----- 일정 시작지점 등록하기 -----
		JTextField start = new JTextField();
		
		start.setBounds(20, 180, 500, 40); // 위치 설정
//		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
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
		
		pane.add(start); 

		// -------------------------------------------

		// ----- 일정 종료지점 등록하기 -----
		JTextField end = new JTextField();

		end.setBounds(20, 260, 500, 40); // 위치 설정
//		end.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
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

		pane.add(end); 

		// ----- 상대방과 공유하기 -----
		// 상대방과 공유하기 텍스트
		JTextField share = new JTextField("상대방과 공유");

		share.setBounds(20, 340, 350, 40); 
//		share.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		share.setBackground(Color.WHITE); 

		// 상자 라인색상 변경( ) 

		share.setEditable(false); 
		

		// 상대방과 공유하기 버튼 
		JCheckBox share2 = new JCheckBox("공유하기"); 
		
		share2.setBounds(400, 340, 80, 40); 
//		share2.setForeground(new Color(255, 182, 193));
		share2.setSelected(true); 
	
		pane.add(share);
		pane.add(share2);

		// ----- 기념일로 지정 설정 -----
		// 기념일로 지정 텍스트
		JTextField anny = new JTextField("기념일로 지정");

		anny.setBounds(20, 420, 350, 40); 
//		anny.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		anny.setBackground(Color.WHITE); 

		// 상자 라인색상 변경( ) 
		anny.setEditable(false); 
		
		// 기념일로 지정 버튼
		JCheckBox anny2 = new JCheckBox("기념일 지정");
		
		anny2.setBounds(400, 420, 100, 40);
//		anny2.setForeground(new Color(255, 182, 193));
		
		pane.add(anny);
		pane.add(anny2); 

		// -------------------------------------------

		// --- 일정 등록하기 버튼 ---
		JButton okbut = new JButton("등록");
		okbut.setBounds(150, 530, 100, 50);
		pane.add(okbut);

		// --- 일정 등록 취소하기(창 닫기) 버튼 ---
		JButton nobut = new JButton("취소");
		nobut.setBounds(350, 530, 100, 50); 
		pane.add(nobut); 
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// --- 등록 취소 대화상자 ---
				JFrame c_frame = new JFrame("확인창");
				c_frame.setBounds(1200, 50, 250, 200); 
				
				// 레이블 
				JLabel c_lbl = new JLabel("일정 등록을 취소하시겠습니까?"); 
				c_lbl.setBounds(30, 30, 200, 50); 
				 
				// 확인 및 취소 버튼
				JButton c_okbut = new JButton("확인");
				c_okbut.setBounds(30, 90, 70, 40);
				JButton c_nobut = new JButton("취소");
				c_nobut.setBounds(140, 90, 70, 40);
				
				JPanel c_pane = new JPanel();
				c_pane.setLayout(null);
				
				c_pane.add(c_lbl); 
				c_pane.add(c_okbut);
				c_pane.add(c_nobut); 
				
				c_frame.add(c_pane); 
				
				
				c_frame.setVisible(true);
				

				
				c_nobut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c_frame.dispose();
					}
				});
				
				c_okbut.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0); 
					}
				});
		
			}
		});

		root.add(pane); 
		
		setVisible(true);

		okbut.requestFocus(); // 버튼이 포커스 획득 
	} 


	public static void main(String[] args) {

		new Addschedule_Null(); 
	}



}