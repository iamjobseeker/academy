package condition;

import java.util.Scanner;

public class SwitchEx_05 {

	public static void main(String[] args) {

		int select;	// �޴�����
		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1. Hello World ���");
			System.out.println("\t2. �̸� ���");
			System.out.println("\t3. ���� ���");
			System.out.println("\t4. ����");
			System.out.println("===============================");
			
			// �޴� ���� �Է¹ޱ�
			System.out.print("\n>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("Hello world");
				break;

			case 2:
				System.out.println("Ȳ����");
				break;

			case 3:
				System.out.println("��");
				break;

			case 4:
				System.out.println("����Ǿ����ϴ�.");
				break;
				
			default: 
				System.out.println("�߸��� �޴��Դϴ�.");

			}
		} while(select != 4);



	} 

}

