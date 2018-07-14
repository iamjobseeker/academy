package event;

import java.awt.Color;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventEx_05_KeyEvent 
extends JFrame implements KeyListener{

	private JTextArea area; 
	private JTextField txt; 

	public EventEx_05_KeyEvent() { 
		setBounds(1000, 50, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("KeyEvent");

		area = new JTextArea();
//		area.setEditable(false);
		area.setBackground(Color.GRAY);
		add(area, "Center");
		
		txt = new JTextField();
		add(txt, "South");
		
		txt.addKeyListener(this); 

		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx_05_KeyEvent();
	}


	@Override
	public void keyTyped(KeyEvent e) {
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("Àü¼Û");
			
			String str = txt.getText();
			
			area.setText(area.getText() + '\n' + str);
			
			txt.setText(""); 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	} 
}
