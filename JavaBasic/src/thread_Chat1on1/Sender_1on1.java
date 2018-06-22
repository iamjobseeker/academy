package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {

	private Socket sock; // ��� ����
	
	// ��Ȳ: Ű���� - ���α׷� - ����
	//	    -input->-output->

	// Ű�����Է� -> BufferedReader 
	private BufferedReader reader;

	// ������� -> PrintWriter
	private PrintWriter writer;

	public Sender_1on1(Socket sock) {
		this.sock = sock; 
	}

	@Override
	public void run() { // keyboard input -> socket output
		//Ű���� �Է°�ü ����, Input stream -> Char stream
		reader = new BufferedReader(new InputStreamReader( System.in ));

		try {		
			 // getoutputstream: ���ϰ� ����� ��Ʈ���� ���
			 // printwriter: outputstream�� ��ü�� �޴´� 
			writer = new PrintWriter(sock.getOutputStream(), true);

			// --- ���� ��� ---
			// readLine: Reads a line of text. 
			//		 A line is considered to be terminated by any one of 
			//		 a line feed ('\n'), a carriage return ('\r'), etc.
			
			while(true) { String msg = reader.readLine(); // Ű�����Է�
			if( "/exit".equals(msg)) break; // ����ߴ� 
			writer.println(msg); 
			// println: Prints a String and then terminates the line. 
			}
			// --------------

		} catch (IOException e) { 
			System.out.println("sender ����� ����");
		} finally {
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				System.out.println("sender ���� ����");
				
			}

		}

	}
}
