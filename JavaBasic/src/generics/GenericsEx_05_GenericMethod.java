package generics;

class Class05 {
	
	public <T> T out (T obj) {
		System.out.println("제네릭 메소드");
		System.out.println("데이터: " + obj);
		
		T data = obj;  // T타입의 지역변수 설정
		
		return obj; 
	}
	
	public <T> void display(Integer num) {
		
		T data = (T) num; // 인위적인 경우. 보통 매개변수를 T로 명시한다
		
	}
	
}


public class GenericsEx_05_GenericMethod {

	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		c05.out(123); // 메소드 호출시 데이터 타입T가 Integer로 자동 결정된다
		c05.out("A"); //  메소드 호출시 데이터 타입T가 String로 자동 결정된다
		
		c05.<Integer>out(777); // 명시적으로 데이터 타입T를 Integer로 결정 (데이터 안정성을 위해서)
//		c05.<Integer>out("Alice"); // String 전달 불가
		
		c05.display(8989); 
		
	}
}
