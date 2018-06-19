package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		
		// url 가져와서 홈페이지 직접 열기
		// url -> 요청 -> 응답
		
		String urlStr =  "https://www.oracle.com:443/downloads/index.html";
		URL url = null;				  // url 생성 및 파싱 
		URLConnection conn = null; 	  // 연결-요청-응답하기
		BufferedReader reader = null; // 입력스트림 
									  // 페이지의 내용은 문자단위 -> reader
									  // 홈페이지 용량 거대 -> buffered 
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			url = new URL(urlStr); // url생성 및 파싱 
	
			conn = url.openConnection();  // url을 이용하여 연결 수립
										  // https를 인식하여 인터넷에 자동 연결 
			
		 // conn -> Inputstream -> Reader -> BufferedReader
		 // url  ->     읽기         -> 문자단위  ->    속도 빠르게
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			while( (len=reader.read(cbuf) ) != -1) {
				System.out.print(new String (cbuf, 0, len)) ;
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		} 
		
		
	}

}
