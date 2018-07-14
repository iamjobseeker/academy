package stream_FilterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {

		// ���� ��ü - ��� ���
		File file = new File("./src/stream_FilterStream/Testoutput");

		// ���� ��Ʈ�� ��ü ���� 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream(file); 
			bos = new BufferedOutputStream(fos); 

			bos.write("Orange".getBytes());
			
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		} finally {
			try { 
				if(bos != null) bos.close(); 
				if(fos != null) fos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
