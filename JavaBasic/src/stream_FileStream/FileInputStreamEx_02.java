package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/Hello");	
		StringBuffer sb =  new StringBuffer();
		
		// �ѹ��� �о�鿩 �����ϴ� �迭 
		byte[] buf = new byte[1024];
		
		int len = -1; // �о���� ����Ʈ �� 
		int total = 0; // �� �о���� ����Ʈ �� 
		
		// ���ϰ� ����� ���. ���� -> ���α׷� 
		// ���� �Է� ��Ʈ�� ��ü ����
		// try ���� �ȿ��� ��ü�� �����ϱ� ������
		// ��ü ���� ����(�ʱⰪ �� ����)�� ����ؼ� �ʱ�ȭ���ش� 
		FileInputStream fis = null; 

		try {
			//FileInputStream�� �����ڸ� ȣ���Ҷ��� ������ �Ű������� ���
			fis = new FileInputStream(file);
			
						// buf��� �迭�� �����ϴ� ��� �����͸� �ѹ��� �о���´�
						// ȿ������ �ڵ� 
						// len�� �ش� �迭�� ���̰� �ȴ� 
			while( ( len = fis.read(buf) ) != -1 ){ 
				
				// buf �迭 �ʱ�ȭ ��� :1
				sb.append( new String (buf, 0, len) ); // byte�� ���ڿ��� ��ȯ 
				System.out.println("���� ����Ʈ ��: " + len);
				total += len; 
				
				// buf �迭 �ʱ�ȭ ��� :2
				Arrays.fill(buf, (byte) 0); 
			} 
			
			 // ȣ���� ������ �������� �ʴ� ���� 
			 // IOException�� �ڽ�Ŭ�����̹Ƿ� �տ� �ξ�� �Ѵ�
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� �������� ����");
			
			  // ����¿� ���� ��� ����
		} catch (IOException e) {
			System.out.println("[ERROR] ����� ���� �߻�");

		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println("=====�о�� �� ����Ʈ ��=====");
		System.out.println(total + "Bytes");
		System.out.println("=====�о�� ������=====");
		System.out.println(sb);
		System.out.println("====================");
		System.out.println(" + + ���α׷� ���� ���� + + "); 
		
		// �ü���� �ν��ϴ� �ֺ� �ü���� ��� �������� 
		
	}

}
