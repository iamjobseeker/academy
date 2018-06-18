package stream_FilterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex07_ObjectInputStream_List {
	public static void main(String[] args) {

		// 파일 객체 생성
		File file = new File(
				"./src/stream_FilterStream"
				, "ObjectTest");
		
		// 입력 스트림 선언
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			List list = (List) ois.readObject();
			
			System.out.println(list);
			
		} catch (FileNotFoundException e) {	e.printStackTrace();
		} catch (IOException e) {	e.printStackTrace();
		} catch (ClassNotFoundException e) {	e.printStackTrace();
		} finally {
			try {
				if(ois!=null)	ois.close();
				if(fis!=null)	fis.close();
			} catch (IOException e) {	e.printStackTrace();
			}
		}
		System.out.println("+ + + 프로그램 정상 종료 + + +");		
	}
}


