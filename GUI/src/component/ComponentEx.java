package component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentEx extends JFrame {

	public ComponentEx() { // 생성자 시작 
		setBounds(1000, 500, 100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null); 

		/* Class KeyAdapter 

 An abstract adapter class for receiving keyboard events. 
 The methods in this class are empty. 
 This class exists as convenience for creating listener objects. 

Extend this class to create a KeyEvent listener 
and override the methods for the events of interest. 

(If you implement the KeyListener interface, you have to define all of the methods in it. 
This abstract class defines null methods for them all, 
so you can only have to define methods for events you care about.) 

Create a listener object using the extended class and 
then register it with a component using the component's addKeyListener method. 
When a key is pressed, released, or typed, 
the relevant method in the listener object is invoked, and the KeyEvent is passed to it.
		 */
		

			/* Class KeyEvent 

An event which indicates that a keystroke occurred in a component. 

This low-level event is generated by a component object (such as a text field) 
when a key is pressed, released, or typed. 

The event is passed to every KeyListener or KeyAdapter object 
which registered to receive such events using the component's addKeyListener method. 
(KeyAdapter objects implement the KeyListener interface.) 
Each such listener object gets this KeyEvent when the event occurs. 
			 */

			addKeyListener(new KeyAdapter() { 
				
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) { // getKeyCode: Returns the integer keyCode associated with the key in this event.
				
				case KeyEvent.VK_0: System.out.println("0 눌림"); break;

				case KeyEvent.VK_1: jTextAreaEx(); break;

				case KeyEvent.VK_2: jTextfieldEx(); break;

				case KeyEvent.VK_3: jPasswordFieldEx(); break;

				case KeyEvent.VK_4: jButtonEx(); break; 
				
				case KeyEvent.VK_5: jCheckBoxEx(); break;
				} 
				
			}
		}); 

		setVisible(true); 

	} // 생성자 끝

	private void jTextAreaEx() {
		JTextArea txtArea = new JTextArea(); 
		txtArea.setColumns(40); // 너비 
		txtArea.setRows(5); // 높이

		txtArea.setLineWrap(true); // 자동개행 

		txtArea.setEditable(true); // 수정여부

		txtArea.setText("안녕하세요");

		String str = txtArea.getText(); // area의 텍스트를 가져옴 
		System.out.println(str); 
		
		newJFrame(txtArea); // 밍? 
	}

	private void newJFrame(JComponent c) { // JComponent는 JTextArea의 부모클래스
		JFrame frame = new JFrame("컴포넌트 테스트");
		frame.setBounds(1000, 300, 500, 500);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

		// 이미지파일 객체 
		ImageIcon img = new ImageIcon("./src/component/mi.jpg");
		JPanel pane1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				g.drawImage(img.getImage(), 0, 0, 
						getSize().width, getSize().height, null); // 판넬의 화면 크기 

				setOpaque(false); // 배경을 원래 색으로 칠함 

				super.paintComponent(g); 
			}
		};

		//		JPanel pane = new JPanel();
		//		pane.add(c); 
		//		frame.getContentPane().add(pane); 

		pane1.add(c);
		frame.getContentPane().add(pane1);

		frame.setVisible(true); 
	}

	private void jTextfieldEx() {
		JTextField txt = new JTextField();
		txt.setColumns(10); // 너비 

		// --- Placeholder --- 
		txt.setText("ID를 입력하세요");
		txt.setForeground(Color.GRAY); 

		txt.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// JTextField에서 포커스를 잃으면 Placeholder
				if(txt.getText().isEmpty()) {
					txt.setText("ID를 입력하세요");
					txt.setForeground(Color.gray);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				// JTextField에 포커스가 넘어가면 Text 지우기
				if(txt.getText().equals("ID를 입력하세요")) {
					txt.setText("");
					txt.setForeground(Color.BLACK); 
				}

			}
		});

		//
		JPanel pane = new JPanel();
		pane.add(txt);

		JButton btn = new JButton("로그인"); 
		pane.add(btn); 

		newJFrame(pane);

		// 화면을 띄우는 newJFrame() 메소드 이후 호출해야 함
		btn.requestFocus(); // 버튼이 포커스 획득 
		//

	}

	private void jPasswordFieldEx() { 
		JPasswordField pass = new JPasswordField("TEST", 20);

//		System.out.println(pass.getText()); deprecated
		System.out.println(pass.getPassword()); 

		newJFrame(pass); 
	}

	private void jButtonEx() {
		JButton btn = new JButton("버튼"); 

		btn.setToolTipText("전송합니다");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				System.out.println("Button Clicked!!!");
			}
		});

		btn.setPreferredSize(new Dimension(300, 400));

		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick(); 

		newJFrame(btn);
	}
	
	private void jCheckBoxEx() {
		JCheckBox check = new JCheckBox("아이스 아메리카노");
		JCheckBox check2 = new JCheckBox("수박주스");
		JCheckBox check3 = new JCheckBox("아이스초코");
		
		JPanel pane2 = new JPanel();
		pane2.add(check);
		pane2.add(check2);
		pane2.add(check3); 
	
		newJFrame(pane2);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new ComponentEx();
	}
}
