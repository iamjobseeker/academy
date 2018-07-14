package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_EchoClient {
	public static void main(String[] args) {
		
		// 입출력 스트림 2개 존재 
		
		System.out.println( " + 클라이언트 실행 + ");

		Socket sock = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		Scanner input = new Scanner(System.in); // 키보드입력 
		
		try {
			sock = new Socket("127.0.0.1", 10010); // 접속요청(ip, 포트) 

			out = new PrintWriter(sock.getOutputStream(), true); // 출력 스트림 개설 
																// autoFlush=true 
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			// --- 데이터 통신 --- 
			
			String msg = null; // 메세지 입력 변수 
			
			while(true) {
				System.out.print("\t보낼 메세지: "); 
				msg = input.nextLine(); // 스캐너로 전송할 내용 입력하기
				
				if("/exit".equals(msg)) break; // 통신 중단 메세지 설정 
											 // 채팅창의 닫기 버튼 역할 

				out.println(msg); // 서버로 전송
				
				System.out.println(">> 받은메세지: " + in.readLine()); //ECHO
				
				System.out.println(" + 통신 완료 + ");
			} 
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			out.close(); 
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}

}
