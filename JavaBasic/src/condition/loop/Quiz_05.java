package condition.loop;

import java.util.Scanner;

public class Quiz_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		

		apple:
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num=input.nextInt();
			if(num==0) { 
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				for(int j=2; j<=num; j++) {
					for(int i=2; i<=j; i++) {
						int rest=j%i;
						if(rest==0) {
							if(i==j) {
								System.out.println(j+": 소수");
								break;
							} else {
								System.out.println(j+": 소수가 아님");
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