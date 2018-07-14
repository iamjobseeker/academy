package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_SenderClient {
	public static void main(String[] args) {

		// Ű���� �Է��ؼ� �����ϱ� 

		System.out.println( " + Ŭ���̾�Ʈ ���� + ");

		Socket sock = null;
		PrintWriter out = null;
		
		Scanner input = new Scanner(System.in); // Ű�����Է� 
		
		try {
			sock = new Socket("127.0.0.1", 10007); // ���ӿ�û(ip, ��Ʈ) 

			out = new PrintWriter(sock.getOutputStream(), true); // ��� ��Ʈ�� ���� 
																// autoFlush=true 

			// --- ������ ��� --- 
			
			String msg = null; // �޼��� �Է� ����
			
			while(true) {
				System.out.print("\t���� �޼���: "); 
				msg = input.nextLine(); // ��ĳ�ʷ� ������ ���� �Է��ϱ�
				
				if("/exit".equals(msg)) break; // ��� �ߴ� �޼��� ���� 
											 // ä��â�� �ݱ� ��ư ���� 
				// ������ ����
				out.println(msg); 
			}
			
			// ---------------

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			out.close(); 
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
