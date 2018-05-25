package condition.loop;

import java.util.Scanner;

public class WhileEx_03_Quiz {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input: ");
		int num=input.nextInt();
		int i=1;
		int sum=0;
		
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("total: "+sum);
		
	
	}
	
}
