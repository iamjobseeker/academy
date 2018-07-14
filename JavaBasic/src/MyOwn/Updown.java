package MyOwn;

import java.util.Random;
import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {

		Random ran = new Random();
		int com = ran.nextInt(50)+1;

		Scanner input = new Scanner(System.in);

		int chance=1;
		
		System.out.println("======UP & DOWN=====");

		while(chance<=7) {
			System.out.print("값을 입력하세요: ");
			int user = input.nextInt();

			if(user>com) {
				System.out.println("DOWN!");
				chance+=1;
				continue;
			} else if(user<com) {
				System.out.println("UP!");
				chance+=1;
				continue;
			} else {
				System.out.println("\n⁽⁽◝( ˙ ꒳ ˙ )◜⁾ ⁾정답입니다 ◟( ˘ ³˘)◞ ♡");
				break;
			}
		} 

		if(chance>7) {
			System.out.println("\nᕙ(•̀‸•́‶)ᕗ 틀렸습니다 (˃̶᷄‧̫ ˂̶᷅๑ )");
			
		}

	}

}
