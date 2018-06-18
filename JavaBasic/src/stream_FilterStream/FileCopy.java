package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {

		// 파일 객체를 선언
		File src = new File("D:/Source.txt");
		File dest = new File("./src/stream_FilterStream/", "Dest");

		// 입출력스트림 객체 선언 
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		byte[] buf = new byte[1024]; 
		int len = -1; 
		int tot = 0;  

		try {
			fis = new FileInputStream(src); 
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(dest); 
			bos = new BufferedOutputStream(fos); 


			while( (len = bis.read(buf)) != -1 ) {
				bos.write(buf, 0, len);
				tot += len;				
				
				// 스트림에 남아있는 데이터를 fis로 보내주는 역할
				// close에 포함되어 있는 기능
				// bos.flush(); // 1 (while문 안에 있으면 데이터를 충분히 모으지 못하고 계속 보냄)
			} 
			
			bos.flush(); // 2 (마지막에 있으면 모든 데이터를 모아서 한번에 보냄)
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 문제 발생");
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null) bis.close();
				// close하면 스트림에 있는것을 다 내보낸다 
				if(bos!=null) bos.close();
				
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
