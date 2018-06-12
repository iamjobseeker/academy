package generics;

// Generic을 제한해보자
// Number는 String, Integer, Double등의 부모 클래스임

public class GenericsEx_08_Extends {

	// 같은 클래스에서 메소드를 호출할때는 static이 필요하다 
	public static <T extends Number> void print(T t1) { // T가 Number 클래스를 상속받음
	
		System.out.println(t1);
		
	}
	
	public static void main(String[] args) {
		
		print(123);
		print(777.999); 
//		print("Apple"); // String은 Number 클래스를 상속받지 않으므로 error!

	}
}
