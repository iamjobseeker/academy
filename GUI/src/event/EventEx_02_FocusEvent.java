package event;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx_02_FocusEvent 
	extends JFrame implements FocusListener{
	
	public EventEx_02_FocusEvent() {
		setTitle("FocusEvent02"); 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout()); 
		
		add(new JButton("1")); 
		JButton btn2 = new JButton("2"); 
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx_02_FocusEvent();
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("focus gained"); // 대상을 클릭하고 있을때 
		
		FocusManager fm = FocusManager.getCurrentManager();
		fm.focusPreviousComponent(); 
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("focus lost"); // 다른 대상을 클릭했을 때
	}
}
