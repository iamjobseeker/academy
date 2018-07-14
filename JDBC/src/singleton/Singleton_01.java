package singleton;

// ����
// 1. �ν��Ͻ�ȭ �ϸ鼭 �߰��۾� �Ұ��� 
// 2. �ν��Ͻ��� ������� �ʴ��� �����س��´�

public class Singleton_01 {
	
	public String data = "Apple"; // ������ ���� 
	// �� �����͸� ����Ϸ��� �� Ŭ������ ���� ��ü�� �����ؾ� �Ѵ� 
	
	private static Singleton_01 instance // �ڱ��ڽſ� ���� ��ü�� instance�� ���� 
		= new Singleton_01(); 
	
	public static Singleton_01 getInstance() {
		return instance;  // ������ �ʿ���ϸ� ��ȯ���ش� 	
						  // new�� �ٽ� ������ �ʿ䰡 ������
	}
	
	private Singleton_01() { } // �ܺο��� ��ü ���� �Ұ� 
	
}
