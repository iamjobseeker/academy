package exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println("try블록");
			
			    // 다양한 종류의 Exception에 한번에 대응하고 싶을 때 
		} catch (ArithmeticException | NullPointerException e) {
			
		}
		
	}

}
