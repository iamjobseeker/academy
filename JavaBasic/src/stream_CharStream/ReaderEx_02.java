package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_02 {
	public static void main(String[] args) {

		Reader rd = new InputStreamReader(System.in); // Bytestream을 Charstream으로 변환
		Writer wt = new OutputStreamWriter(System.out); 

		// char형이기 때문에 char형 배열을 만든다
		char[] cbuf = new char[1024];
		int len = -1;
		try {
			while( (len = rd.read(cbuf)) != -1 ) { // read로 한 문자씩 읽음
				wt.write(cbuf, 0, len); 
			}  wt.flush();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				if(rd!=null) rd.close();
				if(wt!=null) wt.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
