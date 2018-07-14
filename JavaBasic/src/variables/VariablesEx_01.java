package variables;

// 변수 테스트1
public class VariablesEx_01 {

//	메인메소드 - 프로그램 시작점
	public static void main(String[] args) {
	
		int num;  //int형 변수 num 선언
//		4바이트 공간
//		정수를 저장할 수 있음
		
		num=123; //123데이터 대입
		//변수명은 일반적으로 소문자로 쓴다
		
		System.out.println(num); //num변수 출력
		
		System.out.println(num+111); //덧셈결과 출력
		
		num=55; //55 대입
		
		System.out.println(num);
		
	}
	
}

/*
 * 자바가 인식할 때:variables.VariablesEx_01 
 * 패키지.클래스
 */