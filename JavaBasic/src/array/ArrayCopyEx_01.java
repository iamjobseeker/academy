package array;

public class ArrayCopyEx_01 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2;
		
		// 얕은 복사 (shallow copy)
		// 참조값만 복사될 때
		
		arr2=arr1;
		
		System.out.println("-----수정 전-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		arr1[1] = 7777;
		
		System.out.println("-----수정 후-----");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
