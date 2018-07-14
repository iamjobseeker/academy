package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_01 {
	public static void main(String[] args) {

		Reader rd = new InputStreamReader(System.in); // Bytestream�� Charstream���� ��ȯ
		Writer wt = new OutputStreamWriter(System.out); 

		int in = -1;
		try {
			while( (in = rd.read()) != -1 ) { // read�� �� ���ھ� ����
				wt.write(in); 
			 // wt.flush(); �� �پ� ���
			}  wt.flush(); // ��� ������ �ѹ��� ���
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
