package HMini;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class Null extends JFrame {  

	// 본문 패널
	private JPanel pane = new JPanel();
	private Container root;

	// ★ 레이블 및 버튼
	private JLabel title;  // 제목 레이블
	private JTextField name;  // 일정명
	private JTextField date;
	private JComboBox<String> share;
	private JComboBox<String> anny;
	private JButton okbut;
	private JButton nobut;

	// ★ 객체화
	private CalendarView cv; 
	// ★ 추가
	private String username = "우성";
	private String todo; 
	String txtDate;
	private String[] txtArray;
	
	public String getTxtDate() {
		return txtDate;
	}
	
	public String[] initOkbut() {
		// --- 일정 등록하기 버튼 --- 
		okbut = new JButton("등록");
		okbut.setBounds(150, 530, 100, 50);
		okbut.setBackground(new Color(255, 240, 245));
		okbut.setBorderPainted(false);
		okbut.setFocusPainted(false);
		okbut.setForeground(Color.gray);
		
		okbut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ★ 파일 저장 
				try {
					String txtName = name.getText();
					String txtShare = (String) share.getSelectedItem();
					String txtAnny = (String) anny.getSelectedItem();
					txtDate=getTxtDate();
					txtArray=new String[4];
					txtArray[0]=txtDate;
					txtArray[1]=txtName;
					txtArray[2]=txtShare;
					txtArray[3]=txtAnny; 
					String path = "./src/HMini/memo";
					File file = new File(path);
					FileWriter writer = new FileWriter(file, true); 
					writer.write(txtArray[0]); // 테스트용
//					writer.write(txtDate+"\t"
//							+ txtName+"\t"
//							+ txtShare+"\t"
//							+ txtAnny+"\n" );
					writer.flush();
					writer.close(); 
					new Ok();
				} catch (Exception e) {
				}

				// 종료하기
				dispose();
			}
		});
		
		pane.add(okbut);
		return txtArray;
		
		}

	public Null(String str) { // 생성자 

		txtDate=str;
	
		setTitle("일정 등록"); // 타이틀 
		setBounds(650, 50, 450, 650); // 크기 및 위치
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 종료

		// ----- 프레임 설정 ----- 
		setResizable(false); // 크기 조정 불가능 
		pane.setLayout(null); // 널 레이아웃  
		//		pane.setBackground(new Color(255, 245, 238)); 

		// ----- 전체 제목 -----
		title = new JLabel("일정 등록");
		title.setBounds(250, 40, 100, 20); 
		title.setFont(new Font("굴림", Font.BOLD, 15));  
		title.setText("일정 등록");
		pane.add(title); 

		// ----- 일정 등록하기 (일정명 입력) -----
		name = new JTextField();
		name.setBounds(20, 100, 350, 40); // 위치 설정 
		name.setBorder(null); // 외곽선 투명 
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

		// ★ 일정 날짜 받아오기 
		JTextField date = new JTextField(txtDate);
		date.setBounds(20, 200, 350, 40);
		date.setBackground(Color.white);
		date.setBorder(null);
		date.setEditable(false);
		pane.add(date);

		// ----- 상대방과 공유하기 -----
		// 상대방과 공유하기 텍스트
		String select[]= {"상대방과 공유", "공유하지 않기"};
		share = new JComboBox<String>(select);
		share.setBounds(20, 340, 350, 40); 
		share.setEditable(false); 

		pane.add(share);

		// --- 기념일 지정  ---
		String select2[]= {"기념일 지정하지 않음", "기념일 지정"};
		anny = new JComboBox<String>(select2);
		anny.setBounds(20, 430, 350, 40); 
		anny.setEditable(false); 

		pane.add(anny);

		// --- 일정 등록 취소하기(창 닫기) 버튼 ---
		nobut = new JButton("취소");
		nobut.setBounds(350, 530, 100, 50); 
		nobut.setBackground(new Color(255, 240, 245));
		nobut.setBorderPainted(false);
		nobut.setFocusPainted(false);
		nobut.setForeground(Color.gray);
		pane.add(nobut); 

		root=getContentPane();
		add(pane);
		initOkbut();
		setVisible(true);
		okbut.requestFocus(); 
	}
	
//	
//	public static void main(String[] args) {
//		new Null();
//		
//	}
	
}