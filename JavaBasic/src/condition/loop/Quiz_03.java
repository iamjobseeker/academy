package condition.loop;

import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("��� ���ϱ�: ");
		int num=input.nextInt();
		System.out.print(num+"�� �����: ");

		
		// 1���� �־��� �������� 1�� ������Ű�� ��� ������ �������� ��
		// �������� 0�� ���ڵ�(���)�鸸 ����Ѵ�
		
		for (int i=1;i<=num;i++) {
			int rest=num%i;
			if(rest==0) {
				System.out.print(i+" ");
			}

		}

	}

}
