package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
		
		OutputStream os;	
		os = System.out; //PrintStream�� OutputStream�� ���� (���� ����)
		
//		os.println();  // �Ұ���
		
		try {
			os.write(97);  // 'write' throws IOException
			os.write(98); 
			os.write(99);
			os.write(10);  // 10==���๮��
			
			os.write('a');  // �ڹٴ� 'char'���¸� ���ڷ� �ν��Ѵ�
			os.write('b');  // ���� �ƽ�Ű �ڵ�� ���� ��� 
			os.write('c');
			os.write('\n');
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os != null) os.close(); // ����� ����
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
		}
		
		System.out.println(" + + ���α׷� ���� ���� + +");
		
	}

}
