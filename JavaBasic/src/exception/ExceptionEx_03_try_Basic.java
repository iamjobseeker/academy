package exception;

public class ExceptionEx_03_try_Basic {
	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0;

		//	if(num2!=0) System.out.println(num1/num2);

		try {

			System.out.println(num1/num2);

		} catch(ArithmeticException e) {

			System.out.println(">> 예외발생 <<");
			System.out.println(">> 0으로 나눌수 없습니다 <<");
			System.out.println(">> 나눔수를 확인하세요 <<"); 

		}
		
		System.out.println("프로그램 종료");

	}
} 
