package mini;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener; 

public class Addschedule_Null extends JFrame { 
	// 메인 프레임
	private Container root; 
	private Date focusDate;
	// 본문 패널 
	private JPanel pane = new JPanel();
	// 제목 패널 
	private JLabel title; // 제목 레이블  
	// 본문 패널
	private JTextField name; // 일정명 텍스트필드
	private JTextField start; // 일정시작 텍스트필드
	private JTextField end; // 일정 종료 텍스트필드
	private JTextField share; // 일정 공유 텍스트필드
	private JTextField anny; // 기념일지정 텍스트필드 
	// 버튼 패널 
	private JButton okbut; // 등록 버튼
	private JButton nobut; // 취소 버튼  
//	private int focusDate;

	Addschedule_Null( ) { // 생성자

		setTitle("일정 추가"); // 타이틀 
		setBounds(650, 50, 400, 650); // 크기 및 위치
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 프레임 열기 
		
		root = getContentPane();

		setResizable(false);
		pane.setLayout(null); // 널 레이아웃 
		//		pane.setBackground(new Color(255, 245, 238));  

		initTitlePanel(); // 제목 패널
		initCalndPanel(); // 본문 패널
		initButPanel(); // 버튼 패널  

	} // 생성자 

	private void initTitlePanel() {

		// ----- 전체 제목 -----
		title = new JLabel("일정 등록");
		title.setBounds(0, 40, 400, 20); 
		title.setFont(new Font("굴림", Font.BOLD, 15));
		title.setText("일정 등록");
		title.setHorizontalAlignment(SwingConstants.CENTER); 
		pane.add(title); 

		// ----- 일정 등록하기 (일정명 입력) -----
		name = new JTextField();
		name.setBounds(20, 100, 350, 50); // 위치 설정 
		//		name.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정 

		// place holder
		name.setText("일정명"); // 초기 텍스트 
		name.setForeground(Color.GRAY); 
		name.setBorder(null);

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

	}

	private void initCalndPanel() {

		// ----- 일정 시작지점 등록하기 -----
		start = new JTextField();
		start.setEditable(false);
		start.setBounds(20, 180, 150, 50); // 위치 설정
		//		start.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		start.setText("시작");
		start.setBorder(null);
		start.setBackground(Color.white);

		pane.add(start); 

		// ---- 일정 시작날짜 지정하기 ----
		//		Date now = new Date(); // 현재의 날짜 및 시간 변수 
		Calendar calendar = Calendar.getInstance(); // 캘린더 객체 얻기
		Date value = calendar.getTime(); // 현재 시간 얻기
	
		calendar.add(Calendar.YEAR, -50); // 50년 전의 날짜 얻기
		Date date_minus = calendar.getTime(); //50년 전의 날짜를 최소 날짜로 지정

		calendar.add(Calendar.YEAR, +50); // 50년 뒤의 날짜 얻기 +50하면 현재날짜가됨.
		Date date_plus = calendar.getTime(); //50년 뒤의 날짜를 최대 날짜로 지정

		final SpinnerDateModel model = new SpinnerDateModel(value, date_minus, date_plus, Calendar.DAY_OF_WEEK); // 스피너 날짜 설정 
		JSpinner spinner = new JSpinner(model); 
		final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		spinner.setSize(200, 50);
		spinner.setLocation(170, 180); 
		spinner.setBorder(null);

		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner,"yyyy-MM-dd");
		JFormattedTextField ftf = editor.getTextField();
		ftf.setEditable(false); // 날짜 직접수정 불가  
		ftf.setHorizontalAlignment(JTextField.CENTER);

		ftf.setBackground(new Color(255, 255, 255)); 
		spinner.setEditor(editor); 
		spinner.addChangeListener(new ChangeListener() { // 변화이벤트 리스너
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t" 
							+ "next = " + df.format(next));
			}
		}); 

		pane.add(spinner);
		// -------------------------------------------

		// ----- 일정 종료지점 등록하기 -----
		end = new JTextField();
		end.setEditable(false);

		end.setBounds(20, 260, 150, 50); // 위치 설정
		//		end.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		end.setText("종료	");
		end.setBorder(null);
		end.setBackground(Color.white);

		pane.add(end); 

		// --- 일정 종료날짜 지정하기 ---  
		final SpinnerDateModel model2 = new SpinnerDateModel(value, date_minus, date_plus, Calendar.DAY_OF_WEEK); // 스피너 날짜 설정 
		JSpinner spinner2 = new JSpinner(model2); 
		spinner2.setSize(200, 50);
		spinner2.setLocation(170, 260); 
		spinner2.setBorder(null);

		JSpinner.DateEditor editor2 = new JSpinner.DateEditor(spinner2,"yyyy-MM-dd");
		JFormattedTextField ftf2 = editor2.getTextField(); 
		ftf2.setEditable(false); // 날짜 직접수정 불가  
		ftf2.setHorizontalAlignment(JTextField.CENTER);

		ftf2.setBackground(new Color(255, 255, 255)); 
		spinner2.setEditor(editor2); 
		spinner2.addChangeListener(new ChangeListener() { // 변화이벤트 리스너
			public void stateChanged(ChangeEvent e) {
				Date value = (Date) model.getValue();
				Date next = (Date) model.getNextValue();
				if (value != null && next != null)
					System.out.println("value = " + df.format(value) + "\t" 
							+ "next = " + df.format(next));
			}
		}); 

		pane.add(spinner2);

		// ----- 상대방과 공유하기 -----
		// 상대방과 공유하기 텍스트
		share = new JTextField("상대방과 공유");

		share.setBounds(20, 340, 350, 50); 
		//		share.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		share.setBackground(Color.WHITE); 
		share.setBorder(null);

		share.setEditable(false); 


		// 상대방과 공유하기 버튼 
		JCheckBox share2 = new JCheckBox("공유하기"); 

		share2.setBounds(400, 340, 80, 50); 
		//		share2.setForeground(new Color(255, 182, 193));
		share2.setSelected(true); 

		pane.add(share);
		pane.add(share2);

		// ----- 기념일로 지정 설정 -----
		// 기념일로 지정 텍스트
		anny = new JTextField("기념일로 지정");

		anny.setBounds(20, 420, 350, 50); 
		//		anny.setFont(new Font("굴림", Font.PLAIN, 15)); // 폰트 지정
		anny.setBackground(Color.WHITE); 
		anny.setBorder(null);

		// 상자 라인색상 변경( ) 
		anny.setEditable(false); 

		// 기념일로 지정 버튼
		JCheckBox anny2 = new JCheckBox("기념일 지정");

		anny2.setBounds(400, 420, 100, 50);
		//		anny2.setForeground(new Color(255, 182, 193));

		pane.add(anny);
		pane.add(anny2); 

		// -------------------------------------------
	}

	private void initButPanel() {

		// --- 일정 등록하기 버튼 ---
		okbut = new JButton("등록");
		okbut.setBounds(50, 530, 100, 50);
		okbut.setBorder(null);
		okbut.setBackground(Color.white);
		pane.add(okbut);

		// --- 일정 등록 취소하기(창 닫기) 버튼 ---
		nobut = new JButton("취소");
		nobut.setBounds(250, 530, 100, 50); 
		nobut.setBorder(null); 
		nobut.setBackground(Color.WHITE); 
		pane.add(nobut); 
		
		nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CancelConfirm(); 
			}
		});

//		nobut.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// --- 등록 취소 대화상자 ---
//				JFrame c_frame = new JFrame("확인창");
//				c_frame.setBounds(1200, 50, 250, 200); 
//
//				// 레이블 
//				JLabel c_lbl = new JLabel("일정 등록을 취소하시겠습니까?"); 
//				c_lbl.setBounds(30, 30, 200, 50); 
//
//				// 확인 및 취소 버튼
//				JButton c_okbut = new JButton("확인");
//				c_okbut.setBounds(30, 90, 70, 40);
//				JButton c_nobut = new JButton("취소");
//				c_nobut.setBounds(140, 90, 70, 40);
//
//				JPanel c_pane = new JPanel();
//				c_pane.setLayout(null);
//
//				c_pane.add(c_lbl); 
//				c_pane.add(c_okbut);
//				c_pane.add(c_nobut); 
//
//				c_frame.getContentPane().add(c_pane); 
//				c_frame.setVisible(true);
//
//				c_nobut.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						c_frame.dispose();
//					}
//				});
//
//				c_okbut.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						dispose();
//						c_frame.dispose(); 
//					}
//				});
//
//			}
//		});


		root.add(pane); 

		setVisible(true);

		okbut.requestFocus(); // 버튼이 포커스 획득 

	} 
	
//	public static void main(String[] args) {
//		new Addschedule_Null();
//	}

}