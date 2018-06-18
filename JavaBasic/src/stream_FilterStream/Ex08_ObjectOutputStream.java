package stream_FilterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex08_ObjectOutputStream {
	public static void main(String[] args) { 
		
File file = new File("./src/stream_FilterStream/ObjectTest");
		
		// 출력스트림 선언
		FileOutputStream fis = null;
		BufferedOutputStream bos = null;
		ObjectOutput oos = null;
		
		try {
			fis = new FileOutputStream(file);
			bos = new BufferedOutputStream(fis);
			oos = new ObjectOutputStream(bos);
			
			List list = new ArrayList<>();
			
			list.add( new Point(11,22));
			list.add( new Person("Alice", 23));
			list.add( new Point(111,222));
			list.add( new Person("JK", 26));
			list.add( new Point(1111,2222));
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(bos!=null) bos.close(); 
				if(fis!=null) fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
	}

}
