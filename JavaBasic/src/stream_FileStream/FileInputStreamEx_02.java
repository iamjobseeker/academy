package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {

		File file = new File("./src/stream_FileStream/Hello");	
		StringBuffer sb =  new StringBuffer();
		
		// 한번에 읽어들여 저장하는 배열 
		byte[] buf = new byte[1024];
		
		int len = -1; // 읽어들인 바이트 수 
		int total = 0; // 총 읽어들인 바이트 수 
		
		// 파일과 연결된 통로. 파일 -> 프로그램 
		// 파일 입력 스트림 객체 선언
		// try 구문 안에서 객체를 생성하기 때문에
		// 객체 생성 실패(초기값 못 가짐)를 고려해서 초기화해준다 
		FileInputStream fis = null; 

		try {
			//FileInputStream의 생성자를 호출할때는 파일을 매개변수로 사용
			fis = new FileInputStream(file);
			
						// buf라는 배열에 존재하는 모든 데이터를 한번에 읽어들어온다
						// 효율적인 코드 
						// len은 해당 배열의 길이가 된다 
			while( ( len = fis.read(buf) ) != -1 ){ 
				
				// buf 배열 초기화 방법 :1
				sb.append( new String (buf, 0, len) ); // byte를 문자열로 변환 
				System.out.println("읽은 바이트 수: " + len);
				total += len; 
				
				// buf 배열 초기화 방법 :2
				Arrays.fill(buf, (byte) 0); 
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
				if(fis!=null) fis.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println("=====읽어온 총 바이트 수=====");
		System.out.println(total + "Bytes");
		System.out.println("=====읽어온 데이터=====");
		System.out.println(sb);
		System.out.println("====================");
		System.out.println(" + + 프로그램 정상 종료 + + "); 
		
		// 운영체제가 인식하는 주변 운영체제는 모두 파일형태 
		
	}

}
