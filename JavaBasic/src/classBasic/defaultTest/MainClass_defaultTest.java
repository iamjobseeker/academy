package classBasic.defaultTest;

import classBasic.ClassEx_03;

public class MainClass_defaultTest {
	public static void main(String[] args) {
		
		ClassEx_03 ce = new ClassEx_03();
	
		ce.setNum1(100);
//		ce.num4 = 100;

//		System.out.println( ce.num1 );  // private int num1 �̹Ƿ� ���ٺҰ�
//		System.out.println( ce.num2 );	// default: ���� ��Ű��
//		System.out.println( ce.num3 );	// protected: ���� ��Ű��
		System.out.println( ce.num4 );	// public
		
		
		
	}

}
