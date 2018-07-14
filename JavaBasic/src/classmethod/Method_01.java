package classmethod;

public class Method_01 {
	
	public void method01(){
		System.out.println("Hello World");
	}
	
	public void method02(int parameter) {
	System.out.println("전달인자 값: "+ parameter);
	}
	
	public void method03(int num, String str) {
		System.out.println("num: "+num+", str: "+str);
	}
	
//	public static void main(String[] args) {
//		
//		method03(3,"hello");
//	}
	
	public int rNum(){
		System.out.println("반환(return)이 존재하는 메소드");
		return 33;
	}
	
	public int add(int n1, int n2) { // 메소드 head, 정의부
		
		// 메소드 body, 구현부
		int result;
		result = n1 + n2;
		return result; 
	}
	
	// 뺄셈기능
	
	public static int minus(int num1, int num2) {
		
		return num1-num2;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(minus(56, 43));  // static으로 선언된 함수
//		System.out.println(add(1,3));  static으로 선언되지 않은 함수
		
		// main에 있는 메소드들은 static으로 선언해야 한다.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
