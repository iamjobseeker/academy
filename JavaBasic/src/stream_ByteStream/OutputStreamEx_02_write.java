package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02_write {
	public static void main(String[] args) {
		
		
		OutputStream os;	
		os = System.out; 

		byte [] buf = new byte[1024];
		
		buf[0] = 65; // 'A'
		buf[1] = 66; // 'B'
		buf[2] = 67; // 'C'
		buf[3] = 10; // '\n' 
		
		buf[4] = 'H';  // 72
		buf[5] = 'i';  // 105
		buf[6] = '\n';  // 10
		
		// int -> byte
		// char -> int -> byte 
		// �ڵ�����ȯ�� �Ͼ�� 
		
		System.out.println("����: " + buf.length);
		
		try {
			os.write(buf);  // 1024 ������ ��� ��µȴ� 			
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
