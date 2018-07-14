package array2D;

import java.util.Scanner;

public class Array2DEx_05 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int [3][];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Input size: ");
			int len = input.nextInt();
			
			arr[i] = new int[len];
		}
		
		
		System.out.println(arr);
		
	}

}
