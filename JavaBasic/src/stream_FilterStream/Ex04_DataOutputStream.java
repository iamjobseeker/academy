package stream_FilterStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {
	public static void main(String[] args) {
		
		// 파일객체 선언 
		File file = new File("./src/stream_FilterStream/DataTest");
		
		// 파일 출력 스트림
		FileOutputStream fos = null;
		DataOutputStream dos = null; 
		
		try {
			fos = new FileOutputStream(file);
			
			dos = new DataOutputStream(fos);
			
			// 데이터타입의 크기를 유지하면서 출력한다 
			dos.writeInt(100); // 4byte
			dos.writeBoolean(false); // 1byte, false=0
			dos.writeChar('T'); // 2byte
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally { 
			try {
				if(dos != null) dos.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
