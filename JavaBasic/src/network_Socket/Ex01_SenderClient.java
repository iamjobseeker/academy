package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_SenderClient {
	public static void main(String[] args) {

		// 키보드 입력해서 전송하기 

		System.out.println( " + 클라이언트 실행 + ");

		Socket sock = null;
		PrintWriter out = null;
		
		Scanner input = new Scanner(System.in); // 키보드입력 
		
		try {
			sock = new Socket("127.0.0.1", 10007); // 접속요청(ip, 포트) 

			out = new PrintWriter(sock.getOutputStream(), true); // 출력 스트림 개설 
																// autoFlush=true 

			// --- 데이터 통신 --- 
			
			String msg = null; // 메세지 입력 변수
			
			while(true) {
				System.out.print("\t보낼 메세지: "); 
				msg = input.nextLine(); // 스캐너로 전송할 내용 입력하기
				
				if("/exit".equals(msg)) break; // 통신 중단 메세지 설정 
											 // 채팅창의 닫기 버튼 역할 
				// 서버로 전송
				out.println(msg); 
			}
			
			// ---------------

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
