package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial") // 워닝 무시하기

public class Ex08_ObjectInputStream_List implements Serializable { 


	public static void main(String[] args) {

		File file = new File("./src/stream_FilterStream/ObjectTest");

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			List list = (List) ois.readObject();
			System.out.println(list);
			System.out.println("-------");

			for(int i=0; i<list.size(); i++) {

				if(list.get(i) instanceof Person) {
					// Person 클래스 객체(인스턴스)
					System.out.println(((Person) list.get(i)).getName());
				} else if(list.get(i) instanceof Point) {
					// Point 클래스 객체(인스턴스)
					System.out.println(((Point) list.get(i)).getY());
				}
			}

			list.add( new Point(11,22));
			list.add( new Person("Alice", 23));
			list.add( new Point(111,222));
			list.add( new Person("JK", 26));
			list.add( new Point(1111,2222));

		} catch (FileNotFoundException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
				if(fis!=null) fis.close(); 
			} catch (IOException e) { e.printStackTrace();
			}
		}

		System.out.println(" + + 프로그램 정상종료 + + ");
	}
}
