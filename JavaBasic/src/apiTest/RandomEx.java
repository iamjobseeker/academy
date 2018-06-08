package apiTest;

import java.util.Random;

// Random�� java.util�� ���ϴ� Ŭ������ import�Ͽ� ����Ͽ��� �Ѵ�
// Ctrl + Shift + O

public class RandomEx {
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		System.out.println(rd.nextInt());  // int�� �������� ���� ����
		System.out.println(rd.nextDouble());  // math.random�� ����
		System.out.println(rd.nextBoolean());
		
		System.out.println("--------------");
		
		System.out.println(rd.nextInt(10));  // 0~9
		System.out.println(rd.nextInt(100)); // 0~99
		System.out.println(rd.nextInt(100)+1); // 1~100
		
		System.out.println(rd.nextInt(5)+11);  // 11~15
		
		System.out.println("--------------");
		
		// 1~100 ������ 5�� int[]�� ���
		
		int [] arr = new int [5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=rd.nextInt(100)+1;
		}
		
		for (int s : arr) {
			System.out.println(s);
		}
		

	}
}
