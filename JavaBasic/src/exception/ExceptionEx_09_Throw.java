package exception;

import java.io.IOException;

class ThrowsEx{			// readChar�Լ��� ȣ���ϸ� ���ܰ� �߻���
	public char readChar() throws IOException {

		// 'A'�Է� -> 'A'��ȯ
		return (char) System.in.read();
	}
}


public class ExceptionEx_09_Throw {
	public static void main(String[] args) {
		ThrowsEx thr = new ThrowsEx();

		// ����ó�� ������� ����
		// system.in.read() -> readChar() -> ȣ���ϴ� ���

		System.out.print("Input: ");
		try {
			System.out.println(thr.readChar());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
} 
