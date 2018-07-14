package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx_02_read {

	public static void main(String[] args) {

		InputStream is; 
		is=System.in;

		StringBuffer sb = new StringBuffer();

		byte [] buf = new byte [10];
		int len = -1;
		System.out.println("입력 대기중....."); 

		try {
			while( (len = is.read(buf)) != -1 ) {
				sb.append(new String (buf));
				Arrays.fill(buf, (byte) 0);
				System.out.println("입력 길이: " + len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null) 
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

		System.out.println("입력결과: " + sb);

	}

}
