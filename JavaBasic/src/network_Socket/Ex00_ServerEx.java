package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx {

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

			System.out.println("Listening...!!");
			sock = servsock.accept(); // Ŭ���̾�Ʈ�� ���ӿ�û�� �����鼭 ��� (������ �������) 
			// Listens for a connection to be made to this socket and accepts it. 
			// The method blocks until a connection is made. 
			System.out.println("Client Accepted!!"); 

			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 

			String receive = in.readLine(); 

			System.out.println("\n\t>>���۵�����: " + receive);

		} catch (IOException e) { 
			e.printStackTrace(); 
		}

	}

}
