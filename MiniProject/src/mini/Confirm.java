package mini;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Confirm { 
	private JFrame cframe; 
	private JPanel cpane;
	private JLabel cLabel;
	private JButton okbut;
	private JButton nobut; 
	
	private int num;

	public int Press() {
		okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cframe.dispose();
				
				num = 1;
				// 일정등록창도 함께 종료 
			} 
		});
		
		return 998+num; 
	}
	
	public Confirm() { // 생성자
	// --- 등록 취소 대화상자 ---
	cframe = new JFrame("확인창");
	cframe.setBounds(1200, 50, 250, 200); 
	cframe.setResizable(false);
	cframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	// 레이블 
	cLabel = new JLabel("일정 등록을 취소하시겠습니까?"); 
	cLabel.setBounds(30, 30, 200, 50); 

	
	// 확인 및 취소 버튼
	okbut = new JButton("확인"); // 취소하기 확인
	okbut.setBounds(30, 90, 70, 40);
	okbut.setLayout(null);
	okbut.setBackground(Color.WHITE);
	okbut.setBorder(null);
	
	Press();
	
	nobut = new JButton("취소"); // 취소하지 않기
	nobut.setBounds(140, 90, 70, 40);
	nobut.setLayout(null);
	nobut.setBackground(Color.white); 
	nobut.setBorder(null); 
	nobut.addActionListener(new ActionListener() {
		
		@Override 
		public void actionPerformed(ActionEvent e) {
			cframe.dispose();
		}
	});

	cpane = new JPanel();
	cpane.setLayout(null);

	cpane.add(cLabel); 
	cpane.add(okbut);
	cpane.add(nobut); 

	cframe.add(cpane); 
	cframe.setVisible(true);
	} // 생성자 end
	
//	public static void main(String[] args) {
//		new Confirm();
//	}
	
}
