package condition;

import java.util.Scanner;

public class teacher {
	
	public static void main(String[] args) {
		
		int select;	// 메뉴선택
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World 출력");
			System.out.println("\t2. 이름 출력");
			System.out.println("\t3. 성별 출력");
			System.out.println("\t4. 종료");
			System.out.println("===============================");
	
			// 메뉴 선택 입력받기
			System.out.print("\n >> ");
			select = sc.nextInt();
			
			if( select == 1 ) {
				System.out.println("Hello World");
			} else if(select == 2) {
				System.out.println("한지오");
			}
			
		} while( select != 4 );	// while end
		
	}

}
