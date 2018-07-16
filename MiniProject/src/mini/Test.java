package mini;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JPanel panel;
	private Container root;
	private JButton button;
	
	static String txt1 = "2018-7-16"; 
	static String txt2 = "2018-7-17";
	static String txt3 = "2018-7-18";
	static String txt4 = "2018-7-20";
	
	public Test() { 
		frame = new JFrame("Test");
		frame.setBounds(1000, 50, 600, 500);
		frame.setResizable(false);
		root = frame.getContentPane();
		
		tf1=new JTextField();
		tf1.setBounds(45, 40, 500, 50);
		tf2=new JTextField();
		tf2.setBounds(45, 130, 500, 50);
		tf3=new JTextField();
		tf3.setBounds(45, 210, 500, 50);
	
		panel=new JPanel();
		panel.setLayout(null);
		panel.add(tf1);
		panel.add(tf2);
		panel.add(tf3);
		root.add(panel);
		
		Filetest(); 
	
		frame.setVisible(true);
	}
	
	public void Filetest() {

		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/mini/memo"));
			String line =""; 
			while((line = in.readLine())!=null) { 
				if(line.contains(txt3)==true) { // ��¥�� ��ġ
					System.out.println(line); // �� �پ� ��� 
					if(tf1.getText().contains(txt3)==false) { // �� �ؽ�Ʈ�ʵ���
						tf1.setText(line); // �����߰�
						System.out.println("1��ĭ�� �߰�"); 
					} else if(tf2.getText().contains(txt3)==false) { // �� �ؽ�Ʈ�ʵ���
						tf2.setText(line);
						System.out.println("2��ĭ�� �߰�");
					} else if(tf3.getText().contains(txt3)==false) { // �� �ؽ�Ʈ�ʵ���
						tf3.setText(line);  
						System.out.println("3��ĭ�� �߰�");
					}
				}
			} 
			in.close();
		} catch (FileNotFoundException e2) {
			System.out.println("������ ã�� �� �����ϴ�");
			e2.printStackTrace();
		} catch (IOException e2) {
			System.out.println("����� ���� �߻�");
			e2.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test();
	}
}
