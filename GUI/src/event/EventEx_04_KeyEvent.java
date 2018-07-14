package event;

import java.awt.FlowLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx_04_KeyEvent 
extends JFrame implements KeyListener{

	public EventEx_04_KeyEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KeyEvent");

		addKeyListener(this);

		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) { // 키코드 타이핑
		//		System.out.println("Key Typed");
		System.out.println("Key Type: " + e.getKeyCode()); 
		//		System.out.println("Key Type: " + e.getKeyChar()); 
	}

	@Override
	public void keyPressed(KeyEvent e) { // 키코드가 아닌것 타이핑
		//		System.out.println("Key Pressed");
		System.out.println("Key Press: " + e.getKeyCode()); 
		//		System.out.println("Key Press: " + e.getKeyChar()); 	

		if(e.getKeyCode() == KeyEvent.VK_A) {
			System.out.println("A 눌림");
		} else if(e.isAltDown() && e.getKeyCode()==com.sun.glass.events.KeyEvent.VK_X) {
			System.out.println("시스템 종료");
			System.exit(0); 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { // 타이핑 해제
		System.out.println("Key Released");
	}

	public static void main(String[] args) {
		new EventEx_04_KeyEvent();
	} 
}
