package condition.loop;

import java.util.Scanner;

public class just {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		
		do {
			System.out.print("input: ");
			num=input.nextInt();
			System.out.println("a");
		} while(num!=999);
		
	}

}
