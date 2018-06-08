package apiTest;

import java.util.Random;

// Random은 java.util에 속하는 클래스로 import하여 사용하여야 한다
// Ctrl + Shift + O

public class RandomEx {
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		System.out.println(rd.nextInt());  // int형 범위에서 랜덤 생성
		System.out.println(rd.nextDouble());  // math.random과 같음
		System.out.println(rd.nextBoolean());
		
		System.out.println("--------------");
		
		System.out.println(rd.nextInt(10));  // 0~9
		System.out.println(rd.nextInt(100)); // 0~99
		System.out.println(rd.nextInt(100)+1); // 1~100
		
		System.out.println(rd.nextInt(5)+11);  // 11~15
		
		System.out.println("--------------");
		
		// 1~100 난수를 5개 int[]에 담기
		
		int [] arr = new int [5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=rd.nextInt(100)+1;
		}
		
		for (int s : arr) {
			System.out.println(s);
		}
		

	}
}
