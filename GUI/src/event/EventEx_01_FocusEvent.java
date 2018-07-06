package event;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;

public class EventEx_01_FocusEvent 
	extends JFrame implements FocusListener{ // FocusListener ���
	
	public EventEx_01_FocusEvent() { // ������ 
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
		System.out.println("focus gained"); // �����츦 Ŭ���ϰ� ������ 
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("focus lost"); // �ٸ� ȭ���� Ŭ���ϰ� ������
	}
}
