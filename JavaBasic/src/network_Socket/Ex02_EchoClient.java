package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_EchoClient {
	public static void main(String[] args) {
		
		// ����� ��Ʈ�� 2�� ���� 
		
		System.out.println( " + Ŭ���̾�Ʈ ���� + ");

		Socket sock = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		Scanner input = new Scanner(System.in); // Ű�����Է� 
		
		try {
			sock = new Socket("127.0.0.1", 10010); // ���ӿ�û(ip, ��Ʈ) 

			out = new PrintWriter(sock.getOutputStream(), true); // ��� ��Ʈ�� ���� 
																// autoFlush=true 
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			// --- ������ ��� --- 
			
			String msg = null; // �޼��� �Է� ���� 
			
			while(true) {
				System.out.print("\t���� �޼���: "); 
				msg = input.nextLine(); // ��ĳ�ʷ� ������ ���� �Է��ϱ�
				
				if("/exit".equals(msg)) break; // ��� �ߴ� �޼��� ���� 
											 // ä��â�� �ݱ� ��ư ���� 

				out.println(msg); // ������ ����
				
				System.out.println(">> �����޼���: " + in.readLine()); //ECHO
				
				System.out.println(" + ��� �Ϸ� + ");
			} 
			
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
