package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx_03_LayoutManager extends JFrame {

	private SwingEx_03_LayoutManager( ) { // 생성자 

		setTitle("LayoutManager Example"); // 윈도우 제목

		setLocation(1000, 50); // 위치
		setSize(500, 500); // 크기

		setDefaultCloseOperation(EXIT_ON_CLOSE); // 닫기

		// ---- 프레임 구성 작업 ---- ※ setVisible전에 설정하는게 좋음
		 FlowLayoutEx(); // 왼쪽, 오른쪽, 다음 줄 순서대로 배치
//		 BorderLayoutEx(); // 동서남북중앙에 배치 
		// GridLayoutEx(); // 행과 열을 가지는 표(테이블) 형식의 배치
		// ---------------------

		setVisible(true); // 보이기 ※ 마지막에 띄어주자
	}

	private void GridLayoutEx() { 
		//		setLayout(new GridLayout()); 
		//		setLayout(new GridLayout(3, 0)); // 행, 열
		//		setLayout(new GridLayout(0, 4)); 
		setLayout(new GridLayout(0, 3, 10, 20)); // 행, 열, 상하, 좌우간격

		JButton[] btn = new JButton[8];
		for(int i=0; i<btn.length; i++)
			btn[i] = new JButton("버튼"+(i+1)); 

		for(int i=0; i<btn.length; i++) {
			add(btn[i]); 
		}

		btn[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 눌렀을 때
				btn[0].setText("꽝");
			}

		});
		
		btn[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 눌렀을 때
				btn[3].setText("당첨");
			}

		});


	}

	private void BorderLayoutEx() {
		//		setLayout(new BorderLayout() ); 
		setLayout(new BorderLayout(30, 15) ); // 상하좌우 간격주기

		JButton[] btn = new JButton[5];
		for(int i=0; i<btn.length; i++)
			btn[i] = new JButton("버튼"+(i+1)); 

		// 메뉴바, 메인화면, 채팅목록 등을 적을때
		add(btn[0], "East"); 
		add(btn[1], "West");
		add(btn[2], "Center");
		add(btn[3], BorderLayout.NORTH);
		add(BorderLayout.SOUTH, btn[4]);
	}

	private void FlowLayoutEx() {
		setLayout(new FlowLayout() ); // 기본 alignment default는 CENTER 
		//		setLayout(new FlowLayout(FlowLayout.RIGHT) ); 
		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40) ); // 정렬, 좌우, 상하 간격

		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5555555 (❀╹◡╹)")); 
		add(new JButton("버튼6"));
		add(new JButton("버튼7"));
		// 1. 텍스트에 따라 버튼 크기가 달라진다 
		// 2. add 순서대로 버튼이 생긴다  

		JButton btn = new JButton("버튼8");
		//		btn.setSize(200, 200); // layoutmanager가 최종적으로 버튼의 크기를 정함
		btn.setPreferredSize(new Dimension(200, 200)); // 버튼 크기결정 우선권을 부여받음
		// 버튼 크기결정 우선권 prefferedSize>layoutmanager>setSize
		add(btn);
	}

	public static void main(String[] args) {
		new SwingEx_03_LayoutManager();

	}


}
