package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {
	public static void main(String[] args) {
		
		
		OutputStream os;	
		os = System.out; 

		byte [] buf = new byte[1024];
		
		int len=0;
		
		buf[len++] = 65; // 'A'
		buf[len++] = 66; // 'B'
		buf[len++] = 67; // 'C'
		buf[len++] = 10; // '\n' 
		
		buf[len++] = 'H';  // 72
		buf[len++] = 'i';  // 105
		buf[len++] = '\n';  // 10
		
		// int -> byte
		// char -> int -> byte 
		// �ڵ�����ȯ�� �Ͼ�� 
		
		System.out.println("����: " + buf.length);
		
		try {
			os.write(buf, 0, len);	// ��¹��� ���� ����		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os != null) os.close(); // ����� ����
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
		}
		
		// buf�� ä������ ���� ������ 0(���鹮��)���� �ν��ϰ� �������� ��µȴ� 
		System.out.println(" + + ���α׷� ���� ���� + +");
		
	}

}
