package generics;

class Data<T> {
	T data;
}

class Class07<T>{
	Data<T> d;  // ������Ÿ�Ը��� T�� �����ϰ� �����ص� Ŭ���� �������� Ŭ���� Ÿ���� �����Եȴ�. 
}

public class GenericsEx_07_Member {
	
	public static void main(String[] args) {
		
		Class07<String> c07 = new Class07<>();
		
		c07.d = new Data<>();
		
	}

}
