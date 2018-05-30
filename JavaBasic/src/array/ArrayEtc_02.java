package array;

import java.util.Arrays;

public class ArrayEtc_02 {

	public static void main(String[] args) {

		int[] arr= {4, 9, 2, 1, 3};
		// 1, 2, 3, 4, 9

		
		System.out.println("---정렬 전---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// API를 이용한 정렬
		Arrays.sort(arr);
		
		System.out.println("---정렬 후---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
