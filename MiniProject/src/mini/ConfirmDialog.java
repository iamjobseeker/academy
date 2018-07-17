package mini;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfirmDialog extends JDialog 
		implements ActionListener {
	
	private JButton btnOk;
	private JButton btnCancel;
	
	public ConfirmDialog( // 생성자 
			JFrame owner,
			String title,
			boolean modal, // true: 뒤쪽 패널 선택불가 
			int x, int y ) {
		
		super(owner, title, modal);
		setLocation(x, y);
		
		setLayout(new GridLayout(2, 0));
		
		JLabel message = new JLabel("일정등록을 취소하시겠습니까?",
								JLabel.CENTER);
		add(message);
		
		JPanel pane = new JPanel();

		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
		
		pane.add(btnOk);
		pane.add(btnCancel);
		
		add(pane);
		pack(); 
		
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btnOk ) {
//			System.exit(DISPOSE_ON_CLOSE);  
		} else if( e.getSource() == btnCancel ) {
			dispose();
		}
	}
}

