package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex02_BufferedInputStream {
	public static void main(String[] args) {

		// ���� ��ü
		File file = new File("./src/stream_FilterStream/Test");

		// ���� �Է� ��Ʈ�� ��ü ����
		// 1�� ��Ʈ��(file-fis-program)
		FileInputStream fis = null;
		// 2�� ��Ʈ��(fis-bis-program)
		BufferedInputStream bis = null;

		byte[] buf = new byte[1024];
		int len = -1;
		
		try {
			// bis����ϴ� ����
			// ������ �ϳ��� ������
			fis = new FileInputStream(file);
			// ������ �Ѳ����� ������
			// �ϵ���������� ȿ����
			bis = new BufferedInputStream(fis); 
			
			// ������ �ӽ������
			// bis�� ����ؼ� ������ ������
			while((len = bis.read(buf)) != -1) {
				
				// new String(buf, 0, len) ��� trim : ���鹮�ڸ� �����Ѵٴ� �ǹ�
				System.out.println( new String (buf).trim() );
									
				// ����κ��� 0���� ä���ش� 
				Arrays.fill(buf, (byte)0 ); 
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		} finally {
			// bis�� fis�� ������
			// fis�� close�ϸ� bis�� �ڵ����� ����ȴ�
			try {
				if(bis!=null) bis.close();
				if(bis!=null) fis.close();
			} catch (IOException e) {
				System.out.println("���� ���� ���� �߻�");
				e.printStackTrace();
			}

		}
		
		// ������ ������, ���� ũ�Ⱑ Ŭ��/������ 

	}

}


