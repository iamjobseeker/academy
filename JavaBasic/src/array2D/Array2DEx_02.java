package array2D;

public class Array2DEx_02 {
	
	public static void main(String[] args) {
		
		// 1차원 배열 초기화
		int[] arr1d = {1,2,3,4,5};   
		// arr1d new int[5];
		
		int[][] arr2d= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();  // 한 행마다 줄바꿈
		}
		
		
		
		
	}

}
