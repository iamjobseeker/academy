package swingEtc;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingEtc_03_ScrollPane extends JFrame {
	private SwingEtc_03_ScrollPane() {
		setBounds(1000, 50, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// JScrollPane
		JTextArea area = new JTextArea();
		
		JScrollPane scroll;
		scroll = new JScrollPane(
				area,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, // 필요할때만 스크롤바 보여주기
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // 항상 스크롤바 보여주기
		
		Container root = getContentPane();
		root.add(scroll);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEtc_03_ScrollPane();
	}
}

