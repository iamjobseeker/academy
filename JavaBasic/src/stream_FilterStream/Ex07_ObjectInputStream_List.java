package stream_FilterStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex07_ObjectInputStream_List {
	public static void main(String[] args) {

		// ���� ��ü ����
		File file = new File(
				"./src/stream_FilterStream"
				, "ObjectTest");
		
		// �Է� ��Ʈ�� ����
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
		System.out.println("+ + + ���α׷� ���� ���� + + +");		
	}
}


