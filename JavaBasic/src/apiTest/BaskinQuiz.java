package apiTest;

import java.util.Random;
import java.util.Scanner;

public class BaskinQuiz {

	public static void main(String[] args) {

		int user = 1;
		int com;
		int stt = 0; 

		Random random = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("=============");
		System.out.println("베스킨라빈스 31~!");
		System.out.println("=============");
		System.out.println();

		do {
			do { 
				System.out.println("1~3 중 몇 개의 숫자를 말하시겠습니까?");
				System.out.print(">>> ");
				user=input.nextInt();
				System.out.println();

				if(user>3 || user <1) {
					System.out.println("1~3 사이의 값을 입력해주세요.");
					System.out.println();
				} else { 
					System.out.println("사용자는 " + user + "개의 숫자를 선택했습니다.");
					break;
				}
			} while(user<1 || user>3);

								  // 31이라는 조건추가
			for (int i=1; i<=user && stt<31 ; i++) {
				stt+=1;
				System.out.println("현재 숫자는");
				System.out.println(stt);
				if(stt>=31) {
					System.out.println("컴퓨터의 승리!");
					break;
				}
			}  

			if(stt==29) com=1;
			else com = random.nextInt(3)+1;

			System.out.println();
			System.out.println("컴퓨터는 " + com + "개의 숫자를 선택했습니다.");

								 // 31이라는 조건추가 
			for (int i=1; i<=com && stt<31; i++) {
				stt+=1; 
				System.out.println("현재 숫자는");
				System.out.println(stt);
				if(stt>=31) {
					System.out.println("사용자의 승리!");
					break;
				}
			}
		} while (stt < 31); 
	}
}
