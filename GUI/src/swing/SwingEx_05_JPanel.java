package swing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingEx_05_JPanel extends JFrame {
	
	private SwingEx_05_JPanel( ) {
		setTitle("JPanel Example");
		setBounds(1000, 50, 600, 400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		JPanel pan1 = new JPanel();
		
		pan1.add(new JButton("버튼1")); 
		pan1.add(new JButton("버튼2")); 
		pan1.add(new JButton("버튼3")); 
		
		add(pan1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEx_05_JPanel();
	}
	
	
	
	
	
	
	
	
}
