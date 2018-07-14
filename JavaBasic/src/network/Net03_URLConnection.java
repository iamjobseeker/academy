package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		
		// url �����ͼ� Ȩ������ ���� ����
		// url -> ��û -> ����
		
		String urlStr =  "https://www.oracle.com:443/downloads/index.html";
		URL url = null;				  // url ���� �� �Ľ� 
		URLConnection conn = null; 	  // ����-��û-�����ϱ�
		BufferedReader reader = null; // �Է½�Ʈ�� 
									  // �������� ������ ���ڴ��� -> reader
									  // Ȩ������ �뷮 �Ŵ� -> buffered 
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			url = new URL(urlStr); // url���� �� �Ľ� 
	
			conn = url.openConnection();  // url�� �̿��Ͽ� ���� ����
										  // https�� �ν��Ͽ� ���ͳݿ� �ڵ� ���� 
			
		 // conn -> Inputstream -> Reader -> BufferedReader
		 // url  ->     �б�         -> ���ڴ���  ->    �ӵ� ������
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
