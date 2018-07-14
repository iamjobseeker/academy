package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress { 
	public static void main(String[] args) {
		
		// InetAddress : IP정보를 다루는 클래스 
		InetAddress ip = null;
		
		// InetAddress의 메소드 getByName 
		// 파라미터 : DNS주소
		// 반환 : ip주소		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace(); 
		}
		
		// host name = node name = DNS 	
		System.out.println("hostname: " + ip.getHostName());
		System.out.println("hostaddress: " + ip.getHostAddress());
		// println에 객체(ip)를 넣으면 자동으로 toString됨 
		System.out.println("toString: " + ip); 
		
		System.out.println("-------"); 
		
		// 배열에 8bit씩 ip주소를 넣어준다 
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress(): " + ipAddr); // 배열의 참조값 출력 
		System.out.println("getAddress(): " + Arrays.toString(ipAddr)); // 배열의 값 출력 
		
		// ip주소: 161 -> ipAddr: -95 (unsigned) 
		for(byte i : ipAddr) {
			System.out.print( (i<0)? i+256 : i);
			System.out.print(".");
		}
		
		// local host : 자기 자신의 DNS
		System.out.println("\n---localhost---");
		try {
			// 자기 자신의 호스트 정보 얻기 
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) { 
			e.printStackTrace();
		}
		System.out.println("hostname: " + ip.getHostName());
		System.out.println("hostaddress: " + ip.getHostAddress());
		System.out.println("toString: " + ip); 
		
		System.out.println(" + + 프로그램 정상 종료 + + "); 

	}

}
