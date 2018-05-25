package condition.loop;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("약수 구하기: ");
		int num=input.nextInt();
		System.out.print(num+"의 약수는: ");

		for (int i=1;i<=num;i++) {
			int rest=num%i;
			if(rest==0) {
				System.out.print(i+" ");
			}

		}

	}

}
