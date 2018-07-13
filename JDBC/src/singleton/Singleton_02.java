package singleton;

// 인스턴스 생성 시 추가작업 할 수 있도록 static 블록 적용 

public class Singleton_02 {
	
	private Singleton_02() { } // 외부에서 객체생성 불가능 
	
	private static Singleton_02 instance;
	
	// static 초기화 블록 - 클래스 변수 초기화 
	// 클래스가 초기 정의될 때 수행되는 코드 
	// 싱글톤의 단점 극복
	// 추가작업(try-catch)가능 
	static {
		try {
		instance = new Singleton_02();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	// 인스턴스 반환 메소드
	public static Singleton_02 getInstance() {
		return instance;
	} 
	
}
