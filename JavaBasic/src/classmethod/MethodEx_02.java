package classmethod;

import java.util.Scanner;

public class MethodEx_02 {
	
	public static void main(String[] args) {
		
		Method_02 m = new Method_02();
		
		m.r_itg(); 
		
		m.r_apple(3);
		
		m.r_two(6, "Think positive");
		
		Method_02.r_two(2,"happy"); // static이 있으면 이렇게 호출할수도 있다
		
		Method_02.r_itg(); 
		
		// 이 부분 신기함
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력할까요? ");
		m.r_apple( sc.nextInt() );
		// 요기까지
		
		// System.in: 키보드를 나타냄
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇 번 출력할까요?");
		int cnt=input.nextInt();
		
		// \n 등의 개행문자를 비워줘야 함
		input.nextLine();
		
		System.out.println("어떤 문구를 출력할까요?");
		String str=input.nextLine();
		m.r_two(cnt, str);

	}

}
