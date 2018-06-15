package stream_FileStream;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// File Class 
		// 하드디스크내 파일 정보를 다루는 클래스
		
		File file = new File("D:/FileTest.txt");
		
		// 객체를 println하면 객체에서 자동으로 toString이 실행됨
		// 생성자에 넣었던 내용(파일 경로)이 toString됨
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
		
		
		
		
		



	}
}
