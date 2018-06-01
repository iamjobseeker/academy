package constructor;

import java.util.Scanner;

class Constructor_01{
	private int num1;
	private int num2 = 200;  // ������� 1��°
	
	private Scanner sc;
	
	public Constructor_01() {
		System.out.println("����Ʈ ������");
		
		num1 = 100;  // this �� �ٿ��� ������ ��Ȳ
		this.num2 = 200;  // ������� 2��°
		
		sc = new Scanner(System.in);
	}
	
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void out() {
		System.out.println(num1+","+num2);
	}
	
	// return type�� �ִ°��� �����ڰ� �ƴϴ�
//	public void Constructor_01() {
//		System.out.println("�Ϲ� �޼ҵ�");
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
