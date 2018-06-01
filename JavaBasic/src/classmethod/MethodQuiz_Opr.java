package classmethod;

import java.util.Scanner;

public class MethodQuiz_Opr {

	public static void main(String[] args) {

		MethodQuiz m = new MethodQuiz();
		Scanner input = new Scanner(System.in);

		while(true) {
//			input.nextLine();
//			input.skip("\r\n");
			
			System.out.print("첫 번째 숫자는? : ");
			int num1 = input.nextInt();

			System.out.print("연산은? : ");
			String str = input.next();
			char cal = str.charAt(0); 

			// 잘못된 연산자 입력했을 때의 처리
			if (cal!='+' && cal!='-' && cal!='*' && cal!='/') {
				if(str=="exit" || str=="Exit") {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				System.out.print("잘못된 연산자를 입력했습니다.\n프로그램을 종료합니다.");
				System.out.println("\n");
				return;		// main(method)이 return되어 프로그램이 종료4된다
				//break;	// while문 종료
			}

			System.out.print("두 번재 숫자는? : ");
			int num2 = input.nextInt();

			// String str = input.next();
			// char cal = str.charAt(0);
			// 을 한줄로 줄였음

			switch(cal) {
			case '+': System.out.println(num1+" + "+num2+" = "+m.sum(num1, num2));
			break;
			case '-': System.out.println(num1+" - "+num2+" = "+m.sub(num1, num2));
			break;
			case '*': System.out.println(num1+" * "+num2+" = "+m.mul(num1, num2));
			break;
			case '/': System.out.printf(num1+ " / " +num2+" = %.2f", m.div(num1, num2));
			// + 로 서로다른 데이터 타입을 연결하면
			// 맨 앞의 데이터 타입으로 모두 변환된다
			// (int)3 + (String)"은" => (int)3은  이라고 출력됨
			break;

// 			if문으로 인해 필요없는 코드가 되었다.
//			default: System.out.println("정확한 연산자를 입력해주세요.");

			}

		}

	}

}
