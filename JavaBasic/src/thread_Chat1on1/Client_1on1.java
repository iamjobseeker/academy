package thread_Chat1on1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_1on1 {
	private final String HOST = "localhost";
	private final int PORT = 10005; // 서버 

	public Client_1on1() {
		Socket sock = null;
		
		try { 
			sock = new Socket(HOST, PORT);
			// --- 데이터 통신 ---
			// 서버 -> 클라이언트 통신
			// 클라이언트 -> 서버 통신 
			chat(sock); 
			//----------------
			
		} catch (UnknownHostException e) {
			System.out.println("호스트 미확인 에러");
		} catch (IOException e) {
		} 
	}
	
	private void chat(Socket sock) {
		// Sender Thread 
		// 재사용을 위해 class로 생성 
		// keyboard input -> socket output
		new Sender_1on1(sock).start();
				
		// Receiver Thread
		// socket input -> monitor output 
		new Receiver_1on1(sock).start(); 
	}

	public static void main(String[] args) {
		new Client_1on1(); 
		
//		System.out.print("ID를 입력해주세요>> ");
//		
//		BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));
//		try {
//			String ID = reader.readLine(); 
//		} catch (IOException e) {
//			System.out.println("ID 입력문제 발생"); 
//		}

	} 

}

