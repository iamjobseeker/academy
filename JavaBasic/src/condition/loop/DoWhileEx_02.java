package condition.loop;

import java.util.Scanner;

public class DoWhileEx_02 {

	public static void main(String[] args) {
		
		System.out.print("Input: ");
		Scanner sc=new Scanner(System.in);
		
		// 99가 입력되면 종료
		
		int num;
		
		do {
			num=sc.nextInt();
			System.out.println("Continue");
			System.out.print("Input: ");
		} while(num != 99);
		
	}
	
	
}
