package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		File filein = new File("D:/Source.txt");
		File fileout = new File("./src/stream_FileStream/", "Dest");

		FileInputStream fis = null;
		FileOutputStream fos = null;

		StringBuffer sb = new StringBuffer();
		byte[] buf = new byte[1024]; 
		int len = -1;

		try {
			fis = new FileInputStream(filein);
			while( (len = fis.read(buf)) != -1 ) {
				fos.write(buf); 
				//sb.append(new String (buf, 0, len) );
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 문제 발생");
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				System.out.println("[ERROR] 입출력 문제 발생");
				e.printStackTrace();
			} 
		}


		System.out.println(" + + 프로그램 정상 종료 + + ");

	}

}

