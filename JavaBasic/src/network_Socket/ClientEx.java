package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) {
		
		// 서버로 접속하기 위한 클라이언트 
		
		System.out.println( " + 클라이언트 실행 + ");
		
		Socket sock = null;
		PrintWriter out = null;
		try {
			sock = new Socket("127.0.0.1", 9988); // 접속요청(ip, 포트) 
			
			out = new PrintWriter(sock.getOutputStream()); // 출력 스트림 개설 

			out.println("Hello"); // 데이터 출력 - 서버로 데이터 전송 
			
			out.flush(); // 전송(출력) 완료 
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
	}

}
