package condition;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int tot;
		double avg;
		
		System.out.println("---Q1---\nMultiple of 3?" );
		System.out.print("Input number: ");
		num1=sc.nextInt();
		
		if(num1%3==0) {
			System.out.println("num1["+num1+ "] is a multiple of 3.");
		}
		else {
			System.out.println("num1["+num1+"] is not a multiple of 3.");
		}

		System.out.println("\n---Q2---\nBigger number?");
		System.out.print("Input number1: ");
		num1=sc.nextInt();
		System.out.print("Input number2: ");
		num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("num1["+num1+"] is bigger.");
		} else if(num1<num2){
			System.out.println("num2["+num2+"] is bigger.");
		} else {
			System.out.println("num1["+num1+ "] and num2["+num2+ "] are same");
		}
		
		System.out.println("\n---Q3---\nBiggest number? [3 numbers]");
		System.out.print("input number1: ");
		num1=sc.nextInt();
		System.out.print("input number2: ");
		num2=sc.nextInt();
		System.out.print("input number3: ");
		num3=sc.nextInt();
		
		int max;
		if(num1 >= num2) {
			max = num1;
		} else {
			max = num2;
		} 
		if(max < num3) {
			max = num3; 
		}
		System.out.println("Biggest number is " + max);
		
		
//		if(num1>num2 && num1>num3) {
//			System.out.println("num1["+num1+"] is biggest.");
//		} else if(num2>num1 && num2>num3) {
//			System.out.println("num2["+num2+"] is biggest.");
//		} else if(num3>num1 && num3>num2){
//			System.out.println("num3["+num3+"] is biggest.");
//		} else if(num1==num2 && num1>num3) {
//			System.out.println("num1["+num1+"] and num2["+num2+"] is biggest.");
//		} else if(num3==num2 && num1<num3) {
//			System.out.println("num2["+num2+"] and num3["+num3+"] is biggest.");
//		} else if(num3==num2 && num1>num2) {
//			System.out.println("num1["+num1+"] and num3["+num3+"] is biggest.");
//		} else {
//			System.out.println("num1, 2, 3[" +num1+ "] are same.");
//		}
		
		System.out.println("\n---Q4---\nSum of two numbers.");
		System.out.print("Input number1: ");
		num1=sc.nextInt();
		System.out.print("Input number2: ");
		num2=sc.nextInt();
		num3=num1+num2;
		
//		boolean b = false;
//		if( sum %2==0 && sum%3 ==0) {
//			b=true;
//		}
//		
//		System.out.print();
//		if (b==true) {
//			System.out.println("2,3 의 배수이다.");
//		} else {
//			System.out.println("2, 3의 배수가 아니다.");
//		}
		
		
		
		if(num3%6==0) {
			System.out.println("sum of num1 and num2["+num3+"] is a multiple of 2 and 3.");
		} else {
			System.out.println("sum of num1 and num2["+num3+"] is not a multiple of 2 nor 3.");
		}
		
		
		System.out.println("\n---Q5---\nThree scores.");
		System.out.print("Input score 1: ");
		num1=sc.nextInt();
		System.out.print("Input score 2: ");
		num2=sc.nextInt();
		System.out.print("Input score 3: ");
		num3=sc.nextInt();
		
		tot=num1+num2+num3;
		avg=tot/3.0; //double 형 변환 잊지말자!!!
		System.out.println("Your total score is "+tot );
		System.out.printf("Your Average score is %.2f\n", avg); 
		
		char grade = '\0';	// 널 문자, 아스키코드가 0인 문자
		if(avg>=90) {
			grade = 'A';
		} else if(avg>=80) {
			grade = 'B';
		} else if(avg>=70) {
			grade = 'C';
		} else if(avg>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("Your grade is "+grade);
	
	}
}








