package condition;

public class SwitchEx_03 {

	public static void main(String[] args) {

		char ch = 'B';
		switch(ch) {
		case 'Q':
			System.out.println("대문자 큐");
			break;

		case 'q':	// == 113 (아스키 코드)
			System.out.println("소문자 큐");
			break;

		case 'a':
			System.out.println("에이");
			break;

		case 'B':
			System.out.println("비");
			break;
		}
		
		// 어떤 값을 선택할때는 switch
		// switch에는 -범위 사용X
		//			 -정확한 값이 와야한다
		
		if(ch=='Q') {
			
		}else if(ch=='q') {
			
		}else if(ch=='A') {
			
		}else {
			System.out.println("적당한 문자없음");
		}
		
		// 어떤 값을 비교할때는 if
		
	
	}
}
