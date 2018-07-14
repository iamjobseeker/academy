package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress { 
	public static void main(String[] args) {
		
		// InetAddress : IP������ �ٷ�� Ŭ���� 
		InetAddress ip = null;
		
		// InetAddress�� �޼ҵ� getByName 
		// �Ķ���� : DNS�ּ�
		// ��ȯ : ip�ּ�		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace(); 
		}
		
		// host name = node name = DNS 	
		System.out.println("hostname: " + ip.getHostName());
		System.out.println("hostaddress: " + ip.getHostAddress());
		// println�� ��ü(ip)�� ������ �ڵ����� toString�� 
		System.out.println("toString: " + ip); 
		
		System.out.println("-------"); 
		
		// �迭�� 8bit�� ip�ּҸ� �־��ش� 
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress(): " + ipAddr); // �迭�� ������ ��� 
		System.out.println("getAddress(): " + Arrays.toString(ipAddr)); // �迭�� �� ��� 
		
		// ip�ּ�: 161 -> ipAddr: -95 (unsigned) 
		for(byte i : ipAddr) {
			System.out.print( (i<0)? i+256 : i);
			System.out.print(".");
		}
		
		// local host : �ڱ� �ڽ��� DNS
		System.out.println("\n---localhost---");
		try {
			// �ڱ� �ڽ��� ȣ��Ʈ ���� ��� 
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) { 
			e.printStackTrace();
		}
		System.out.println("hostname: " + ip.getHostName());
		System.out.println("hostaddress: " + ip.getHostAddress());
		System.out.println("toString: " + ip); 
		
		System.out.println(" + + ���α׷� ���� ���� + + "); 

	}

}
