package operator;

import java.util.Scanner;

public class OperatorQuiz_03 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Input Number1: ");
		num1=num.nextInt();
		System.out.println("Input Number2: ");
		num2=num.nextInt();
		
		System.out.println(num1>num2? "더 큰 수는 "+num1+"입니다.":num2+"는 num1보다 크거나 같습니다.");
		
	}
	
}
