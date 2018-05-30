package array;

public class ArrayCopyEx_02 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};  // Source
		int[] arr2;  // Destination
		
		// 깊은 복사 (deep copy)
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		
		// 1. Destination에 공간 확보
		//		new사용해서 새로운 공간할당
		
//		arr2=new int[3];
		arr2=new int[arr1.length];
		
		// 2. for문 이용해서 내용물 (모든 요소) 복사

		for(int i=0; i<arr2.length; i++) {
			arr2[i]=arr1[i];
		}
			
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
