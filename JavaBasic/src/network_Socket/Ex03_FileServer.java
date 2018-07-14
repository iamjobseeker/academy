package network_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_FileServer { 
	public static void main(String[] args) {

		// 파일 저장소 서버 만들기

		// 소켓 설정
		ServerSocket servsock = null;
		Socket sock = null;

		// 파일 입력 스트림 설정
		BufferedReader in = null; 

		// 출력 파일 설정 
		File file = new File("./src/network_Socket/receiveData.txt"); 
		BufferedWriter out = null;

		try {
			// 소켓 
			servsock = new ServerSocket(1004);
			System.out.println(" + 서버 소켓 생성 + ");

			while(true) {
				System.out.println(" + 응답 대기중 + ");
				sock = servsock.accept(); 
				System.out.println(" + 클라이언트 연결 + ");

				// 입력 스트림		
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

				// 출력 스트림
				out = new BufferedWriter(new FileWriter(file)); 
				
				// 데이터 통신 및 처리 
				char[] cbuf = new char[1024];
				int len = -1;
				while( (len = in.read(cbuf)) != -1) {
					out.write(cbuf, 0, len);
				}
				out.flush(); 
				
			} // while end

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				servsock.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}
}

