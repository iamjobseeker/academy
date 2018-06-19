package network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		
		String urlStr =  "https://www.oracle.com:443/downloads/index.html";
		URL url = null; 
		try {
			url = new URL(urlStr);
			
				// URL�� uniform�� ������ ������ �ʾ��� �� ����
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		// parsing, 
		System.out.println("��������: " + url.getProtocol()); 
		System.out.println("ȣ��Ʈ: " + url.getHost());
		System.out.println("��Ʈ ��ȣ: " + url.getPort()); // -1 : �������� �ʴ´ٴ� �� 
		System.out.println("���� ���: " + url.getFile());
		System.out.println(url.toExternalForm());
		
	}

}
