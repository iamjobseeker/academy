package network_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_FileServer { 
	public static void main(String[] args) {

		// ���� ����� ���� �����

		// ���� ����
		ServerSocket servsock = null;
		Socket sock = null;

		// ���� �Է� ��Ʈ�� ����
		BufferedReader in = null; 

		// ��� ���� ���� 
		File file = new File("./src/network_Socket/receiveData.txt"); 
		BufferedWriter out = null;

		try {
			// ���� 
			servsock = new ServerSocket(1004);
			System.out.println(" + ���� ���� ���� + ");

			while(true) {
				System.out.println(" + ���� ����� + ");
				sock = servsock.accept(); 
				System.out.println(" + Ŭ���̾�Ʈ ���� + ");

				// �Է� ��Ʈ��		
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

				// ��� ��Ʈ��
				out = new BufferedWriter(new FileWriter(file)); 
				
				// ������ ��� �� ó�� 
				char[] cbuf = new char[1024];
				int len = -1;
				while( (len = in.read(cbuf)) != -1) {
					out.write(cbuf, 0, len);
				}
				out.flush(); 
				
			} // while end

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				servsock.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}
}

