package exception;

import java.util.Scanner;

public class ExceptionEx_04_try_Basic {
	public static void main(String[] args) {
		
		try {
			// try block
			// 예외 발생이 예상되는 코드
			
			    // 예외 종류1
		} catch (ArithmeticException e) {
			// ArithmeticException 및 자식클래스 처리코드
			
			   // 예외 종류2
		}catch (NullPointerException e) {
			// NullPointerException 및 자식클래스 처리코드
			
		}
		      // 예외 종류3 (상세한 예외처리) 
		catch(Exception e) {
			// ArithmeticException 및
			// NullPointerException 제외한 예외를 처리
			
		} finally {
			// 예외 발생여부에 관계없이 실행되는 코드
			
			// try에서 사용한 자원 해제
		}
		
		Scanner input = new Scanner(System.in);
		
		input.close(); // Scanner 해제 코드 
		
		System.out.println("예외처리구문 외부"); 
	
	}

}
