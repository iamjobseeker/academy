package condition.loop;

import java.util.Scanner;

public class ForEx_09 {
	
	public static void main(String[] args) {
		
		// 중첩 for문
		
		// 구구단 출력
		
		Scanner ggd=new Scanner(System.in);
		System.out.print("몇 단: ");
		
		int i=ggd.nextInt();
		
		for(int dan=i; dan==i; dan++) {
			for(int num=2; num<=9; num++) {
				System.out.println(dan+" X "+num+" = "+(dan*num));
			}
		}
		
	}

}
