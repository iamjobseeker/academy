package swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx_02_MyFrame extends JFrame  { // JFrame을 상속받아 클래스자체가 창인 것처럼 작성한다

	// 레이블 1개
	private JLabel lbl;
	// 버튼 2개 
	private Button btn1; // 그냥 버튼
	private JButton btn2; // J버튼
	private JButton btn3; // J버튼

	// private생성자, 다른 사람의 임의변경 금지
	private SwingEx_02_MyFrame() { // 생성자 

		// 제목 표시줄 
		setTitle("GUI Program");

		// 위치와 크기 
		setLocation(500, 200);
		setSize(500, 500);

		// 닫기 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		// 배치관리자 
		setLayout(new GridLayout(2, 2)); 

		// 컴포넌트 설정  		// 이벤트 설정 
		initFrame(); 		initEvent();

		// 보여지기
		setVisible(true); 

	} // 생성자 끝 
	
	private void initFrame() { 
		// 레이블 1개, 버튼 3개 생성
		lbl = new JLabel("레이블 입니다.");
		lbl.setHorizontalAlignment(JLabel.CENTER); // 가운데 정렬, CENTER는 상수(=0)
												   // Sets the alignment of the label's contents along the X axis. 
		btn1 = new Button("버튼1(awt) 입니다."); 
		btn2 = new JButton("버튼2(swing) 입니다.");
		btn3 = new JButton("버튼3(swing) 입니다.");

		// 프레임에 버튼 추가
		add(btn1); // Awt는 Swing의 부모클래스 
		add(btn2);
		add(btn3); 
		add(lbl);
	} 

	private void initEvent() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText(""); 
				lbl.setForeground(Color.red); // 왜 안되지...
			}
		}); 

		// 버튼이 눌리면 레이블에 텍스트가 보이도록 작성
		// btn2 -> 버튼2에요!!
		// btn3 -> 버튼3에요!!
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("버튼2 에요!!");
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("버튼3 이에요!!");
			}
		});
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame(); 

	}

}
