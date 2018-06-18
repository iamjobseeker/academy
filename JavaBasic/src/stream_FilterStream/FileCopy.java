package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		// ���� ��ü�� ����
		File src = new File("D:/Source.txt");
		File dest = new File("./src/stream_FilterStream/", "Dest");

		// ����½�Ʈ�� ��ü ���� 
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		byte[] buf = new byte[1024]; 
		int len = -1; 
		int tot = 0;  

		try {
			fis = new FileInputStream(src); 
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(dest); 
			bos = new BufferedOutputStream(fos); 


			while( (len = bis.read(buf)) != -1 ) {
				bos.write(buf, 0, len);
				tot += len;				
				
				// ��Ʈ���� �����ִ� �����͸� fis�� �����ִ� ����
				// close�� ���ԵǾ� �ִ� ���
				// bos.flush(); // 1 (while�� �ȿ� ������ �����͸� ����� ������ ���ϰ� ��� ����)
			} 
			
			bos.flush(); // 2 (�������� ������ ��� �����͸� ��Ƽ� �ѹ��� ����)
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� �������� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ����� ���� �߻�");
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				// close�ϸ� ��Ʈ���� �ִ°��� �� �������� 
				if(bos!=null) bos.close();
				
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
