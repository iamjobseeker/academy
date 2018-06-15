package stream_FileStream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// 절대 경로. 주소의 시작점은 드라이브
		File file = new File("D:\\workspace\\JavaBasic\\src\\stream_FileStream\\Hello"); 
		// 			==		 "D:/workspace/JavaBasic/src/stream_FileStream/Hello"
		// 	 				  \\(역슬러쉬 2개 ) = /(슬러쉬1개)
		
		// 상대 경로. 현재 경로부터 시작 
		// 이클립스 실행 기준 클래스 패스는 프로젝트(JavaBasic) 폴더임 
		//  ./src/stream_FileStream/Hello"

		System.out.println(file);  
		
		
		System.out.println(file.length()); // 파일 크기
		System.out.println(file.exists()); // 파일 존재여부 TF
		
		System.out.println("-------");
		
		// 하드디스크 파일은 모두 권한을 가지고 있다
		// 읽기 권한 - 자바에서 해당 파일을 읽을 수 있는가?
		System.out.println(file.canRead());
		// 쓰기 권한
		System.out.println(file.canWrite());
		// 실행 권한
		System.out.println(file.canExecute());
		
		System.out.println("-------"); 
	
		// Directory인가?
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		// file인가? 
		System.out.println(file.isFile());
		
		// escape sequence
		// escape character
		String str1 = "\t";
		String str2 = "\b";
		String str3 = "\r";
		
//		System.out.println("100\");  // \을 하나만 쓰면 오류가 난다
		System.out.println("100\\"); // \\을 두개 써야 \하나로 인식된다 
				
	}

}

