package generics;

// Generic�� �����غ���
// Number�� String, Integer, Double���� �θ� Ŭ������

public class GenericsEx_08_Extends {

	// ���� Ŭ�������� �޼ҵ带 ȣ���Ҷ��� static�� �ʿ��ϴ� 
	public static <T extends Number> void print(T t1) { // T�� Number Ŭ������ ��ӹ���
	
		System.out.println(t1);
		
	}
	
	public static void main(String[] args) {
		
		print(123);
		print(777.999); 
//		print("Apple"); // String�� Number Ŭ������ ��ӹ��� �����Ƿ� error!

	}
}
