package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		
		// Ű���彺Ʈ�� 
		InputStream inpst; 
//		Scanner input;
		
		// Ű����� �������ִ� ǥ�� �Է½�Ʈ�� 
		inpst = System.in; 
//		input = new Scanner(System.in);
		
		// ����ؼ� ������ �����͸� ó���ϴµ� ����
		// read�� �����͸� �������� ������ �����ʹ� �����ȴ� 
		StringBuffer strbf = new StringBuffer();
		
		int in ; 
		System.out.println("�Է´����...");
	
		try {
			while((in = inpst.read()) != -1 ) {
			strbf.append( (char) in); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inpst!=null) inpst.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}		
		// Ctrl + z == eof 
		// 1byte�� �����Ƿ� 2byte�� �ѱ��� �����Եȴ� 
		System.out.println("�Է°��: " + strbf);
	}
}
