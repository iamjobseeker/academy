package exception;

import java.util.Scanner;

public class ExceptionEx_04_try_Basic {
	public static void main(String[] args) {
		
		try {
			// try block
			// ���� �߻��� ����Ǵ� �ڵ�
			
			    // ���� ����1
		} catch (ArithmeticException e) {
			// ArithmeticException �� �ڽ�Ŭ���� ó���ڵ�
			
			   // ���� ����2
		}catch (NullPointerException e) {
			// NullPointerException �� �ڽ�Ŭ���� ó���ڵ�
			
		}
		      // ���� ����3 (���� ����ó��) 
		catch(Exception e) {
			// ArithmeticException ��
			// NullPointerException ������ ���ܸ� ó��
			
		} finally {
			// ���� �߻����ο� ������� ����Ǵ� �ڵ�
			
			// try���� ����� �ڿ� ����
		}
		
		Scanner input = new Scanner(System.in);
		
		input.close(); // Scanner ���� �ڵ� 
		
		System.out.println("����ó������ �ܺ�"); 
	
	}

}
