package condition.loop;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num=0;
//		String str;  
		
		while(true) {
			System.out.print("������ �ܼ��� �Է����ּ���: ");
			num=input.nextInt();
			if(num==0) {  // num�� �ƴ� String���� �޴� �� �غ���
				System.out.println("----------");
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else for(int i=1;i<=9;i++) {
				System.out.println(num+" X "+i+" = "+(num*i));}
		} 

	}

}
