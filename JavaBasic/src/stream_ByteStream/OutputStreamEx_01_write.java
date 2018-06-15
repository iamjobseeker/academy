package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_01_write {
	public static void main(String[] args) {
		
		OutputStream os;	
		os = System.out; //PrintStream을 OutputStream에 대입 (얕은 복사)
		
//		os.println();  // 불가능
		
		try {
			os.write(97);  // 'write' throws IOException
			os.write(98); 
			os.write(99);
			os.write(10);  // 10==개행문자
			
			os.write('a');  // 자바는 'char'형태를 숫자로 인식한다
			os.write('b');  // 위의 아스키 코드와 같은 결과 
			os.write('c');
			os.write('\n');
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os != null) os.close(); // 출력을 닫음
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
		}
		
		System.out.println(" + + 프로그램 정상 종료 + +");
		
	}

}
