package constructor;

import java.util.Scanner;

class Constructor_01{
	private int num1;
	private int num2 = 200;  // 수행순서 1번째
	
	private Scanner sc;
	
	public Constructor_01() {
		System.out.println("디폴트 생성자");
		
		num1 = 100;  // this 안 붙여도 괜찮은 상황
		this.num2 = 200;  // 수행순서 2번째
		
		sc = new Scanner(System.in);
	}
	
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void out() {
		System.out.println(num1+","+num2);
	}
	
	// return type이 있는것은 생성자가 아니다
//	public void Constructor_01() {
//		System.out.println("일반 메소드");
//	}

}

public class ConstructorEx_01 {
	public static void main(String[] args) {
		Constructor_01 cons01 ;
		cons01 = new Constructor_01();
		cons01.out();
		
		Constructor_01 cons02;
		cons02 = new Constructor_01(111,222);
		cons02.out();
	}

}
