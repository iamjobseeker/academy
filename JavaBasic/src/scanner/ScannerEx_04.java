package scanner;

import java.util.Scanner;

public class ScannerEx_04 {

	public static void main(String[] args) {
		
		//Ctrl+Shift+O 누르면 scanner를 자동 import해줌
		// 키보드 입력을 받을수 있도록 해주는 기능
		// system.in 은 키보드의 입력을 뜻한다
		Scanner input = new Scanner(System.in);
		
		// nextline을 제외한 scanner의 nextXXX()계열
		// 메소드를 호출하면 버퍼에서 '개행문자(\r\n)'을 처리하지 않고 남겨두게 된다
		// 이후 nextline()을 사용할 경우 이전에 처리되지 않은 '개행문자(\r\n)'을 scan해버려서
		// 제대로 입력을 받지 않는 상황
		
		input.nextLine();    //해결1. 버퍼의 \r\n을 입력받아 버린다
		input.skip("\r\n");  //해결2. 버퍼의 \r\n을 모두 지운다
		
		
		System.out.print("이름을 입력해주세요: "); 
		String name = input.nextLine();
		
		System.out.print("성별을 입력해주세요: ");
		String gender = input.nextLine();
		
		System.out.print("나이를 입력해주세요: ");
		int age = input.nextInt();
		
		System.out.print("키를 입력해주세요: ");
		double height = input.nextDouble();
		
		System.out.println("이름: " + name + ", 나이: " + age
				+", 성별: "+gender+", 키: "+ height);
		
	}
}