package condition.loop;

import java.util.Scanner;

public class EtcEx_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int num;
//		while(true) {
//			System.out.println("1. haha");
//			System.out.println("2. hoho");
//			System.out.println("3. exit");
//			System.out.print(" >> ");
//			num=sc.nextInt();
//
//			if(num == 3 ) break;
//		}

		int num;

//		while(true) {
			for(;;) {

				System.out.println("1. haha");
				System.out.println("2. hoho");
				System.out.println("3. exit");
				System.out.print(" >> ");
				num=sc.nextInt();


				// 1~3의 입력이 아닌 경우 처리
				if(num < 1 || num >3) {
					System.out.println("no menu");
					continue;
				}

				switch(num) {
				case 1:
					System.out.println("haha");
					break;

				case 2:
					System.out.println("hoho");
					break;

				case 3:
					System.out.println("bye");
					break;
				}

				if (num==3) break;
				
			}
		}
	}
//}


