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
		
		System.out.println(num1>num2? "�� ū ���� "+num1+"�Դϴ�.":num2+"�� num1���� ũ�ų� �����ϴ�.");
		
	}
	
}
