package array2D;

public class Array2DEx_04 {

	public static void main(String[] args) {

		int [][] arr = new int[3][];

		// ���� �迭
		arr[0] = new int[5];
		arr[1] = new int[8];
		arr[2] = new int[6];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
