package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx2 {

	public static void main(String[] args) {

		// 서비스를 제공해주는 역할 
		// 서비스 준비상태로 대기 
		// 클라이언트가 접속해오면 통신 시작 

		ServerSocket servsock = null; // 서버 리슨 소켓 
		Socket sock = null; // 서버 통신 소켓	

		BufferedReader in = null; // 입력 스트림

		try {
			servsock = new ServerSocket(9988); // 서버 프로그램에 소켓을 생성해줌 
			// 클라이언트가 이 소켓을 통해 연결해옴
			// 생성자: 포트번호 (default: 자동할당) 
			System.out.println( "+ 서버 소켓 생성 +" );

			System.out.println("Listen Port: " + servsock.getLocalPort()); 
			sock = servsock.accept(); // 클라이언트의 접속요청을 들으면서 대기 (소켓을 열어놓음) 
			System.out.println("클라이언트 접속!!"); 
			
			
			
			InetAddress ip = sock.getInetAddress(); // 클라이언트 ip정보 얻기 
			System.out.println("\t >> 클라이언트 IP: " + ip.getHostAddress()); // IP
			System.out.println("\t >> 클라이언트 port: " + sock.getPort()); // Port 
			
			// 입력스트림 개설 
			in = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			String receive = in.readLine(); 
			System.out.println("\n\t >> 전송데이터: " + receive);

		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally {
				try {
					if(in!=null) in.close(); // 생성 역순으로 close
					if(sock!=null) sock.close();
					if(servsock!=null) servsock.close(); 
					
				} catch (IOException e) {
					e.printStackTrace();
				} 
		}

	}

}
