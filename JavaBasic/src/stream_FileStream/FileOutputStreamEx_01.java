package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/", "Result");
		
		// ���� ��½�Ʈ�� ����
		FileOutputStream fos = null;
		
		try {
			// ������ ������ �������ش� 
			fos = new FileOutputStream(file);
			
			// IOException ó�� �ʼ� 
			// ���α׷� �߽����� �����غ��� ���α׷��� �����͸� �Է��ϴ� �� 
			fos.write(65);  // A ���
			fos.write('C'); // 66 ��� 
			// Result���Ͽ� ��µȴ� 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + ���α׷� ���� ���� + + ");
		
	}

}
