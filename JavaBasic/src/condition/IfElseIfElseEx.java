package condition;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {

		//   if(condition1) {
		// 		조건식1이 참일 때 수행
		// } else if(condition2) {
		// 		조건식2가 참일 때 수행
		// }  else {
		// 		위의 모든 조건식이 거짓일 때 수행
		// }

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Input number: ");
		num = sc.nextInt();

		int i;

		if(num>0) {
			System.out.println("is positive.");
		} else if(num==0) {
			System.out.println("is Zero.");
		} else {
			System.out.println("is negative.");

		}
	}

}
