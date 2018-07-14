package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_EchoServer {
	public static void main(String[] args) {

		// ����� ��Ʈ�� 2�� ����

		ServerSocket servsock = null; // ���� ���� ���� 
		Socket sock = null; // ���� ��� ���� 

		BufferedReader in = null; // �Է� ��Ʈ��
		PrintWriter out = null; // ��� ��Ʈ�� 

		try {
			servsock = new ServerSocket(10010); // ���� ���α׷��� ������ �������� 
			System.out.println( "+ ���� ���� ���� +" ); 

			while(true){ 
				try {
					System.out.println("Listen Port: " + servsock.getLocalPort()); 
					sock = servsock.accept(); // Ŭ���̾�Ʈ�� ���ӿ�û�� �����鼭 ��� (������ �������)

					// --- BLOCK --- Ŭ���̾�Ʈ ������ ���������� 

					System.out.println("Ŭ���̾�Ʈ ����!!"); 
					InetAddress ip = sock.getInetAddress(); // Ŭ���̾�Ʈ ip���� ��� 
					System.out.println("\t >> Ŭ���̾�Ʈ IP: " + ip.getHostAddress()); // IP
					System.out.println("\t >> Ŭ���̾�Ʈ port: " + sock.getPort()); // Port 
					// Ŭ���̾�Ʈ�� Port = ������ ��ſ� Port 

					// �Է½�Ʈ�� ���� 
					in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 

					// ��½�Ʈ�� ���� 
					out = new PrintWriter(sock.getOutputStream(), true);  

					// --- ������ ��� ---
					String msg = null;

					while( (msg = in.readLine()) != null ) { // �Է°��� ������ null ��ȯ 
						System.out.println("���� �޽��� >> " + msg);
						out.println(msg); // ECHO 
					}

					System.out.println("Ŭ���̾�Ʈ ��� ����"); 

				} catch (IOException e) { 
					System.out.println("Ŭ���̾�Ʈ ��� ����");

				} finally {
					try {
						if(in!=null) in.close(); // ���� �������� close
						if(out!=null) out.close(); 
						if(sock!=null) sock.close();  

					} catch (IOException e) { 
						System.out.println("[ERROR] �ڿ����� ����");
					} 
				} // try end - Ŭ���̾�Ʈ ���� �� ��� 

			}	// while end - 

		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����");
		} finally {
			try {
				if(servsock!=null)	servsock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ����� ����");
			}
		}
		
	}	
}

