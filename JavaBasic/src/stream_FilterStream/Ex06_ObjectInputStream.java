package stream_FilterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex06_ObjectInputStream {
	public static void main(String[] args) {

		File file = new File("./src/stream_FilterStream/ObjectTest");

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			// 파일에 있는 데이터의 타입을 알 수 없으므로 object로 받기로 한다
			Point p1 = (Point) ois.readObject(); // 강제형변환
			System.out.println(p1);
			
			System.out.println(ois.readObject() );
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		
		System.out.println(" + + 프로그램 정상종료 + + ");

	}

}
