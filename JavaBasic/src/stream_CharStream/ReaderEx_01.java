package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_01 {
	public static void main(String[] args) {
		
		Reader rd = new InputStreamReader(System.in); // Bytestream을 Charstream으로 변환
		Writer wt = new OutputStreamWriter(System.out); 
		
		int in = -1;
		try {
			while( (in = rd.read()) != -1 ) {
				wt.write(in); 
			}
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}

}
