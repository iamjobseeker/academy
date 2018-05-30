package classBasic.defaultTest;

import classBasic.ClassEx_03;

public class MainClass_defaultTest {
	public static void main(String[] args) {
		
		ClassEx_03 ce = new ClassEx_03();
	
		ce.setNum1(100);
//		ce.num4 = 100;

//		System.out.println( ce.num1 );  // private int num1 이므로 접근불가
//		System.out.println( ce.num2 );	// default: 같은 패키지
//		System.out.println( ce.num3 );	// protected: 같은 패키지
		System.out.println( ce.num4 );	// public
		
		
		
	}

}
