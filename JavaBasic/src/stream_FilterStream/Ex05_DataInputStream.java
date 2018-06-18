package stream_FilterStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05_DataInputStream {
	public static void main(String[] args) {

		// 파일객체 선언
		File file = new File("./src/stream_FilterStream/DataTest");

		// 파일 입력스트림 객체선언
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			// 파일 입력스트림 개설
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis); 

			// 데이터형식 유지 
			int resInt = dis.readInt(); // int
			boolean resBoolean = dis.readBoolean(); // boolean
			char resChar = dis.readChar(); // char

			System.out.println("int: " + resInt);
			System.out.println("boolean: " + resBoolean);
			System.out.println("char: " + resChar); 

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
