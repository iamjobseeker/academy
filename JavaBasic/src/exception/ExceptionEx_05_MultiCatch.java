package exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
		
		try {
			System.out.println("try���");
			
			    // �پ��� ������ Exception�� �ѹ��� �����ϰ� ���� �� 
		} catch (ArithmeticException | NullPointerException e) {
			
		}
		
	}

}
