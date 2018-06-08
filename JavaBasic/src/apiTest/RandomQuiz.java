package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {

		// 가위바위보 게임 만들기

		// int user : 사용자입력 (1~3)
		// int com : 컴퓨터랜덤(1~3)

		// 1: 가위, 2: 바위, 3: 보

		// 1. Random을 이용하여 com에 값 저장
		// 2. user에 입력받기
		// 3. com, user 비교 (가위바위보 승부)
		// 4. 결과 출력 (승자)

		// 1~4 단계 반복


		int user;
		int com;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);

		do {com = random.nextInt(3)+1;

			System.out.println();
			System.out.println("가위바위보! (｡☌ᴗ☌｡)");
			System.out.println("가위: 1");
			System.out.println("바위: 2");
			System.out.println("보: 3");
			System.out.println("종료: 9");
			System.out.print(">>> ");

			user = input.nextInt();

			if (user==1) {
				System.out.println();
				System.out.println("사용자가 가위를 냈습니다 ( ･∀･)ﾉｼ");
				System.out.println();
				switch(com) {
				case 1 : 
					System.out.println("사용자: 가위, 컴퓨터: 가위");
					System.out.println("무승부 (*´﹃｀*)");
					break;
				case 2 :
					System.out.println("사용자: 가위, 컴퓨터: 바위");
					System.out.println("컴퓨터 승리 (ﾟДﾟ;≡;ﾟдﾟ) ");
					break;
				case 3:
					System.out.println("사용자:가위, 컴퓨터: 보");
					System.out.println("사용자 승리 (੭ु ›ω‹ )੭ु⁾⁾♡");
					break;
				}
			} else if (user==2){
				System.out.println();
				System.out.println("사용자가 바위를 냈습니다 ٩(๑´0`๑)۶");
				System.out.println();
				switch(com) {
				case 1:
					System.out.println("사용자: 바위, 컴퓨터: 가위");
					System.out.println("사용자 승리 // / /٩( 'ω' )و //／");
					break;
				case 2:
					System.out.println("사용자: 바위, 컴퓨터: 바위");
					System.out.println("무승부");
					break;
				case 3:
					System.out.println("사용자: 바위, 컴퓨터: 보");
					System.out.println("컴퓨터 승리 (ˊ̥̥̥̥̥ ³ ˋ̥̥̥̥̥)");
					break;
				}

			} else if(user==3) {
				System.out.println();
				System.out.println("사용자가 보를 냈습니다 ฅ^._.^ฅ");
				System.out.println();
				switch(com) {
				case 1:
					System.out.println("사용자: 보, 컴퓨터: 가위");
					System.out.println("컴퓨터 승리");
					break;
				case 2:
					System.out.println("사용자: 보, 컴퓨터: 바위");
					System.out.println("사용자 승리 ╭(๑•̀ㅂ•́)و");
					break;
				case 3:
					System.out.println("사용자: 보, 컴퓨터: 보");
					System.out.println("무승부 ◟꒰◍´Д‵◍꒱◞");
					break;
				}

			} else if(user!=9) {
				System.out.println();
				System.out.println("1~3 사이의 숫자를 입력해주세요.");
				continue;
			}
			
		} while(user!=9);
		System.out.println();
		System.out.println("가위바위보가 종료되었습니다 ₍˄·͈༝·͈˄₎ฅ˒˒");

	}
}
