package stream_FileStream;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		// �Ű����� 1�� - ��� + ����
		File file1 = new File("D:/FileTest.txt");
		
		// �Ű����� 2�� - ���, ���� 
		File file2 = new File("D:/", "FileTest.txt");
		
		System.out.println(file1);
		System.out.println(file2);
		
		System.out.println("-------");
		
		// ���� �����ϱ�
		File file3 = new File("D:/test/ttt");
		// ��� ������ �ܰ踸 ��������
		file3.mkdir();
		// ��ο� �ִ� �߰� �ܰ���� ��������
		file3.mkdirs();
		
	}

}
