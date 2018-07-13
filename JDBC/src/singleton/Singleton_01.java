package singleton;

// 단점
// 1. 인스턴스화 하면서 추가작업 불가능 
// 2. 인스턴스를 사용하지 않더라도 생성해놓는다

public class Singleton_01 {
	
	public String data = "Apple"; // 데이터 변수 
	// 이 데이터를 사용하려면 본 클래스에 대한 객체를 생성해야 한다 
	
	private static Singleton_01 instance // 자기자신에 대한 객체를 instance로 저장 
		= new Singleton_01(); 
	
	public static Singleton_01 getInstance() {
		return instance;  // 누군가 필요로하면 반환해준다 	
						  // new로 다시 선언할 필요가 없어짐
	}
	
	private Singleton_01() { } // 외부에서 객체 생성 불가 
	
}
