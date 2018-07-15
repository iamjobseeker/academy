package HMini;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ok {
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private Container root;
	private JButton button;
	private Null nul;
	
	public Ok() {
		frame = new JFrame("일정 등록확인");
		frame.setBounds(1000, 50, 250, 200);
		frame.setResizable(false);
		root = frame.getContentPane();
		
		label=new JLabel("일정이 등록되었습니다.");
		label.setBounds(45, 40, 200, 50);
		button = new JButton("확인");
		button.setBounds(80, 100, 70, 40);
		button.setBackground(Color.WHITE);
		button.setBorder(null); 
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose(); 
				
			}
		});
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
