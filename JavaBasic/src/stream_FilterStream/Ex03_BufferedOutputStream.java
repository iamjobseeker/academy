package stream_FilterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {

		// 파일 객체 - 출력 대상
		File file = new File("./src/stream_FilterStream/Testoutput");

		// 파일 스트림 객체 선언 
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream(file); 
			bos = new BufferedOutputStream(fos); 

			bos.write("Orange".getBytes());
			
		} catch (IOException e) {
			System.out.println("입출력 문제 발생");
			e.printStackTrace();
		} finally {
			try { 
				if(bos != null) bos.close(); 
				if(fos != null) fos.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
