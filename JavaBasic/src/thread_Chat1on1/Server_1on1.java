package thread_Chat1on1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {

	// PORT설정
	private final int PORT = 10005; // 고유한 서버 값 

	public Server_1on1() { // 생성자 
		ServerSocket serv = null; // 서버 소켓
		Socket sock = null; 
	
	try { 
		serv = new ServerSocket(PORT);
		System.out.println("--- waiting client --- ");
		sock = serv.accept();

		InetAddress ip = sock.getInetAddress();
							// 소켓에 연결된 ip주소 
		System.out.println("클라이언트("+ip.getHostAddress()+")접속");
									// String형태로 ip주소 반환

		// --- 데이터 통신 ---
		// 서버 -> 클라이언트 통신
		// 클라이언트 -> 서버 통신 
		chat(sock); 
		// ----------------
	} catch (IOException e) {}
		System.out.println("입출력 에러");
	}
	public void chat(Socket sock) {
		// Sender Thread 
		// 재사용을 위해 class로 생성 
		// keyboard input -> socket output
		new Sender_1on1(sock).start();
		
		// Receiver Thread
		// socket input -> monitor output 
		new Receiver_1on1(sock).start(); 
	}

	public static void main(String[] args) {

	new Server_1on1();  
	

	}
}


