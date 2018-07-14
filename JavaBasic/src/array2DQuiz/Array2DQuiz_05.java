package array2DQuiz;

public class Array2DQuiz_05 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int cur = 1;
		int i=0;
		int j=0;
		int num=0;
	
		for(j=num; j<5; j++) {
			arr[i][j]=cur++;
		}		
		
		i=0;
		for(j=0; j<5; j++) {
			arr[j][i]=cur++;
		}
//		
//		i=4;
//		for(j=1; j<5; j++) {
//			arr[j][i]=cur++;
//		}
//		
//		i=4;
//		for(j=1; j<5; j++) {
//			arr[i][4-j]=cur++;
//		}
//		
//		i=0;
//		for(j=1; j<4; j++) {
//			arr[4-j][i]=cur++;
//		}
		
		for(i=0; i<5; i++ ) {
			for(j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
