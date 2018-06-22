package thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_ChatRoom extends Thread {

	private Socket sock; // ��� ����

	private BufferedReader reader; // Ű���� �Է�

	private PrintWriter writer; // ���� ���

	public Sender_ChatRoom(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run()  { 
		// keyboard input
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		// id input 
		System.out.println("ID�� �Է����ּ���."); 

		try {
			String ID = reader.readLine();
			
			// socket output 
			writer = new PrintWriter(sock.getOutputStream(), true);

			while(true) { String msg = reader.readLine(); 
			if("/exit".equals(msg)) break;
			writer.println(msg);
			}
		} catch (IOException e) { 
		} finally {
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
			}

		}

	}

}

