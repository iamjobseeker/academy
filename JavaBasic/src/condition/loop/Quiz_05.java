package condition.loop;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		

		apple:
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			int num=input.nextInt();
			if(num==0) { 
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			else {
				for(int j=2; j<=num; j++) {
					for(int i=2; i<=j; i++) {
						int rest=j%i;
						if(rest==0) {
							if(i==j) {
								System.out.println(j+": �Ҽ�");
								break;
							} else {
								System.out.println(j+": �Ҽ��� �ƴ�");
								break; 
							} 
						}
					}
				} 
				continue apple; 
			}  
		}
	}
}