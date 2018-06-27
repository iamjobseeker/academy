package event;

import java.awt.FlowLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx_03_ComponentEvent 
	extends JFrame implements ComponentListener{
	
	public EventEx_03_ComponentEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ComponentEvent");
		
		addComponentListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx_03_ComponentEvent();
	}

	@Override
	public void componentResized(ComponentEvent e) { // 크기 변경
		System.out.println("Size changed");
		System.out.println(e);
	}

	@Override
	public void componentMoved(ComponentEvent e) { // 이동
		System.out.println("Moved");
		System.out.println(e);
	}

	@Override
	public void componentShown(ComponentEvent e) { // setvisible
		System.out.println("Visible True");
		System.out.println(e);
	}

	@Override
	public void componentHidden(ComponentEvent e) { // setvisible
		System.out.println("Visible False");
		System.out.println(e);
	}

}
