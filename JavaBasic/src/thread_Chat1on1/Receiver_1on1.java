package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread {
	private Socket sock; // ��ż���
	
	// �����Է� -> BufferedReader
	private BufferedReader reader;
	
	// �������� -> PrintWriter
	private PrintWriter writer;
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock; 
	}
	
	@Override
	public void run() {
		// socket input -> monitor output 
		
		// ����� ��� ��Ʈ�� ��ü ���� 
		writer = new PrintWriter(System.out, true); 
		
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
								// Input Stream -> Char Stream
			
			// --- ���� ��� ---
			while(true) {
				String msg = reader.readLine();
				
				if(msg==null) {
					System.out.println(" + + ��� ���� + + "); 
					break;
				}
				
				writer.println("\t>>���� �޽���: " + msg);
			}
			// --------------
		} catch (IOException e) {
			System.out.println(" + + ��� ���� + + ");
		} finally {
			try {
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
				if(sock!=null) sock.close();
			} catch (IOException e) { 
				System.out.println("receiver ���� ����");
			}
		}
						
	}
	
}
