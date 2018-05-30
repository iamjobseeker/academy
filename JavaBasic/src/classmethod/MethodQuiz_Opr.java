package classmethod;

import java.util.Scanner;

public class MethodQuiz_Opr {
	
	public static void main(String[] args) {
		
		MethodQuiz m = new MethodQuiz();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자는? : ");
		int num1 = input.nextInt();
		System.out.print("두 번재 숫자는? : ");
		int num2 = input.nextInt();
		
		System.out.println("연산은? :");
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
