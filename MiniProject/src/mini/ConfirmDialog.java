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
	
	public ConfirmDialog( // ������ 
			JFrame owner,
			String title,
			boolean modal, // true: ���� �г� ���úҰ� 
			int x, int y ) {
		
		super(owner, title, modal);
		setLocation(x, y);
		
		setLayout(new GridLayout(2, 0));
		
		JLabel message = new JLabel("��������� ����Ͻðڽ��ϱ�?",
								JLabel.CENTER);
		add(message);
		
		JPanel pane = new JPanel();

		btnOk = new JButton("Ȯ��");
		btnCancel = new JButton("���");
		
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

