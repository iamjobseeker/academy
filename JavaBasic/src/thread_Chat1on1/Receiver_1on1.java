package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receiver_1on1 extends Thread {
	private Socket sock; // 통신소켓
	
	// 소켓입력 -> BufferedReader
	private BufferedReader reader;
	
	// 모니터출력 -> PrintWriter
	private PrintWriter writer;
	
	public Receiver_1on1(Socket sock) {
		this.sock = sock; 
	}
	
	@Override
	public void run() {
		// socket input -> monitor output 
		
		// 모니터 출력 스트림 객체 생성 
		writer = new PrintWriter(System.out, true); 
		
		try {
			reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
								// Input Stream -> Char Stream
			
			// --- 실제 통신 ---
			while(true) {
				String msg = reader.readLine();
				
				if(msg==null) {
					System.out.println(" + + 통신 종료 + + "); 
					break;
				}
				
				writer.println("\t>>받은 메시지: " + msg);
			}
			// --------------
		} catch (IOException e) {
			System.out.println(" + + 통신 종료 + + ");
		} finally {
			try {
				if(writer!=null) writer.close();
				if(reader!=null) reader.close();
				if(sock!=null) sock.close();
			} catch (IOException e) { 
				System.out.println("receiver 종료 에러");
			}
		}
						
	}
	
}
