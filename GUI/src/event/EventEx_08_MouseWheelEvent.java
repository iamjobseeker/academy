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
//		});   ���콺 ���� ������ ���� ��� 
	
		setVisible(true);
	} 

	
	public static void main(String[] args) {
		new EventEx_08_MouseWheelEvent();
	}


	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println(e.getWheelRotation()); // ���� ��ũ���� -n, �Ʒ��� ��ũ���� +n 
	}
	
}

