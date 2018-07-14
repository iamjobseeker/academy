package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex02_BufferedInputStream {
	public static void main(String[] args) {

		// 파일 객체
		File file = new File("./src/stream_FilterStream/Test");

		// 파일 입력 스트림 객체 선언
		// 1차 스트림(file-fis-program)
		FileInputStream fis = null;
		// 2차 스트림(fis-bis-program)
		BufferedInputStream bis = null;

		byte[] buf = new byte[1024];
		int len = -1;
		
		try {
			// bis사용하는 이유
			// 파일을 하나씩 꺼낸다
			fis = new FileInputStream(file);
			// 파일을 한꺼번에 꺼낸다
			// 하드웨어적으로 효율적
			bis = new BufferedInputStream(fis); 
			
			// 버프는 임시저장소
			// bis를 사용해서 성능이 개선됨
			while((len = bis.read(buf)) != -1) {
				
				// new String(buf, 0, len) 대신 trim : 공백문자를 제거한다는 의미
				System.out.println( new String (buf).trim() );
									
				// 공백부분을 0으로 채워준다 
				Arrays.fill(buf, (byte)0 ); 
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 문제 발생");
			e.printStackTrace();
		} finally {
			// bis는 fis에 의존적
			// fis를 close하면 bis는 자동으로 종료된다
			try {
				if(bis!=null) bis.close();
				if(bis!=null) fis.close();
			} catch (IOException e) {
				System.out.println("파일 종료 문제 발생");
				e.printStackTrace();
			}

		}
		
		// 파일이 없을때, 파일 크기가 클때/작을때 

	}

}


