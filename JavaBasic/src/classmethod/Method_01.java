package classmethod;

public class Method_01 {
	
	public void method01(){
		System.out.println("Hello World");
	}
	
	public void method02(int parameter) {
	System.out.println("�������� ��: "+ parameter);
	}
	
	public void method03(int num, String str) {
		System.out.println("num: "+num+", str: "+str);
	}
	
//	public static void main(String[] args) {
//		
//		method03(3,"hello");
//	}
	
	public int rNum(){
		System.out.println("��ȯ(return)�� �����ϴ� �޼ҵ�");
		return 33;
	}
	
	public int add(int n1, int n2) { // �޼ҵ� head, ���Ǻ�
		
		// �޼ҵ� body, ������
		int result;
		result = n1 + n2;
		return result; 
	}
	
	// �������
	
	public static int minus(int num1, int num2) {
		
		return num1-num2;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(minus(56, 43));  // static���� ����� �Լ�
//		System.out.println(add(1,3));  static���� ������� ���� �Լ�
		
		// main�� �ִ� �޼ҵ���� static���� �����ؾ� �Ѵ�.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
