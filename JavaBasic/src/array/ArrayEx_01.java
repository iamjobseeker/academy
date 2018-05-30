package array;

public class ArrayEx_01 {
	
	public static void main(String[] args) {
		
		// 배열= -> 변수의 묶음
		
		// int형 변수 선언
		int num;
		
		// int형 변수에 값 대입
		num = 123;
		
		System.out.println(num);
		
		// int형 배열변수 선언
		int[] arr;
		
		// int형 배열 생성
		arr=new int[5];
		
		// int형 배열 선언하며 생성하기
		int[] arr2=new int[100];
		
		// 배열 공간에 값 대입
		arr[0]=1;
		arr[1]=2;
		arr[4]=3;
		
		// 배열값 출력
		System.out.println(arr[1]);
		System.out.println(arr2[0]);
		
		// 배열변수 출력
		System.out.println(arr);
		
		
	}

}
