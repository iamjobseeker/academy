package exception;

import java.io.IOException;

public class ExceptionEx_08_Throw {		     // throws: main을 호출하면 예외를 발생시켜 해결을 강제함
										     // main을 호출하는 것은 JVM인데 해결못하고 멈춰버림
										     // 따라서 절대 사용하지 말것
	public static void main(String[] args) { //throws IOException {
				
//		System.err.println("error");
		
		// 만약 예외 발생하면 input값이 없으므로 초기화를 꼭 해주어야 한다
		int input = -1;
		try {
			// try구문 내 변수는 지역변수이다
			input = System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		System.out.println(input);
	
	// stream : IO device와 java를 연결해주는 통로
	// end of stream : 입력이 끝나거나 통로가 파괴됨. 이 때 -1을 반환함
		 
	}

}
