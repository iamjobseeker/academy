package condition.loop;

import java.util.Scanner;

public class teacher1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int num;
		//				while(true) {
		for(;;) {
			System.out.println("1. ����");
			System.out.println("2. ȣȣ");
			System.out.println("3. ����");
			System.out.print(" >> ");
			num = sc.nextInt();

			// 1~3 �� �Է��� �ƴ� ��� ó��
			if( num < 1 || num > 3 ) {
				System.out.println("���� �޴�!");
				continue;
			}

			switch(num) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("ȣȣȣ");
				break;
			case 3:
				System.out.println("����");
				break;
				//					default:
				//						System.out.println("���� �޴�!");
			}

			// ����
			if( num == 3 )	break;
		}
	}
}
