package array2D;

public class Array2DEx_06 {
	
	public static void main(String[] args) {
		
		int[] arr = new int [5];
		
		arr[0]=10;
		arr[1]=20;
		
		arr = new int[3];	// 이전 int[5] 메모리는 GC가 해제함 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print
			(arr[i]+" ");
		}
		
	}

}
