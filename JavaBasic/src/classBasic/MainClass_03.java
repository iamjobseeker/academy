package classBasic;

public class MainClass_03 {
	
	public static void main(String[] args) {
		
		ClassEx_03 ce = new ClassEx_03();
//		System.out.println( ce.num1 );  // private int num1 이므로 접근불가
		System.out.println( ce.num2 );	// default
		System.out.println( ce.num3 );	// protected
		System.out.println( ce.num4 );	// public
		
		
	}
	
	

}
