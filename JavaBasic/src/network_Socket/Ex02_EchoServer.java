package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex02_EchoServer {
	public static void main(String[] args) {

		// 입출력 스트림 2개 존재

		ServerSocket servsock = null; // 서버 리슨 소켓 
		Socket sock = null; // 서버 통신 소켓 

		BufferedReader in = null; // 입력 스트림
		PrintWriter out = null; // 출력 스트림 

		try {
			servsock = new ServerSocket(10010); // 서버 프로그램에 소켓을 생성해줌 
			System.out.println( "+ 서버 소켓 생성 +" ); 

			while(true){ 
				try {
					System.out.println("Listen Port: " + servsock.getLocalPort()); 
					sock = servsock.accept(); // 클라이언트의 접속요청을 들으면서 대기 (소켓을 열어놓음)

					// --- BLOCK --- 클라이언트 접속이 있을때까지 

					System.out.println("클라이언트 접속!!"); 
					InetAddress ip = sock.getInetAddress(); // 클라이언트 ip정보 얻기 
					System.out.println("\t >> 클라이언트 IP: " + ip.getHostAddress()); // IP
					System.out.println("\t >> 클라이언트 port: " + sock.getPort()); // Port 
					// 클라이언트의 Port = 서버의 통신용 Port 

					// 입력스트림 개설 
					in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 

					// 출력스트림 개설 
					out = new PrintWriter(sock.getOutputStream(), true);  

					// --- 데이터 통신 ---
					String msg = null;

					while( (msg = in.readLine()) != null ) { // 입력값이 없으면 null 반환 
						System.out.println("받은 메시지 >> " + msg);
						out.println(msg); // ECHO 
					}

					System.out.println("클라이언트 통신 종료"); 

				} catch (IOException e) { 
					System.out.println("클라이언트 통신 종료");

				} finally {
					try {
						if(in!=null) in.close(); // 생성 역순으로 close
						if(out!=null) out.close(); 
						if(sock!=null) sock.close();  

					} catch (IOException e) { 
						System.out.println("[ERROR] 자원해제 실패");
					} 
				} // try end - 클라이언트 접속 및 통신 

			}	// while end - 

		} catch (IOException e) {
			System.out.println("[ERROR] 소켓 생성 실패");
		} finally {
			try {
				if(servsock!=null)	servsock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 자원해제 실패");
			}
		}
		
	}	
}

