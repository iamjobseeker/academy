package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/Hello");	
		StringBuffer sb =  new StringBuffer();
		int in = -1;
		
		// ���ϰ� ����� ���. ���� -> ���α׷� 
		FileInputStream fis = null;

		try {
			//FileInputStream�� �����ڸ� ȣ���Ҷ��� ������ �Ű������� ���
			fis = new FileInputStream(file);
			
					// read�޼ҵ带 �����ϸ� 
					// ��θ� ���� offset���� ������ ���� �ش� ������ ascii���� ��ȯ�Ѵ�
					// offset index�� ����ؼ� +1�� �ȴ� 
			while( ( in = fis.read() ) != -1 ){
				sb.append( (char) in );
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
				// fis==null�̶�� fis.close�� null.close�� ��������
				// ���� fis�� ���� �ҷ����⸦ �����Ѵٸ� close�� �ʿ䵵 ���� 
				if(fis!=null) fis.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}

		System.out.println("=====�о�� ������=====");
		System.out.print(sb);
		System.out.println("====================");
		System.out.println(" + + ���α׷� ���� ���� + + "); 
		
		// �ü���� �ν��ϴ� �ֺ� �ü���� ��� �������� 
		// ���� -> �޸� ���ε�
	}

}
