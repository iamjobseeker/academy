package operator;

import java.util.Scanner;

public class myTest {

	public static void main(String[] args) {
		
		Scanner test = new Scanner(System.in);
		String id1;
		String id2;
		
		System.out.println("아이디1을 입력하세요: ");
		id1=test.nextLine();
		System.out.println("아이디1: " + id1);
		System.out.println("-----------");
		
		System.out.println("아이디2를 입력하세요 (단, 아이디는 중복 불가): ");
		id2=test.nextLine();
		
		if (id1==id2) {
			
			System.out.println("에러: 두 아이디가 같습니다");
		}
		
		else {
			System.out.println("아이디2: " +id2);
		}
		
		System.out.println("사용자 아이디: " +id1+", " +id2);
		
	}
	
}
