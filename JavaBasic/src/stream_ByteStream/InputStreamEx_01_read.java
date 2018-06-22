package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		
		// 키보드스트림 
		InputStream inpst; 
//		Q) Scanner input;
		
		// 키보드와 연결해주는 표준 입력스트림 
		inpst = System.in; 
//		Q) input = new Scanner(System.in);
		
		// 계속해서 들어오는 데이터를 처리하는데 적합
		// read가 데이터를 꺼내오면 버퍼의 데이터는 삭제된다 
		StringBuffer strbf = new StringBuffer();
		
		int in ; 
		System.out.println("입력대기중..."); 
	
		try {  
			     // 0~255사이의 바이트를 출력해준다
				 // 입력값이 없으면 -1 출력
			while((in = inpst.read()) != -1 ) {
			strbf.append( (char) in); // Q)char이면 한글자 입력만 처리? 
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inpst!=null) inpst.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}		
		// Ctrl + z == eof 
		// 1byte씩 받으므로 2byte인 한글은 깨지게된다 
		
		System.out.println("입력결과: " + strbf);
	}
}
