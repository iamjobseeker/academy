package generics;

class Class05 {
	
	public <T> T out (T obj) {
		System.out.println("���׸� �޼ҵ�");
		System.out.println("������: " + obj);
		
		T data = obj;  // TŸ���� �������� ����
		
		return obj; 
	}
	
	public <T> void display(Integer num) {
		
		T data = (T) num; // �������� ���. ���� �Ű������� T�� ����Ѵ�
		
	}
	
}


public class GenericsEx_05_GenericMethod {

	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		c05.out(123); // �޼ҵ� ȣ��� ������ Ÿ��T�� Integer�� �ڵ� �����ȴ�
		c05.out("A"); //  �޼ҵ� ȣ��� ������ Ÿ��T�� String�� �ڵ� �����ȴ�
		
		c05.<Integer>out(777); // ��������� ������ Ÿ��T�� Integer�� ���� (������ �������� ���ؼ�)
//		c05.<Integer>out("Alice"); // String ���� �Ұ�
		
		c05.display(8989); 
		
	}
}
