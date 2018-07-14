package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventEx_06_MouseEvent 
extends JFrame implements MouseListener{

	private JTextArea area; 
	private JTextField txt; 

	public EventEx_06_MouseEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KeyEvent");

		addMouseListener(this); 
	
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("Clicked");
		System.out.println("¹öÆ°: " + e.getButton()); 
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("Pressed");
		System.out.println("Screen: " + e.getXOnScreen()+","+e.getYOnScreen());
		System.out.println("Component: " + e.getX()+","+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited"); 
	}

	public static void main(String[] args) {
		new EventEx_06_MouseEvent();
	}
	
}

