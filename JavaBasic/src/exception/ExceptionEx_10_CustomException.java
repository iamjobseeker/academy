package exception;

// ¦�� �ƴ� ��� ���� ó���ϴ�
// ���ο� exception�� �����Ͽ��� 
class EvenException extends Exception {
	
	@Override
	public String getMessage() {
		return "¦���� �ƴ� ���ڸ� �Է�����"; 
	}
}

class CheckEven {

	// Ȧ���� �Է��ϸ� ���� �߻� 
	public void check (int num) throws EvenException {
		
		if( num%2!=0) {  // Ȧ��
			throw new EvenException();
		}
		
		// ¦��
		System.out.println("¦���Դϴ�");
	} 
}

public class ExceptionEx_10_CustomException {
	public static void main(String[] args) {

		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13);
		} catch (EvenException e) {
			// ���뼺�� ������ �ȴ�  good point 
			System.out.println(e.getMessage()); 
			
//			System.out.println("Ȧ���� �Է���"); 
		}
	}
}

