package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx2 {

	public static void main(String[] args) {

		// ���񽺸� �������ִ� ���� 
		// ���� �غ���·� ��� 
		// Ŭ���̾�Ʈ�� �����ؿ��� ��� ���� 

		ServerSocket servsock = null; // ���� ���� ���� 
		Socket sock = null; // ���� ��� ����	

		BufferedReader in = null; // �Է� ��Ʈ��

		try {
			servsock = new ServerSocket(9988); // ���� ���α׷��� ������ �������� 
			// Ŭ���̾�Ʈ�� �� ������ ���� �����ؿ�
			// ������: ��Ʈ��ȣ (default: �ڵ��Ҵ�) 
			System.out.println( "+ ���� ���� ���� +" );

			System.out.println("Listen Port: " + servsock.getLocalPort()); 
			sock = servsock.accept(); // Ŭ���̾�Ʈ�� ���ӿ�û�� �����鼭 ��� (������ �������) 
			System.out.println("Ŭ���̾�Ʈ ����!!"); 
			
			
			
			InetAddress ip = sock.getInetAddress(); // Ŭ���̾�Ʈ ip���� ��� 
			System.out.println("\t >> Ŭ���̾�Ʈ IP: " + ip.getHostAddress()); // IP
			System.out.println("\t >> Ŭ���̾�Ʈ port: " + sock.getPort()); // Port 
			
			// �Է½�Ʈ�� ���� 
			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			String receive = in.readLine(); 
			System.out.println("\n\t >> ���۵�����: " + receive);

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
