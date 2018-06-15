package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/Hello");	
		StringBuffer sb =  new StringBuffer();
		int in = -1;
		
		// 파일과 연결된 통로. 파일 -> 프로그램 
		FileInputStream fis = null;

		try {
			//FileInputStream의 생성자를 호출할때는 파일을 매개변수로 사용
			fis = new FileInputStream(file);
			
					// read메소드를 실행하면 
					// 통로를 통해 offset값을 꺼내온 다음 해당 문자의 ascii값을 반환한다
					// offset index는 계속해서 +1이 된다 
			while( ( in = fis.read() ) != -1 ){
				sb.append( (char) in );
			} 
			
			 // 호출한 파일이 존재하지 않는 예외 
			 // IOException의 자식클래스이므로 앞에 두어야 한다
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일 존재하지 않음");
			
			  // 입출력에 관한 모든 예외
		} catch (IOException e) {
			System.out.println("[ERROR] 입출력 문제 발생");

		} finally {
			try {
				// fis==null이라면 fis.close는 null.close와 같아진다
				// 따라서 fis가 파일 불러오기를 실패한다면 close할 필요도 없다 
				if(fis!=null) fis.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}

		System.out.println("=====읽어온 데이터=====");
		System.out.print(sb);
		System.out.println("====================");
		System.out.println(" + + 프로그램 정상 종료 + + "); 
		
		// 운영체제가 인식하는 주변 운영체제는 모두 파일형태 
		// 파일 -> 메모리 업로드
	}

}
