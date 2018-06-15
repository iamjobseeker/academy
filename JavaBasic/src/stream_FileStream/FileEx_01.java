package stream_FileStream;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// File Class 
		// �ϵ��ũ�� ���� ������ �ٷ�� Ŭ����
		
		File file = new File("D:/FileTest.txt");
		
		// ��ü�� println�ϸ� ��ü���� �ڵ����� toString�� �����
		// �����ڿ� �־��� ����(���� ���)�� toString��
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
		
		
		
		
		



	}
}
