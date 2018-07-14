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
			while( (in = rd.read()) != -1 ) { // read로 한 문자씩 읽음
				wt.write(in); 
			 // wt.flush(); 한 줄씩 출력
			}  wt.flush(); // 모든 내용을 한번에 출력
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
