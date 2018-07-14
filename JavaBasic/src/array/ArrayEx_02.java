package array;

public class ArrayEx_02 {

	public static void main(String[] args) {

		// 변수의 선언과 동시에 초기화
//		int num = 123;

		// 배열의 선언과 동시에 초기화
		int[] arr= {1,2,3,4,5};

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// 모든 요소 대입
		
		System.out.println("\n---------------");
		
		for (int j=0;j<arr.length;j++) {
			arr[j]=(j+1)*10;
			System.out.print(arr[j]+" ");
		}
		
		
		
		
		
	

	}

}


