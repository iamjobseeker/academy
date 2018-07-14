package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		// 파일 객체를 선언
		File src = new File("D:/Source.txt");
		File dest = new File("./src/stream_FileStream/", "Dest");

		// 입출력스트림 객체 선언 
		FileInputStream fis = null;
		FileOutputStream fos = null;

		byte[] buf = new byte[1024]; // 버퍼
		int len = -1; // 입출력 길이(1회) - 버퍼가 1회 입출력한 데이터의 길이 
		int tot = 0;  // 총 입출력 길이  - 버퍼가 총 입출력한 데이터의 길이

		try {
			fis = new FileInputStream(src);  // throws FileNotFoundException 
			fos = new FileOutputStream(dest); 

					// 1024byte씩 buf에 반복 저장
			while( (len = fis.read(buf)) != -1 ) { // eof를 만날때까지 반복 
												   // throws IOException
				
				//  fos.write(buf);  버퍼에 남아있는 값으로 인해 마지막 출력때 문제 발생 
				fos.write(buf, 0, len);

				// 100byte가 파일에 있는 상황
				// 1. buf에 해당 데이터가 담기고 len=100이 된다
				// 2. write하면 100번재 데이터까지 출력된다 
			
				// 파일카피 총 길이
				tot += len;				
			} 
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 문제 발생");
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기
				// 만일 fis=null이라면 null.close()가 되어 에러
				if(fis!=null) fis.close(); 
				if(fos!=null) fos.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 파일 닫기 실패");
				e.printStackTrace();
			} 
		}

		System.out.println(tot+"바이트 복사 완료");
		System.out.println(" + + 프로그램 정상 종료 + + ");

	}

}
