package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03_write {
	public static void main(String[] args) {
		
		
		OutputStream os;	
		os = System.out; 

		byte [] buf = new byte[1024];
		
		int len=0;
		
		buf[len++] = 65; // 'A'
		buf[len++] = 66; // 'B'
		buf[len++] = 67; // 'C'
		buf[len++] = 10; // '\n' 
		
		buf[len++] = 'H';  // 72
		buf[len++] = 'i';  // 105
		buf[len++] = '\n';  // 10
		
		// int -> byte
		// char -> int -> byte 
		// 자동형변환이 일어난다 
		
		System.out.println("길이: " + buf.length);
		
		try {
			os.write(buf, 0, len);	// 출력문자 길이 지정		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os != null) os.close(); // 출력을 닫음
//			} catch (IOException e) {
//				e.printStackTrace();
//			} 
		}
		
		// buf에 채워지지 않은 공간은 0(공백문자)으로 인식하고 공백으로 출력된다 
		System.out.println(" + + 프로그램 정상 종료 + +");
		
	}

}
