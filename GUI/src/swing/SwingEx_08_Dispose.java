package swing;

import javax.swing.JFrame;

public class SwingEx_08_Dispose extends JFrame {
	public SwingEx_08_Dispose() { // 생성자
		setBounds(900, 300, 600, 400); 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 종료시키면 자신의 창만 종료시킨다 
		setTitle("Original");
		
		// 윈도우 추가
		JFrame another = new JFrame();
		another.setBounds(800, 200, 600, 400);
		another.setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료시키면 모든 창을 종료시킨다
		another.setVisible(true);
		another.setTitle("another"); 
		// 윈도우 추가 완료
		
		setVisible(true); 
	} // 생성자 끝
	
	public static void main(String[] args) {
		new SwingEx_08_Dispose(); 
	}
}

