package classmethod;

import java.util.Scanner;

public class MethodQuiz_Opr {
	
	public static void main(String[] args) {
		
		MethodQuiz m = new MethodQuiz();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڴ�? : ");
		int num1 = input.nextInt();
		System.out.print("�� ���� ���ڴ�? : ");
		int num2 = input.nextInt();
		
		System.out.println("������? :");
		String strInput = input.nextLine();
		char cal = strInput.charAt(0);
		
		switch(cal) {
		case '+': System.out.println(num1+" + "+num2+" = "+m.sum(num1, num2));
		case '-': System.out.println(num1+" - "+num2+" = "+m.sub(num1, num2));
		case '*': System.out.println(num1+" * "+num2+" = "+m.mul(num1, num2));
		case '/': System.out.println(num1+" / "+num2+" = "+m.div(num1, num2));
		break;
		}
		
	}

}
