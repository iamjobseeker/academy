package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		// ���� ��ü�� ����
		File src = new File("D:/Source.txt");
		File dest = new File("./src/stream_FileStream/", "Dest");

		// ����½�Ʈ�� ��ü ���� 
		FileInputStream fis = null;
		FileOutputStream fos = null;

		byte[] buf = new byte[1024]; // ����
		int len = -1; // ����� ����(1ȸ) - ���۰� 1ȸ ������� �������� ���� 
		int tot = 0;  // �� ����� ����  - ���۰� �� ������� �������� ����

		try {
			fis = new FileInputStream(src);  // throws FileNotFoundException 
			fos = new FileOutputStream(dest); 

					// 1024byte�� buf�� �ݺ� ����
			while( (len = fis.read(buf)) != -1 ) { // eof�� ���������� �ݺ� 
												   // throws IOException
				
				//  fos.write(buf);  ���ۿ� �����ִ� ������ ���� ������ ��¶� ���� �߻� 
				fos.write(buf, 0, len);

				// 100byte�� ���Ͽ� �ִ� ��Ȳ
				// 1. buf�� �ش� �����Ͱ� ���� len=100�� �ȴ�
				// 2. write�ϸ� 100���� �����ͱ��� ��µȴ� 
			
				// ����ī�� �� ����
				tot += len;				
			} 
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� �������� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ����� ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				// ��Ʈ�� �ݱ�
				// ���� fis=null�̶�� null.close()�� �Ǿ� ����
				if(fis!=null) fis.close(); 
				if(fos!=null) fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ����");
				e.printStackTrace();
			} 
		}

		System.out.println(tot+"����Ʈ ���� �Ϸ�");
		System.out.println(" + + ���α׷� ���� ���� + + ");

	}

}
