package network_Socket;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex03_FileClient {
	public static void main(String[] args) {
		
		// ������ ���� ������ 

		Socket sock = null;
		
		File file = new File("C:/Users/user2/Desktop/data.txt");
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			// Ŭ���̾�Ʈ ����
			System.out.println(" + Ŭ���̾�Ʈ ���� + "); 
			sock = new Socket("127.0.0.1", 1004);
			System.out.println("���� �Ϸ�");
			
			// �Է� ��Ʈ�� - ������ ���� �б�
			in = new BufferedReader(new FileReader(file)); // ���ڷ� �Էµ� 
			
			// ��� ��Ʈ�� 
			out = new PrintWriter(sock.getOutputStream(), true); 
			
			// ������ ��� �� ó�� 
			// in���� �о� out���� ����ϱ� 
			char[] cbuf = new char[1024];
			int len = -1;
			
			while( (len = in.read(cbuf)) != -1 ) {
				out.write(cbuf,0,len); 
				out.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
