package event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventEx_08_MouseWheelEvent 
extends JFrame implements MouseWheelListener{

	private JTextArea area; 
	private JTextField txt; 

	public EventEx_08_MouseWheelEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KeyEvent");

		addMouseWheelListener(this); 
		
//		addMouseListener(new MouseAdapter() {
//		});   마우스 동작 구현에 편리한 방법 
	
		setVisible(true);
	} 

	
	public static void main(String[] args) {
		new EventEx_08_MouseWheelEvent();
	}


	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println(e.getWheelRotation()); // 위로 스크롤은 -n, 아래로 스크롤은 +n 
	}
	
}

