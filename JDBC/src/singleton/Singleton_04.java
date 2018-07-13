package singleton;

public class Singleton_04 {
	
	// 1. 원래 내부 클래스는 미리 호출하지 않음
	private static class Singleton {
		private static final Singleton_04 instance
			= new Singleton_04();
	}

	private Singleton_04() { };
	
	// 2. 메소드에서 instance를 호출하면 
	//    해당 코드를 가지고 있는 내부 클래스를 호출함 
	public static Singleton_04 getInstance() {
		return Singleton.instance;
	}
}
