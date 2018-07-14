package condition.loop;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true) {

			System.out.println("---메뉴---");
			System.out.println("1. 최소공배수" );
			System.out.println("2. 최대공약수");
			System.out.println("3. 종료");
			System.out.println("----------");
			System.out.print("선택해주세요: ");
			int menu=input.nextInt();

			if(menu==1) {System.out.println("\n[최소공배수]");
			System.out.print("첫번재 숫자 입력: ");
			int num1=input.nextInt();
			System.out.print("두번재 숫자 입력: ");
			int num2=input.nextInt();
			int lcm=0;
			int cm=num1 * num2;
			int max1=num1>=num2? num1:num2;

			for(int i=max1; ; i++) {
				if(i%num1==0 && i%num2==0) {
					lcm=i;
					break;
				}
			}
			System.out.println("최소공배수: "+lcm+"\n");
			} else if(menu==2) {System.out.println("\n[최대공약수]");
			System.out.println("첫번째 숫자 입력: ");
			int val1=input.nextInt();
			System.out.println("두번재 숫자 입력: "); 
			int val2=input.nextInt();

			int min= val1<=val2? val1: val2;
			int max= val1>val2? val1: val2;

			for(int i=min; i>=1; i--) {
				if(max%i==0 && min%i==0) {
					int gcd=i;
					System.out.println(">> 최대공약수: "+gcd+"\n");
					break;
				}
			} 
			}else {
				System.out.println("\n[죵료되었습니다]");
				break;
			}

		}

	}

}


//
//System.out.println("\n종료하시겠습니까? [y/n]: ");
//String exit=input.nextLine();
//if(exit=="y"||exit=="Y") {
//	break;
//} else {
//	continue;
//}
