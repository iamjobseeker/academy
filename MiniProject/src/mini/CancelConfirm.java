package mini;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CancelConfirm extends JFrame{

	JLabel c_label;
	JButton c_okbut;
	JButton c_nobut;
	
	private CancelConfirm() { // 생성자 
		
		setTitle("확인창");
		setBounds(1200, 50, 250, 200); 
		setResizable(false);
		
		JPanel c_pane = new JPanel();
		c_pane.setLayout(null);
		
		// 레이블 
		c_label = new JLabel("일정 등록을 취소하시겠습니까?"); 
		c_label.setBounds(30, 30, 200, 50); 

		// 확인 및 취소 버튼
		c_okbut = new JButton("확인"); // 취소하기 확인(cancel_ok)
		c_okbut.setBounds(30, 90, 70, 40);
		c_okbut.setBorderPainted(false);
		c_okbut.setBackground(Color.white);
		
		c_nobut = new JButton("취소"); // 취소하지 않기(cancel_cancel)
		c_nobut.setBounds(140, 90, 70, 40);
		c_nobut.setBorderPainted(false);
		c_nobut.setBackground(Color.WHITE);
		
		c_pane.add(c_label); 
		c_pane.add(c_okbut);
		c_pane.add(c_nobut); 

		add(c_pane); 
		setVisible(true);
		
		//취소 확인창 이벤트
		c_nobut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 확인창 종료 
				
			}
		});

		c_okbut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 확인창만 종료
				System.exit(0); // 일정 등록창도 종료
				
			}
		});
}

	public static void main(String[] args) {
		new CancelConfirm();
	}
}
