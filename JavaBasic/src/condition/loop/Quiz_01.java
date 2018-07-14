package condition.loop;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num=0;
//		String str;  
		
		while(true) {
			System.out.print("구구단 단수를 입력해주세요: ");
			num=input.nextInt();
			if(num==0) {  // num이 아닌 String으로 받는 것 해보기
				System.out.println("----------");
				System.out.println("종료되었습니다.");
				break;
			} else for(int i=1;i<=9;i++) {
				System.out.println(num+" X "+i+" = "+(num*i));}
		} 

	}

}
