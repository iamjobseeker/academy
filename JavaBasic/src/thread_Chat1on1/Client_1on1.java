package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	private final String HOST = "localhost";
	private final int PORT = 10005; // ���� 

	public Client_1on1() {
		Socket sock = null;
		
		try { 
			sock = new Socket(HOST, PORT);
			// --- ������ ��� ---
			// ���� -> Ŭ���̾�Ʈ ���
			// Ŭ���̾�Ʈ -> ���� ��� 
			chat(sock); 
			//----------------
			
		} catch (UnknownHostException e) {
			System.out.println("ȣ��Ʈ ��Ȯ�� ����");
		} catch (IOException e) {
		} 
	}
	
	private void chat(Socket sock) {
		// Sender Thread 
		// ������ ���� class�� ���� 
		// keyboard input -> socket output
		new Sender_1on1(sock).start();
				
		// Receiver Thread
		// socket input -> monitor output 
		new Receiver_1on1(sock).start(); 
	}

	public static void main(String[] args) {
		new Client_1on1(); 
		
//		System.out.print("ID�� �Է����ּ���>> ");
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));
//		try {
//			String ID = reader.readLine(); 
//		} catch (IOException e) {
//			System.out.println("ID �Է¹��� �߻�"); 
//		}

	} 

}

