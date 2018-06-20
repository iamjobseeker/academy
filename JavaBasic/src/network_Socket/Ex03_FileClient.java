package network_Socket;

import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex03_FileClient {
	public static void main(String[] args) {
		
		// 서버로 파일 보내기 

		Socket sock = null;
		
		File file = new File("C:/Users/user2/Desktop/data.txt");
		BufferedReader in = null;
		PrintWriter out = null;
		
		try {
			// 클라이언트 소켓
			System.out.println(" + 클라이언트 실행 + "); 
			sock = new Socket("127.0.0.1", 1004);
			System.out.println("접속 완료");
			
			// 입력 스트림 - 전송할 파일 읽기
			in = new BufferedReader(new FileReader(file)); // 문자로 입력됨 
			
			// 출력 스트림 
			out = new PrintWriter(sock.getOutputStream(), true); 
			
			// 데이터 통신 및 처리 
			// in으로 읽어 out으로 출력하기 
			char[] cbuf = new char[1024];
			int len = -1;
			
			while( (len = in.read(cbuf)) != -1 ) {
				out.write(cbuf,0,len); 
				out.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
