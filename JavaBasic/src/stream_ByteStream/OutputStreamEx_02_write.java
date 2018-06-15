package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02_write {
	public static void main(String[] args) {
		
		
		OutputStream os;	
		os = System.out; 

		byte [] buf = new byte[1024];
		
		buf[0] = 65; // 'A'
		buf[1] = 66; // 'B'
		buf[2] = 67; // 'C'
		buf[3] = 10; // '\n' 
		
		buf[4] = 'H';  // 72
		buf[5] = 'i';  // 105
		buf[6] = '\n';  // 10
		
		// int -> byte
		// char -> int -> byte 
		// 자동형변환이 일어난다 
		
		System.out.println("길이: " + buf.length);
		
		try {
			os.write(buf);  // 1024 공간이 모두 출력된다 			
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
