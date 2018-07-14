package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class CollectionEx_11_Map {
	
	public static void main(String[] args) {
		
		// HashMap과 같고 동기화처리 되어있다
		Map map = new Hashtable();
		
		Properties prop = new Properties();
		
		try {
			prop.load(
					new FileReader( // 파일을 불러와서 prop에 저장
							"./src/collection/user.properties"));
			
			// DB에 대한 ID, pw기록 등
			System.out.println(prop);
			
			String user = prop.getProperty("username");
			System.out.println("USER: " + user);
			
			System.out.println("--------------");
			prop.setProperty("username", "hjk");
			// prop에서 가져온값을 변경해도 prop 기본값은 변경되지 않는다
			
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // 예외처리 구문
		
	}

}
