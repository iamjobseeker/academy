package classmethod;

				 //Executor
public class MethodEx_03 {
	
	public static void main(String[] args) {
		
		Method_03 m = new Method_03();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		m.mul10(arr);	// 배열의 모든 요소 10배
		m.print(arr);	// 배열의 모든 요소 출력
		
		int[] arr2 = {6, 7, 8, 9, 10};
		
		// 원본배열을 그대로 두고
		// 원본배열의 모든 요소의 10배를 가지는
		// 새로운 배열 반환
					
		int[] result = m.mul10_v2(arr2);
		
	}

}
