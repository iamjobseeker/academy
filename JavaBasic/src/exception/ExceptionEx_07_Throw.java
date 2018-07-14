package exception;

import java.io.IOException;

class ThrowEx {
	
	// str==null�̸� NullPointerException �߻��ȴ�
	public void print(String str, int cnt) {
		
		if(str == null) throw new NullPointerException();
		
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
}

public class ExceptionEx_07_Throw {
	public static void main(String[] args) { 
		
		ThrowEx thr = new ThrowEx();
		
		String str = null;
		
		try {
			thr.print(str, 3);
		} catch (NullPointerException e) {
			System.out.println("null�� ���ڿ��� �ԷµǾ���");
		}
		
		System.out.println("���α׷� ���� ����");
		

		
	}

}
