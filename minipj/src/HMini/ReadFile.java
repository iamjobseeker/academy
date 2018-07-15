package HMini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("./src/HMini/memo"));
			String line ="";
			while((line = in.readLine())!=null) {
				System.out.println(line);
			} 
			Null nul = new Null("0"); 
			String[] txtArray = nul.initOkbut();
			try {
			System.out.println(txtArray[0]); 
			} catch (Exception e) { 
				// TODO: handle exception
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
