package HMini;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileOutput{
	// ���̾ƿ�
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JTextArea txtarea = new JTextArea();
	
	// ���� �Է�
	private String s="";
	private String name;
	private String date;
	private String share;
	private String anny;
	private ArrayList<String> list = new ArrayList<>();
	
	public FileOutput() { // ������ 
		readFile();
		
		frame.setBounds(100, 100, 500, 300); 
		txtarea.setSize(new Dimension(500, 300));
		txtarea.setText("�ؽ�Ʈ �ʵ�");
		for(String s:list) {
			txtarea.setText("\t"+s+"\t"); 
		}
		panel.setLayout(null);	
		panel.add(txtarea);
		frame.add(panel); 		
		frame.setVisible(true);
	}
	
	public void readFile() {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/HMini/memo")); 
			while((s=in.readLine())!=null) {
				String[] split = s.split("\t");
				date = split[0];
				name = split[1]; 
				share = split[2];
				anny = split[3]; 
//				// ���� �а� �����ٷ� �Ѿ�� 
				list.add(name);
				list.add(date);
				list.add(share);
				list.add(anny); 
				System.out.println(date); 
//				if(toString("2018-7-4")== date) {
//					System.out.println("����"); 
//				} else System.out.println("�𸣰���");
				
			}in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileOutput();
	}
}
