package classmethod;

import java.util.Scanner;

public class MethodQuiz_Opr {

	public static void main(String[] args) {

		MethodQuiz m = new MethodQuiz();
		Scanner input = new Scanner(System.in);

		while(true) {
//			input.nextLine();
//			input.skip("\r\n");
			
			System.out.print("ù ��° ���ڴ�? : ");
			int num1 = input.nextInt();

			System.out.print("������? : ");
			String str = input.next();
			char cal = str.charAt(0); 

			// �߸��� ������ �Է����� ���� ó��
			if (cal!='+' && cal!='-' && cal!='*' && cal!='/') {
				if(str=="exit" || str=="Exit") {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				System.out.print("�߸��� �����ڸ� �Է��߽��ϴ�.\n���α׷��� �����մϴ�.");
				System.out.println("\n");
				return;		// main(method)�� return�Ǿ� ���α׷��� ����4�ȴ�
				//break;	// while�� ����
			}

			System.out.print("�� ���� ���ڴ�? : ");
			int num2 = input.nextInt();

			// String str = input.next();
			// char cal = str.charAt(0);
			// �� ���ٷ� �ٿ���

			switch(cal) {
			case '+': System.out.println(num1+" + "+num2+" = "+m.sum(num1, num2));
			break;
			case '-': System.out.println(num1+" - "+num2+" = "+m.sub(num1, num2));
			break;
			case '*': System.out.println(num1+" * "+num2+" = "+m.mul(num1, num2));
			break;
			case '/': System.out.printf(num1+ " / " +num2+" = %.2f", m.div(num1, num2));
			// + �� ���δٸ� ������ Ÿ���� �����ϸ�
			// �� ���� ������ Ÿ������ ��� ��ȯ�ȴ�
			// (int)3 + (String)"��" => (int)3��  �̶�� ��µ�
			break;

// 			if������ ���� �ʿ���� �ڵ尡 �Ǿ���.
//			default: System.out.println("��Ȯ�� �����ڸ� �Է����ּ���.");

			}

		}

	}

}
