package condition.loop;

import java.util.Scanner;

public class ForEx_07 {

	public static void main(String[] args) {

		// ���ݾ�: 10, 10*2, 10*2^2, 10*2^3 ...
		// ��¥: 15��

		int sum=0;

		for(int i=10; i<10*Math.pow(2, 15); i*=2) {  //10=10*2^0
			sum+=i;
		}
		System.out.println("�Ѿ�: "+sum+"��");

		int money=10;
		int account=0;

		for(int i=1; i<=15; i++) {
			account+=money;
			money*=2;
		}
		System.out.println("�Ѿ�2: "+account+"��");

		Scanner div=new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է�: ");
		num=div.nextInt();
		int set;

		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				set=i;
				System.out.print(set+"\t");}
		}
		
		System.out.println("--->\t"+num+"�� ���");
	}

}

