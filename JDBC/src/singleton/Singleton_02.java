package singleton;

// �ν��Ͻ� ���� �� �߰��۾� �� �� �ֵ��� static ��� ���� 

public class Singleton_02 {
	
	private Singleton_02() { } // �ܺο��� ��ü���� �Ұ��� 
	
	private static Singleton_02 instance;
	
	// static �ʱ�ȭ ��� - Ŭ���� ���� �ʱ�ȭ 
	// Ŭ������ �ʱ� ���ǵ� �� ����Ǵ� �ڵ� 
	// �̱����� ���� �غ�
	// �߰��۾�(try-catch)���� 
	static {
		try {
		instance = new Singleton_02();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	// �ν��Ͻ� ��ȯ �޼ҵ�
	public static Singleton_02 getInstance() {
		return instance;
	} 
	
}
