package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender_1on1 extends Thread {

	private Socket sock; // 통신 소켓
	
	// 상황: 키보드 - 프로그램 - 소켓
	//	    -input->-output->

	// 키보드입력 -> BufferedReader 
	private BufferedReader reader;

	// 소켓출력 -> PrintWriter
	private PrintWriter writer;

	public Sender_1on1(Socket sock) {
		this.sock = sock; 
	}

	@Override
	public void run() { // keyboard input -> socket output
		//키보드 입력객체 생성, Input stream -> Char stream
		reader = new BufferedReader(new InputStreamReader( System.in ));

		try {		
			 // getoutputstream: 소켓과 연결된 스트림에 출력
			 // printwriter: outputstream을 객체로 받는다 
			writer = new PrintWriter(sock.getOutputStream(), true);

			// --- 실제 통신 ---
			// readLine: Reads a line of text. 
			//		 A line is considered to be terminated by any one of 
			//		 a line feed ('\n'), a carriage return ('\r'), etc.
			
			while(true) { String msg = reader.readLine(); // 키보드입력
			if( "/exit".equals(msg)) break; // 통신중단 
			writer.println(msg); 
			// println: Prints a String and then terminates the line. 
			}
			// --------------

		} catch (IOException e) { 
			System.out.println("sender 입출력 에러");
		} finally {
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
				if(sock != null) sock.close();
			} catch (IOException e) {
				System.out.println("sender 종료 에러");
				
			}

		}

	}
}
