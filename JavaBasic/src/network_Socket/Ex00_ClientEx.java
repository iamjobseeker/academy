package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex00_ClientEx {
	public static void main(String[] args) {
		
		// ������ �����ϱ� ���� Ŭ���̾�Ʈ 
		
		System.out.println( " + Ŭ���̾�Ʈ ���� + ");
		
		Socket sock = null;
		PrintWriter out = null;
		try {
			sock = new Socket("127.0.0.1", 9988); // ���ӿ�û(ip, ��Ʈ) 
			
			out = new PrintWriter(sock.getOutputStream(), true); // ��� ��Ʈ�� ���� 
													   // true�� �־��ָ� �ڵ� flush��

			out.println("Hello"); // ������ ��� - ������ ������ ���� 
			
//			out.flush(); // ����(���) �Ϸ� 
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			out.close(); // �ڵ����� flush �Ǳ� ������ close ���� ��Ȳ�� �ɸ��� �ʴ´�
				try {
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				} 
		}
		
	}

}
