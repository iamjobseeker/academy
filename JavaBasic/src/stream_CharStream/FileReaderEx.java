package stream_CharStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx {
	public static void main(String[] args) {

		File file = new File("./src/stream_CharStream/Source.txt");
		
		Reader reader = null;
		BufferedReader br = null;
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			while( (len=br.read(cbuf)) != -1) { 
				System.out.print(new String(cbuf, 0, len));  
			}
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
