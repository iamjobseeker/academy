package apiTest;

import java.util.Random;
import java.util.Scanner;

public class BaskinQuiz {

	public static void main(String[] args) {

		int user = 1;
		int com;
		int stt = 0; 

		Random random = new Random();
		Scanner input = new Scanner(System.in);

		System.out.println("=============");
		System.out.println("����Ų��� 31~!");
		System.out.println("=============");
		System.out.println();

		do {
			do { 
				System.out.println("1~3 �� �� ���� ���ڸ� ���Ͻðڽ��ϱ�?");
				System.out.print(">>> ");
				user=input.nextInt();
				System.out.println();

				if(user>3 || user <1) {
					System.out.println("1~3 ������ ���� �Է����ּ���.");
					System.out.println();
				} else { 
					System.out.println("����ڴ� " + user + "���� ���ڸ� �����߽��ϴ�.");
					break;
				}
			} while(user<1 || user>3);

								  // 31�̶�� �����߰�
			for (int i=1; i<=user && stt<31 ; i++) {
				stt+=1;
				System.out.println("���� ���ڴ�");
				System.out.println(stt);
				if(stt>=31) {
					System.out.println("��ǻ���� �¸�!");
					break;
				}
			}  

			if(stt==29) com=1;
			else com = random.nextInt(3)+1;

			System.out.println();
			System.out.println("��ǻ�ʹ� " + com + "���� ���ڸ� �����߽��ϴ�.");

								 // 31�̶�� �����߰� 
			for (int i=1; i<=com && stt<31; i++) {
				stt+=1; 
				System.out.println("���� ���ڴ�");
				System.out.println(stt);
				if(stt>=31) {
					System.out.println("������� �¸�!");
					break;
				}
			}
		} while (stt < 31); 
	}
}
