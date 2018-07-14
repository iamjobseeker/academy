package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class CollectionEx_11_Map {
	
	public static void main(String[] args) {
		
		// HashMap�� ���� ����ȭó�� �Ǿ��ִ�
		Map map = new Hashtable();
		
		Properties prop = new Properties();
		
		try {
			prop.load(
					new FileReader( // ������ �ҷ��ͼ� prop�� ����
							"./src/collection/user.properties"));
			
			// DB�� ���� ID, pw��� ��
			System.out.println(prop);
			
			String user = prop.getProperty("username");
			System.out.println("USER: " + user);
			
			System.out.println("--------------");
			prop.setProperty("username", "hjk");
			// prop���� �����°��� �����ص� prop �⺻���� ������� �ʴ´�
			
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // ����ó�� ����
		
	}

}
