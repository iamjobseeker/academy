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
	// 레이아웃
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JTextArea txtarea = new JTextArea();
	
	// 파일 입력
	private String s="";
	private String name;
	private String date;
	private String share;
	private String anny;
	private ArrayList<String> list = new ArrayList<>();
	private String[] split;
	
	public FileOutput() { // 생성자 
		readFile();
		
		frame.setBounds(100, 100, 500, 300); 
		txtarea.setSize(new Dimension(500, 300));
		txtarea.setText("텍스트 필드");
		txtarea.setText(split[0]);
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
				split = s.split("\t");
				date = split[0];
				name = split[1]; 
				share = split[2];
				anny = split[3]; 
				System.out.print(date);
				if(date.equals("2018-7-16")) {
					System.out.print(" 같음\n"); 
				} else System.out.print(" 모르겠음\n");
				
				
			
				
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
