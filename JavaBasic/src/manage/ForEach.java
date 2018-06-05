package manage;

public class ForEach {
	public static void main(String[] args) {

		// for each
		//   배열의 모든 요소를 한번에 관리하게 편하게 해주는 반복문
		
		// for( 배열요소타입 변수명 : 배열명 ) {
		//
		//		배열의 모든 요소를 변수명에 한번씩 담아 코드 반복
		//
		// }

		int[] arr = {1, 2, 3, 4, 5};

		for(int num : arr) {	// 배열의 크기만큼 반복
			System.out.println(num);
		}
		
		// 지역변수: 메소드 안에서만 쓰이고 메소드가 종료되면 사라지는 변수
		// int num은 for문 안에서만 생성된 지역 변수
		// 원본과 다른 공간에 저장된다
		for(int num:arr) {
			num*=100;
		}

		// for each문은 주로 출력에 사용된다
		for(int num : arr) {	
			System.out.println(num);
		}

	}

}
