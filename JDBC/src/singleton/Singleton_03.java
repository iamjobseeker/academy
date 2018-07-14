package singleton;

public class Singleton_03 {
	private static Singleton_03 instance;
	
	// private 생성자
	private Singleton_03() { };
	
	// 인스턴스 반환 메소드
	// public static synchronized Singleton_03 getInstance() 
	// synchronized: 멀티 스레드가 instance == null에 걸리는 것을 막아준다
	// 				 하지만 추후를 위해 안 쓰는게 낫다
	public static Singleton_03 getInstance() { 
		// getInstance()를 처음 호출할 때까지 객체생성을 미룸
		// 두 번째 호출 이후부터는 이미 만들어진 객체를 반환 
		if ( instance == null ) {
			try {
			instance = new Singleton_03();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
}
