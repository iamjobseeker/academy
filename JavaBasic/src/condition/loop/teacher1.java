package condition.loop;

import java.util.Scanner;

public class teacher1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int num;
		//				while(true) {
		for(;;) {
			System.out.println("1. 하하");
			System.out.println("2. 호호");
			System.out.println("3. 종료");
			System.out.print(" >> ");
			num = sc.nextInt();

			// 1~3 의 입력이 아닐 경우 처리
			if( num < 1 || num > 3 ) {
				System.out.println("없는 메뉴!");
				continue;
			}

			switch(num) {
			case 1:
				System.out.println("하하하");
				break;
			case 2:
				System.out.println("호호호");
				break;
			case 3:
				System.out.println("빠이");
				break;
				//					default:
				//						System.out.println("없는 메뉴!");
			}

			// 종료
			if( num == 3 )	break;
		}
	}
}
