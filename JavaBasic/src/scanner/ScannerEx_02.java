package scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	
	public static void main(String[] args) {
		
		// �Է� ��ü Scanner
		Scanner input = new Scanner(System.in);
		
		// �Է� �ȳ� �޽���
		System.out.print("Input: ");
		
		// ���ڿ� �Է¹޴� ���
		String str = input.nextLine();
		
		// ���
		System.out.println("�Է� ������: " + str); 
		
	}

}
