package stream_FilterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial") // 워닝 무시하기

public class Ex07_ObjectOutputStream_List  {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FilterStream/ObjectTest");
		
		// 출력스트림 선언
		FileOutputStream fis = null;
		ObjectOutput oos = null;
		
		try {
			fis = new FileOutputStream(file);
			oos = new ObjectOutputStream(fis);
			
			List<Point> list = new ArrayList<>();
			
			list.add( new Point(11,22));
			list.add( new Point(111,222));
			list.add(new Point(1111,2222));
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(fis!=null) fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + 프로그램 정상 종료 + + ");

	}
}
