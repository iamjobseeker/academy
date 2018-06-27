package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventEx_07_MouseMotionEvent 
extends JFrame implements MouseMotionListener{

	private JTextArea area; 
	private JTextField txt; 

	public EventEx_07_MouseMotionEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KeyEvent");

		addMouseMotionListener(this); 
	
		setVisible(true);
	} 

	@Override
	public void mouseDragged(MouseEvent e) { // Ŭ�����·� ������ ��
		System.out.println("Dragged");
		System.out.println("�巡��: " + e.getX()+","+e.getY());
	}
	

	@Override
	public void mouseMoved(MouseEvent e) { // ��Ŭ�����·� ������ �� 
		System.out.println("Moved");
		System.out.println("�̵�: " + e.getX()+","+e.getY());
	}

	public static void main(String[] args) {
		new EventEx_07_MouseMotionEvent();
	}

}

