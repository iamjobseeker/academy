package condition;

import java.util.Scanner;

public class SwitchEx_05 {

	public static void main(String[] args) {

		int select;	// 메뉴선택
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World 출력");
			System.out.println("\t2. 이름 출력");
			System.out.println("\t3. 성별 출력");
			System.out.println("\t4. 종료");
			System.out.println("===============================");
			
			// 메뉴 선택 입력받기
			System.out.print("\n>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("Hello world");
				break;

			case 2:
				System.out.println("황진경");
				break;

			case 3:
				System.out.println("여");
				break;

			case 4:
				System.out.println("종료되었습니다.");
				break;
				
			default: 
				System.out.println("잘못된 메뉴입니다.");

			}
		} while(select != 4);



	} 

}

