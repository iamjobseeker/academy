package exception;

public class ExceptionEx_03_try_Basic {
	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0;

		//	if(num2!=0) System.out.println(num1/num2);

		try {

			System.out.println(num1/num2);

		} catch(ArithmeticException e) {

			System.out.println(">> ���ܹ߻� <<");
			System.out.println(">> 0���� ������ �����ϴ� <<");
			System.out.println(">> �������� Ȯ���ϼ��� <<"); 

		}
		
		System.out.println("���α׷� ����");

	}
} 
