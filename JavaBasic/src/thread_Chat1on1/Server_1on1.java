package thread_Chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {

	// PORT����
	private final int PORT = 10005; // ������ ���� �� 

	public Server_1on1() { // ������ 
		ServerSocket serv = null; // ���� ����
		Socket sock = null; 
	
	try { 
		serv = new ServerSocket(PORT);
		System.out.println("--- waiting client --- ");
		sock = serv.accept();

		InetAddress ip = sock.getInetAddress();
							// ���Ͽ� ����� ip�ּ� 
		System.out.println("Ŭ���̾�Ʈ("+ip.getHostAddress()+")����");
									// String���·� ip�ּ� ��ȯ

		// --- ������ ��� ---
		// ���� -> Ŭ���̾�Ʈ ���
		// Ŭ���̾�Ʈ -> ���� ��� 
		chat(sock); 
		// ----------------
	} catch (IOException e) {}
		System.out.println("����� ����");
	}
	public void chat(Socket sock) {
		// Sender Thread 
		// ������ ���� class�� ���� 
		// keyboard input -> socket output
		new Sender_1on1(sock).start();
		
		// Receiver Thread
		// socket input -> monitor output 
		new Receiver_1on1(sock).start(); 
	}

	public static void main(String[] args) {

	new Server_1on1();  
	

	}
}


