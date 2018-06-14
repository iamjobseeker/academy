package exception;

public class ExceptionEx_06_Throw {
	public static void main(String[] args) {
		
		// 예외 발생시키기 
		
		// throw를 사용하여 NullPointerException객체를 만들면
		// 예외가 강제발생하게 됨 
//		throw new NullPointerException();
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("널포인터 참조 예외 발생");
		} catch (Exception e) {
			System.out.println("모든 예외처리");
		} finally {
			System.out.println("무조건 실행되는 코드");
		} 
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
	} 

}
