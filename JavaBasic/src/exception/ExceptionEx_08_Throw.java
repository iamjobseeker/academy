package exception;

import java.io.IOException;

public class ExceptionEx_08_Throw {		     // throws: main�� ȣ���ϸ� ���ܸ� �߻����� �ذ��� ������
										     // main�� ȣ���ϴ� ���� JVM�ε� �ذ���ϰ� �������
										     // ���� ���� ������� ����
	public static void main(String[] args) { //throws IOException {
				
//		System.err.println("error");
		
		// ���� ���� �߻��ϸ� input���� �����Ƿ� �ʱ�ȭ�� �� ���־�� �Ѵ�
		int input = -1;
		try {
			// try���� �� ������ ���������̴�
			input = System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		System.out.println(input);
	
	// stream : IO device�� java�� �������ִ� ���
	// end of stream : �Է��� �����ų� ��ΰ� �ı���. �� �� -1�� ��ȯ��
		 
	}

}
