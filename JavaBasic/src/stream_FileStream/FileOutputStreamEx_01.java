package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/", "Result");
		
		// 파일 출력스트림 선언
		FileOutputStream fos = null;
		
		try {
			// 파일이 없으면 생성해준다 
			fos = new FileOutputStream(file);
			
			// IOException 처리 필수 
			// 프로그램 중심으로 생각해보면 프로그램에 데이터를 입력하는 것 
			fos.write(65);  // A 출력
			fos.write('C'); // 66 출력 
			// Result파일에 출력된다 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
		
	}

}
