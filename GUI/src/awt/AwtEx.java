package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtEx {

	private Frame fr;

	private Button btn1;
	private Button btn2; 

	private Label lbl;

	public AwtEx() {

		// --- 프레임(창, 컨테이너) 생성 --- 
		fr = new Frame("myFrame"); // 타이틀 지정
		fr.setVisible(true); 
		// ---------------------------

		// --- 프레임 설정 ---
		fr.setLayout(new GridLayout(3,1)); // 배치관리자, 3행 1열
		fr.setLocation(50, 300); // 프레임 위치, 픽셀 단위
		fr.setSize(500, 500); // 프레임 크기 
		// ---------------

		// --- 프레임 이벤트 설정 ---
		windowEvent(fr); 
		// --------------------

		// --- 컴포넌트 설정 ---
		showLabel();
		showButton(); 
		// -----------------

	} // 생성자 끝 

	// 메소드 시작 
	private void showLabel() {
		lbl = new Label(); // 레이블
		lbl.setText("동작을 선택해주세요"); // 레이블 텍스트

		lbl.setAlignment(Label.CENTER); // 가운데 정렬
		lbl.setBackground(Color.GRAY); // 배경색 회색 

		fr.add(lbl); // 프레임에 레이블 추가 
	}

	private void showButton() { 
		btn1 = new Button("실행"); // 버튼
		btn2 = new Button();
		btn2.setLabel("취소");

		// 버튼 이벤트
		buttonEvent(); 

		// 프레임에 버튼 추가
		fr.add(btn1);
		fr.add(btn2); 
	}

	private void buttonEvent() { 

		// 버튼1 이벤트 리스너
		btn1.addActionListener(new ActionListener() { // 클릭
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("실행하였습니다.");
			}
		});

		// 버튼2 이벤트 리스너
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("취소되었습니다."); 
			}
		});
	}

	// 윈도우 이벤트 등록 
	// 방법3. 한번에 호출 
	private void windowEvent(Frame fr) {

		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
	}

	public static void main(String[] args) {
		new AwtEx(); 
	}
}
