package generics;

class Data<T> {
	T data;
}

class Class07<T>{
	Data<T> d;  // 데이터타입명을 T로 동일하게 설정해도 클래스 독자적인 클래스 타입을 가지게된다. 
}

public class GenericsEx_07_Member {
	
	public static void main(String[] args) {
		
		Class07<String> c07 = new Class07<>();
		
		c07.d = new Data<>();
		
	}

}
