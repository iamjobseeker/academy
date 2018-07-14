package network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		
		String urlStr =  "https://www.oracle.com:443/downloads/index.html";
		URL url = null; 
		try {
			url = new URL(urlStr);
			
				// URL의 uniform한 형식을 따르지 않았을 때 예외
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		// parsing, 
		System.out.println("프로토콜: " + url.getProtocol()); 
		System.out.println("호스트: " + url.getHost());
		System.out.println("포트 번호: " + url.getPort()); // -1 : 존재하지 않는다는 뜻 
		System.out.println("파일 경로: " + url.getFile());
		System.out.println(url.toExternalForm());
		
	}

}
