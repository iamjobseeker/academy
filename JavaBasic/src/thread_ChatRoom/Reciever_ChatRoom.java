package thread_ChatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Reciever_ChatRoom extends Thread {
	private Socket sock;

	private BufferedReader reader;

	private PrintWriter writer;

	public Reciever_ChatRoom(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {

		// monitor output
		writer = new PrintWriter(System.out, true);

		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));

			while(true) {
				String msg = reader.readLine();

				if(msg==null) {
					System.out.println(" + + 통신 종료 + + "); 
					break;
				}
				
				writer.println("\t>>받은 메시지: " + msg);
			}

		} catch (IOException e) {
		} finally {
			try {
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
				if(sock!=null) sock.close();
			} catch (IOException e) { 
			}
		}
	}


}

