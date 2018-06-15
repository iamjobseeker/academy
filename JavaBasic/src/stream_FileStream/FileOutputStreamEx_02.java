package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/", "Result");
		
		byte[] buf = new byte[1024]; 
		buf[0] = 'A';
		buf[1] = 'B'; 
		
//		String str = "\n�ȳ�"; 
//		byte [] buf = str.getBytes(); // ��Ʈ�� -> ����Ʈ�� �������� 

		// ���� ��½�Ʈ�� ����
		FileOutputStream fos = null;

		try {
			// ������ ������ �������ش� 
//			fos = new FileOutputStream(file);
			
			// ���� ������ �ƴ� �߰���� 
			// true : �߰����
			// false : �űԸ��
			fos = new FileOutputStream(file, true); 

			// ���� ����ڵ�
//			fos.write(buf);
			// buf���� ���ڰ� �����ϴ� �κи� ���
			fos.write(buf, 0, buf.length);

		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ������ �������� ����");

		} catch (IOException e) {
			System.out.println("[ERROR] ����� ���� �߻�"); 

		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ����"); 
			}
		}

		System.out.println(" + + ���α׷� ���� ���� + + ");


	}

}
