package scanner;

import java.util.Scanner;  //다른 패키지(Scanner)에 있는 것을 가져옴 

public class ScannerEx_01 {

	public static void main(String[] args) {
		
		// Scanner 객체 생성
		// 키보드 입력을 받을수 있도록 해주는 기능
		// system.in 은 키보드의 입력을 뜻한다
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt(); // 사용자 입력 대기
		// 키보드의 입력을 받음 (int형 값이어야 함)
		
		System.out.println("Input Number : " + num);
		
	}

}
