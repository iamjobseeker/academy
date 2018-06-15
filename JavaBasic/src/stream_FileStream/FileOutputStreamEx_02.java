package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/", "Result");
		
		byte[] buf = new byte[1024]; 
		buf[0] = 'A';
		buf[1] = 'B'; 
		
//		String str = "\n안녕"; 
//		byte [] buf = str.getBytes(); // 스트링 -> 바이트로 나누어줌 

		// 파일 출력스트림 선언
		FileOutputStream fos = null;

		try {
			// 파일이 없으면 생성해준다 
//			fos = new FileOutputStream(file);
			
			// 파일 생성이 아닌 추가모드 
			// true : 추가모드
			// false : 신규모드
			fos = new FileOutputStream(file, true); 

			// 파일 출력코드
//			fos.write(buf);
			// buf에서 문자가 존재하는 부분만 출력
			fos.write(buf, 0, buf.length);

		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일이 존재하지 않음");

		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 문제 발생"); 

		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 파일 닫기 실패"); 
			}
		}

		System.out.println(" + + 프로그램 정상 종료 + + ");


	}

}
