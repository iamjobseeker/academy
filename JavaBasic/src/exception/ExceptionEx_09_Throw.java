package exception;

import java.io.IOException;

class ThrowsEx{			// readChar함수를 호출하면 예외가 발생함
	public char readChar() throws IOException {

		// 'A'입력 -> 'A'반환
		return (char) System.in.read();
	}
}


public class ExceptionEx_09_Throw {
	public static void main(String[] args) {
		ThrowsEx thr = new ThrowsEx();

		// 예외처리 담당자의 변경
		// system.in.read() -> readChar() -> 호출하는 사람

		System.out.print("Input: ");
		try {
			System.out.println(thr.readChar());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
} 
