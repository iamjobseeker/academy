package classmethod;

import java.util.Scanner;

public class MethodEx_02 {
	
	public static void main(String[] args) {
		
		Method_02 m = new Method_02();
		
		m.r_itg(); 
		
		m.r_apple(3);
		
		m.r_two(6, "Think positive");
		
		Method_02.r_two(2,"happy"); // static�� ������ �̷��� ȣ���Ҽ��� �ִ�
		
		Method_02.r_itg(); 
		
		// �� �κ� �ű���
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����ұ��? ");
		m.r_apple( sc.nextInt() );
		// ������
		
		// System.in: Ű���带 ��Ÿ��
		Scanner input = new Scanner(System.in);
		
		System.out.println("�� �� ����ұ��?");
		int cnt=input.nextInt();
		
		// \n ���� ���๮�ڸ� ������ ��
		input.nextLine();
		
		System.out.println("� ������ ����ұ��?");
		String str=input.nextLine();
		m.r_two(cnt, str);

	}

}
