package scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	//문자열 입력받는 Scanner의 메소드
	/*
	 * nextXXX: 공백문자(white space)를 기준으로 하나의 문자만 받는다
	 *  \n  : 개행(new line)
	 *  ' ' : 띄어쓰기(space)
	 *  \t  : 수평탭(horizontal tab)
	 */
	//nextLine: 띄어쓰기 포함해서 모든 문자열을 받는다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		String str3;
		
		//문자열 입력
		//System.out은 모니터에 출력하라는 의미
		System.out.println("Input: ");
		str1 = sc.next();
		str2 = sc.next();
		
		sc.skip("\r\n");  // 버퍼 비우기
						  // nextLine에서 공백문자를 인식하는 것 방지
		
		str3 = sc.nextLine();
		System.out.println("----출력----");
		System.out.println(" str1 : " + str1);
		System.out.println(" str2 : " + str2);
		System.out.println(" str3 : " + str3);		
		
		
		
		
		
		
	}
}





