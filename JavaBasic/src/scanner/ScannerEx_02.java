package scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	
	public static void main(String[] args) {
		
		// 입력 객체 Scanner
		Scanner input = new Scanner(System.in);
		
		// 입력 안내 메시지
		System.out.print("Input: ");
		
		// 문자열 입력받는 기능
		String str = input.nextLine();
		
		// 출력
		System.out.println("입력 데이터: " + str); 
		
	}

}
