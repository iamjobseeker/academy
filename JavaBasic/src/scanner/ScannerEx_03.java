package scanner;

import java.util.Scanner;

public class ScannerEx_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Message: ");
		String msg = input.nextLine();
		
		System.out.print("Input Number: ");
		int num = input.nextInt();
		
		System.out.println("MSG: " + msg +", NUM: "+num);
		
	}

}
