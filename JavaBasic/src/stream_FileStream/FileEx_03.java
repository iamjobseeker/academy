package stream_FileStream;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		// 매개변수 1개 - 경로 + 파일
		File file1 = new File("D:/FileTest.txt");
		
		// 매개변수 2개 - 경로, 파일 
		File file2 = new File("D:/", "FileTest.txt");
		
		System.out.println(file1);
		System.out.println(file2);
		
		System.out.println("-------");
		
		// 폴더 생성하기
		File file3 = new File("D:/test/ttt");
		// 경로 마지막 단계만 생성해줌
		file3.mkdir();
		// 경로에 있는 중간 단계까지 생성해줌
		file3.mkdirs();
		
	}

}
