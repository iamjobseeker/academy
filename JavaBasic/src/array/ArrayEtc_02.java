package array;

import java.util.Arrays;

public class ArrayEtc_02 {

	public static void main(String[] args) {

		int[] arr= {4, 9, 2, 1, 3};
		// 1, 2, 3, 4, 9

		
		System.out.println("---���� ��---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// API�� �̿��� ����
		Arrays.sort(arr);
		
		System.out.println("---���� ��---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
