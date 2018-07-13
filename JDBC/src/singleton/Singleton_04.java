package singleton;

public class Singleton_04 {
	
	// 1. ���� ���� Ŭ������ �̸� ȣ������ ����
	private static class Singleton {
		private static final Singleton_04 instance
			= new Singleton_04();
	}

	private Singleton_04() { };
	
	// 2. �޼ҵ忡�� instance�� ȣ���ϸ� 
	//    �ش� �ڵ带 ������ �ִ� ���� Ŭ������ ȣ���� 
	public static Singleton_04 getInstance() {
		return Singleton.instance;
	}
}
