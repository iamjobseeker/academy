package condition.loop;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true) {
			
			System.out.print("1. �ּҰ����" );
			System.out.print("2. �ִ�����");
			System.out.print("3. ����");
			
			System.out.println("[�ּҰ����]");
			System.out.print("ù���� ���� �Է�: ");
			int num1=input.nextInt();
			System.out.print("�ι��� ���� �Է�: ");
			int num2=input.nextInt();
			int lcm=0;
			int cm=num1 * num2;

			for(int i=1; i<=cm; i++) {
				if(i%num1==0 && i%num2==0) {
					lcm=i;
					break;
				}
			}
			System.out.println(">> �ּҰ����: "+lcm);
			System.out.println("\n[�ִ�����]");


			System.out.println("ù��° ���� �Է�: ");
			int val1=input.nextInt();
			System.out.println("�ι��� ���� �Է�: ");
			int val2=input.nextInt();
			int min= val1<=val2? val1: val2;
			int max= val1>val2? val1: val2;

			for(int i=min; i>=1; i--) {
				if(max%i==0 && min%i==0) {
					int gcd=i;
					System.out.println(">> �ִ�����: "+gcd);
					break;
				}
			} 

		}

	}

}


//
//System.out.println("\n�����Ͻðڽ��ϱ�? [y/n]: ");
//String exit=input.nextLine();
//if(exit=="y"||exit=="Y") {
//	break;
//}else {
//	continue;
//}
