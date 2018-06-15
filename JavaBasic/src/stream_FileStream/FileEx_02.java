package stream_FileStream;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		// ���� ���. �ּ��� �������� ����̺�
		File file = new File("D:\\workspace\\JavaBasic\\src\\stream_FileStream\\Hello"); 
		// 			==		 "D:/workspace/JavaBasic/src/stream_FileStream/Hello"
		// 	 				  \\(�������� 2�� ) = /(������1��)
		
		// ��� ���. ���� ��κ��� ���� 
		// ��Ŭ���� ���� ���� Ŭ���� �н��� ������Ʈ(JavaBasic) ������ 
		//  ./src/stream_FileStream/Hello"

		System.out.println(file);  
		
		
		System.out.println(file.length()); // ���� ũ��
		System.out.println(file.exists()); // ���� ���翩�� TF
		
		System.out.println("-------");
		
		// �ϵ��ũ ������ ��� ������ ������ �ִ�
		// �б� ���� - �ڹٿ��� �ش� ������ ���� �� �ִ°�?
		System.out.println(file.canRead());
		// ���� ����
		System.out.println(file.canWrite());
		// ���� ����
		System.out.println(file.canExecute());
		
		System.out.println("-------"); 
	
		// Directory�ΰ�?
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
		// file�ΰ�? 
		System.out.println(file.isFile());
		
		// escape sequence
		// escape character
		String str1 = "\t";
		String str2 = "\b";
		String str3 = "\r";
		
//		System.out.println("100\");  // \�� �ϳ��� ���� ������ ����
		System.out.println("100\\"); // \\�� �ΰ� ��� \�ϳ��� �νĵȴ� 
				
	}

}

