package exception;

public class ExceptionEx_06_Throw {
	public static void main(String[] args) {
		
		// ���� �߻���Ű�� 
		
		// throw�� ����Ͽ� NullPointerException��ü�� �����
		// ���ܰ� �����߻��ϰ� �� 
//		throw new NullPointerException();
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			System.out.println("�������� ���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("��� ����ó��");
		} finally {
			System.out.println("������ ����Ǵ� �ڵ�");
		} 
		
		System.out.println(" + + ���α׷� ���� ���� + + ");
	} 

}
