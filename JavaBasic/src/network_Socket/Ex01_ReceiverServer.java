package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_ReceiverServer {
	public static void main(String[] args) {

		ServerSocket servsock = null; // ���� ���� ���� 
		Socket sock = null; // ���� ��� ���� 

		BufferedReader in = null; // �Է� ��Ʈ��

		try {
			servsock = new ServerSocket(10007); // ���� ���α׷��� ������ �������� 
			// Ŭ���̾�Ʈ�� �� ������ ���� �����ؿ�
			// ������: ��Ʈ��ȣ (default: �ڵ��Ҵ�) 
			System.out.println( "+ ���� ���� ���� +" ); 

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
			
			// --- ������ ��� ---
			
			String msg = null;
			
			while( (msg = in.readLine()) != null ) { // �Է°��� ������ null ��ȯ 
				System.out.println("���� �޽��� >> " + msg);
			}
			
			System.out.println("Ŭ���̾�Ʈ ���� ����");
			  
			// ---------------

		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally {
			try {
				if(in!=null) in.close(); // ���� �������� close
				if(sock!=null) sock.close();
				if(servsock!=null) servsock.close(); 

			} catch (IOException e) { 
				e.printStackTrace();
			} 
		}

	}

}
