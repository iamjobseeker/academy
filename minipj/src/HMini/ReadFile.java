package HMini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/HMini/memo"));
			String line ="";
			while((line = in.readLine())!=null) {
				if(line.contains("2018-7-16")) {
					System.out.println(line); // 해당하는 열만 추출하기
					// 레이블에 일정 띄우기 
					// 달력에 일정 표시 삽입하기
				}
			} 
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
