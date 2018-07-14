package event;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;

public class EventEx_01_FocusEvent 
	extends JFrame implements FocusListener{ // FocusListener 상속
	
	public EventEx_01_FocusEvent() { // 생성자 
		setTitle("FocusEvent01");
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addFocusListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx_01_FocusEvent();
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("focus gained"); // 윈도우를 클릭하고 있을때 
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("focus lost"); // 다른 화면을 클릭하고 있을때
	}
}
